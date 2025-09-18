public class Max2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {5, 100, 15}
        };

        int max = arr[0][0];

        for (int[] row : arr) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }

        System.out.println("Maximum element: " + max);
    }
}
