public class sudokuGrid {
    int numbers[][] = new int[][]{
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {2, 3, 4, 5, 6, 7, 8, 9, 1},
            {3, 4, 5, 6, 7, 8, 9, 1, 2},
            {4, 5, 6, 7, 8, 9, 1, 2, 3},
            {5, 6, 7, 8, 9, 1, 2, 3, 4},
            {6, 7, 8, 9, 1, 2, 3, 4, 5},
            {7, 8, 9, 1, 2, 3, 4, 5, 6},
            {8, 9, 1, 2, 3, 4, 5, 6, 7},
            {1, 1, 2, 3, 4, 5, 6, 7, 8}};
    public static void main(String[] args) {
        sudokuGrid sg = new sudokuGrid();
       // sg.gridcheck(sg.numbers);
        System.out.println(sg.gridcheck(sg.numbers));
    }
    boolean gridcheck(int[][] a) {
        boolean isTrue = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                int temp = a[i][j];
                System.out.println("temp value is"+temp);
                for (int k = j + 1; k < a.length; k++) {
                    System.out.println(a[i][k]);
                    if (temp == a[i][k]) {
                        isTrue = false;

                        System.out.println(temp + " is already exists in"+a[i][k]);
                    }
                }
            }
        }
        return isTrue;
    }

}
