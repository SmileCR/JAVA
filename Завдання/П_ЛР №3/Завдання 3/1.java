public static void findNegativeSum(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int negativeSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    negativeSum += matrix[i][j];
                }
            }
            System.out.println("Сума від'ємних елементів у рядку " + i + ": " + negativeSum);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{-1, 2, 3}, {4, -5, 6}, {7, 8, -9}};
        findNegativeSum(matrix);
    }


