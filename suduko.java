import java.util.*;

class Sudoku {
    public int level;
    public static final String COMPANY = "BHD_BROTHERS";
    private final int size;
    private final int difficultyPercent;
    private int[][] ans;
    private int[][] missingValueArray;
    private int[][] finalAns;
    private boolean isLevelPassed = false;
    private static final int SPACE_SIZE = 0; // Adjust for left alignment

    // Constructor
    public Sudoku(int level) {
        this.level = level;
        this.size = calculateSize(level);
        this.difficultyPercent = level * 10;
        this.ans = new int[size][size];
        this.finalAns = new int[size][size];
    }

    // Entry point
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sudoku game = new Sudoku(1);

        System.out.println("\n\n!!!!! WELCOME TO GAME !!!!!\n");
        game.generateNewGrid();

        while (true) {
            System.out.println("=== Sudoku Game Menu ===");
            System.out.println("1. Enter Sudoku Data");
            System.out.println("2. Show Answer");
            System.out.println("3. Exit");
            if (game.isLevelPassed)
                System.out.println("4. Move to Next Level");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> game.takeUserInput();
                case 2 -> {
                    System.out.println("Correct answer is:\n");
                    game.showFinalAnswer();
                    System.out.println("Generating new puzzle for same level...");
                    game.generateNewGrid();
                }
                case 3 -> {
                    System.out.println("Exiting... Thank you for playing!");
                    return;
                }
                case 4 -> {
                    if (game.isLevelPassed) {
                        game = new Sudoku(game.level + 1);
                        game.generateNewGrid();
                    } else {
                        System.out.println("You must pass the current level first.");
                    }
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }

    // === Grid Generation ===
    private void generateNewGrid() {
        this.finalAns = generateCompleteGrid();
        this.missingValueArray = generateMissingValuePattern(getMissingValueCount(), size);
        prepareUserGrid();
        displayGrid(ans);
    }

    private int calculateSize(int level) {
        return level + 2; // Size increases with level
    }

    private int getMissingValueCount() {
        return (int) Math.ceil(size * difficultyPercent / 100.0);
    }

    private void prepareUserGrid() {
        this.ans = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                ans[i][j] = isCellMissing(i, j) ? 0 : finalAns[i][j];
            }
        }
    }

    private boolean isCellMissing(int i, int j) {
        if (missingValueArray == null || i >= missingValueArray.length || missingValueArray[i] == null) return false;
        for (int col : missingValueArray[i]) {
            if (col == j) return true;
        }
        return false;
    }

    private int[][] generateCompleteGrid() {
        int[][] grid = new int[size][size];
        for (int i = 0; i < size; i++) grid[0][i] = i + 1;
        for (int i = 0; i < size; i++) {
            int val = grid[0][i];
            for (int j = 0; j < size; j++) {
                val++;
                if (val > size) val = 1;
                grid[j][i] = val;
            }
        }
        return grid;
    }

    private int[][] generateMissingValuePattern(int width, int length) {
        int[][] pattern = new int[length][];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            Set<Integer> indices = new HashSet<>();
            while (indices.size() < Math.min(width, size)) {
                indices.add(rand.nextInt(size));
            }
            pattern[i] = indices.stream().mapToInt(Integer::intValue).toArray();
        }
        return pattern;
    }

    // === Display ===
    private void displayGrid(int[][] grid) {
        char h = '\u2550', v = '\u2551';
        char tl = '\u2554', tm = '\u2566', tr = '\u2557';
        char ml = '\u2560', mm = '\u256C', mr = '\u2563';
        char bl = '\u255A', bm = '\u2569', br = '\u255D';

        // Top
        System.out.print(tl);
        for (int col = 1; col < size; col++) System.out.print(String.valueOf(h).repeat(3) + tm);
        System.out.println(String.valueOf(h).repeat(3) + tr);

        // Rows
        for (int i = 0; i < size; i++) {
            System.out.print(v);
            for (int j = 0; j < size; j++) {
                int val = grid[i][j];
                System.out.print(val == 0 ? "   " : String.format(" %-2d", val));
                System.out.print(v);
            }
            System.out.println();
            if (i < size - 1) {
                System.out.print(ml);
                for (int col = 1; col < size; col++) System.out.print(String.valueOf(h).repeat(3) + mm);
                System.out.println(String.valueOf(h).repeat(3) + mr);
            }
        }

        // Bottom
        System.out.print(bl);
        for (int col = 1; col < size; col++) System.out.print(String.valueOf(h).repeat(3) + bm);
        System.out.println(String.valueOf(h).repeat(3) + br);
    }

    private void showFinalAnswer() {
        displayGrid(finalAns);
    }

    // === User Input ===
    private void takeUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sudoku numbers:");

        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                if (isCellMissing(i, j)) {
                    while (true) {
                        System.out.print("Row " + (i + 1) + ", Col " + (j + 1) + ": ");
                        if (scanner.hasNextInt()) {
                            int num = scanner.nextInt();
                            if (num >= 1 && num <= size) {
                                ans[i][j] = num;
                                break;
                            } else {
                                System.out.println("Enter a number between 1 and " + size);
                            }
                        } else {
                            System.out.println("Invalid input! Try again.");
                            scanner.next();
                        }
                    }
                }

        System.out.println("Your Current Answer:");
        displayGrid(ans);

        while (true) {
            System.out.println("=== Submission Menu ===");
            System.out.println("1. Re-enter Sudoku");
            System.out.println("2. Submit Answer");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                takeUserInput();
                return;
            } else if (choice == 2) {
                System.out.println("Submitting answer...");
                checkAnswer();
                return;
            } else {
                System.out.println("Invalid option! Try again.");
            }
        }
    }

    // === Validation ===
    private void checkAnswer() {
        if (Arrays.deepEquals(ans, finalAns)) {
            isLevelPassed = true;
            System.out.println("Congratulations! Your answer is correct.");
        } else {
            System.out.println("Incorrect answer. Please try again.");
        }
    }
}
