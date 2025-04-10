public class P8b {
    public static void main(String[] args) {
        int size = 3; // Number of rows for the triangles
        printPattern(size);
    }

    static void printPattern(int size) {
        printAsteriskTriangle(size);
        printPlusLine(4);
        printSlashTriangle(size);
    }

    static void printAsteriskTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printCharacters('*', i);
            System.out.println();
        }
    }

    static void printPlusLine(int count) {
        printCharacters('+', count);
        System.out.println();
    }

    static void printSlashTriangle(int size) {
        for (int i = size; i >= 1; i--) {
            printSpaces(size - i);
            printCharacters('/', i);
            System.out.println();
        }
    }

    static void printSpaces(int count) {
        printCharacters(' ', count);
    }

    static void printCharacters(char ch, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(ch);
        }
    }
}

