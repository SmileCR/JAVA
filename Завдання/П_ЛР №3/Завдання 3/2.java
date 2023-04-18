public static int findMinAbsolute(int[][] matrix) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            if (Math.abs(matrix[i][j]) < Math.abs(min)) {
                min = matrix[i][j];
            }
        }
    }
    return min;
}
