public class matrotleft {
static void leftRotation(int[] row, int k) {
        int n = row.length;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = row[i];
        }
        for (int i = k; i < n; i++) {
            row[i - k] = row[i];
        }
        for (int i = 0; i < k; i++) {
            row[n - k + i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        for (int i = 0; i < matrix.length; i++) {
            leftRotation(matrix[i], i);
        }
        System.out.println("After Left Rotation:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}