class FactorialForLoop {
    public static void main(String[] args) {
        int number = 5; 
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}


class FactorialWhileLoop {
    public static void main(String[] args) {
        int number = 5; 
        long factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }
        System.out.println(factorial);
    }
}

 class FactorialRecursion {
    public static void main(String[] args) {
        int number = 5;
        long factorial = calculateFactorial(number);
        System.out.println(factorial);
    }

     long calculateFactorial(int n) {
        if (n == 0) {
            return 1; 
        } else {
            return n * calculateFactorial(n - 1); 
        }
    }
}

