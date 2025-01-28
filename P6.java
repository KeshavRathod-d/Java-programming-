public class P6 {


    static void displayPattern1(int Size) {

        for (int line = 1; line <= Size; line++) {

            for (int space = Size - line; space > 0; space--) {
                System.out.print(" ");
            }

            for (int star = 1; star <= 2 * line - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int line = Size - 1; line >= 1; line--) {

            for (int space = Size; space > line; space--) {
                System.out.print(" ");
            }

            for (int star = 1; star <= 2 * line - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void displayPattern2(int Size) {

        for (int line = 1; line <= Size; line++) {

            for (int space = Size - line; space > 0; space--) {
                System.out.print(" ");
            }

            for (int star = 1; star <= 2 * line - 1; star++) {
                if (star % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


        for (int line = Size - 1; line >= 1; line--) {

            for (int space = Size; space > line; space--) {
                System.out.print(" ");
            }

            for (int star = 1; star <= 2 * line - 1; star++) {
                if (star % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }


    static void displayPattern3(int Size) {

        for (int line = 1; line <= Size; line++) {

            for (int space = Size - line; space > 0; space--) {
                System.out.print(" ");
            }

            for (int star = 1; star <= 2 * line - 1; star++) {
                if (line % 2 == 0) {
                    if (star % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("+");
                    }
                } else {
                    if (star % 2 == 0) {
                        System.out.print("+");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }


        for (int line = Size - 1; line >= 1; line--) {

            for (int space = Size; space > line; space--) {
                System.out.print(" ");
            }

            for (int star = 1; star <= 2 * line - 1; star++) {
                if (line % 2 == 0) {
                    if (star % 2 == 0) {
                        System.out.print("+");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    if (star % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("+");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int Size = 5;
        
       
        P6.displayPattern1(Size);


        P6.displayPattern2(Size);

        P6.displayPattern3(Size);
    }
}

