public class P8c {
    public static void main(String[] args) {
        int n = 3; 
        int plusCount = 5; 
        printDiamond(n, 1);
        printPlusSigns(plusCount, 0);
    }

    static void printDiamond(int n, int currentRow) {
        if (currentRow > n) {
            printLowerDiamond(n - 1, 1);
            return;
        }
        printSpaces(n - currentRow);
        printChars('*', 2 * currentRow - 1);
        System.out.println();
        printDiamond(n, currentRow + 1);
    }

    static void printLowerDiamond(int n, int currentRow) {
        if (n == 0) {
            return;
        }
        printSpaces(currentRow);
        printChars('*', 2 * n - 1);
        System.out.println();
        printLowerDiamond(n - 1, currentRow + 1);
    }

    static void printPlusSigns(int count, int currentCount) {
        if (currentCount == count) {
            return;
        }
        printSpaces(2); 
        System.out.println("+");
        printPlusSigns(count, currentCount + 1);
    }

    static void printSpaces(int count) {
        if (count == 0) {
            return;
        }
        System.out.print(" ");
        printSpaces(count - 1);
    }

    static void printChars(char ch, int count) {
        if (count == 0) {
            return;
        }
        System.out.print(ch);
        printChars(ch, count - 1);
    }
}

