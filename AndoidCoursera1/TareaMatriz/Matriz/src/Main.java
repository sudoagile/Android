public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[4][5];


        int count = 1;
        for (int row = 0; row < 4; row++) {
            matrix[row][0] = row + 1;
            for(int col = 1; col < 5; col++){
                matrix[row][col] = count * 2;
                count++;
            }
        }

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}