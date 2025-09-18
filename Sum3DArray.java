public class Sum3DArray {
    public static void main(String[] args) {
        int[][][] arr = {
            {
                {1, 2}, {3, 4}
            },
            {
                {5, 6}, {7, 8}
            }
        };

        int sum = 0;
        for (int[][] block : arr) {
            for (int[] row : block) {
                for (int num : row) {
                    sum += num;
                }
            }
        }

        System.out.println("Sum of all elements: " + sum);
    }
}
