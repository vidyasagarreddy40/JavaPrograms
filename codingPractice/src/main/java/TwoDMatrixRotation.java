public class TwoDMatrixRotation {

    int matix[][] = new int[][]{{1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
    int length = matix.length;


    public static void main(String[] args) {

        TwoDMatrixRotation tt = new TwoDMatrixRotation();
        // tt.transpose(tt.matix, tt.length);
        int matix[][] = new int[][]{{1, 2, 3},
                                    {4, 5, 6},
                                    {7, 8, 9}};

        System.out.println(tt.solution(matix));
    }

    int[][] solution(int[][] a) {

        int temp[][] = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            int l=0;
            for (int j = a.length - 1; j >= 0; j--) {
                System.out.print("" + a[j][i] + "\t");
                for(int k=0;k<a.length;k++) {
                    temp[i][l] = a[j][i];
                }
                l++;
            }
            System.out.println("\n");
        }
        return temp;
    }

}
