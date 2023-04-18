public static int[][] createRandomMatrix(int size, int range) {
    int[][] matrix = new int[size][size];
    Random random = new Random();
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            matrix[i][j] = random.nextInt(range * 2 + 1) - range;
        }
    }
    return matrix;
}

public static double findFirstColumnAverage(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
        sum += matrix[i][0];
    }
    return (double) sum / matrix.length;
}

public static int countElementsAboveFirstColumnAverage(int[][] matrix) {
    double firstColumnAverage = findFirstColumnAverage(matrix);
    int count = 0;
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] > firstColumnAverage) {
                count++;
            }
        }
    }
    return count;
}
