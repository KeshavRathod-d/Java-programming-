class Spgame {
    public static void main(String[] args) {
        Spgame obj = new Spgame();
        obj.createNum(9);
    }

    
    void displayGrid(int size, int[][] layout) {
        StringBuffer sb = new StringBuffer();
        for (int dash = 1; dash <= size * 4 + 1; dash++) { 
            sb.append("-");
        }
        System.out.println(sb);

        for (int[] row : layout) {
            System.out.print("|");
            for (int value : row) {
             
                if (value==System.nanoTime()%size+1){
                 System.out.print(" " + " " + " |");
                 }else{
                System.out.print(" " + value + " |"); 
                }
            }
            System.out.println();
            System.out.println(sb);
        }
    }

    void createNum(int size) {
        int[][] layout = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int sum = i + j + 1;
                if (size < sum) {
                    sum -= size;
                }
                layout[i][j] = sum;
            }
        }
        displayGrid(size, layout); 
    }
}
