class ArraySum {
    public static void main(String[] args) {
        int[] num = {12, 13, 1, 10, 34, 10};
        ArraySum obj = new ArraySum();
        int sum = obj.sumArray(num, num.length - 1);
        System.out.println(sum);
    }

    int sumArray(int[] array, int index) {
        if (index == 0) {
            return array[index];
        } else {
            return array[index] + sumArray(array, index - 1); 
        }
    }
}

