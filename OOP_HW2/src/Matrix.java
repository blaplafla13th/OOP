public class Matrix {
    public static void main(String[] args) {
        int[][] matrix1i =
                {{5, 3, 1},
                        {3, 4, 6},
                        {3, 3, 2}};
        int[][] matrix2i =
                {{5, 3},
                        {3, 4},
                        {3, 3}};
        int[][] matrix3i =
                {{5, 1, 1},
                        {2, 8, 6},
                        {7, 4, 2}};
        int[][] matrix4i =
                {{5, 3, 3},
                        {3, 4, 3}};

        double[][] matrix1d =
                {{5, 3, 1},
                        {3, 4, 6},
                        {3, 3, 2}};
        double[][] matrix2d =
                {{5, 3},
                        {3, 4},
                        {3, 3}};
        double[][] matrix3d =
                {{5, 1, 1},
                        {2, 8, 6},
                        {7, 4, 2}};
        double[][] matrix4d =
                {{5, 3, 3},
                        {3, 4, 3}};
        print(multiply(matrix1d, matrix2d));
    }

    public static boolean isLegalMatrix(int[][] matrix) {
        if (matrix == null) return false;
        else if (matrix.length == 0) return false;
        else {
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row]==null)
                    return false;
                if (matrix[row].length != matrix[0].length)
                    return false;
            }
        }
        return true;
    }

    public static boolean isLegalMatrix(double[][] matrix) {
        if (matrix == null) return false;
        else if (matrix.length == 0) return false;
        else {
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row]==null)
                    return false;
                if (matrix[row].length != matrix[0].length)
                    return false;
            }
        }
        return true;
    }

    public static void print(int[][] matrix) {
        if (isLegalMatrix(matrix)) {
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[0].length; col++) {
                    if (col == 0)
                        System.out.print("[" + matrix[row][col]);
                    else
                        System.out.print(", " + matrix[row][col]);
                }
                System.out.print("]");
                System.out.println();
            }
            System.out.println();
        } else System.out.println("Invalid Matrix");
    }

    public static void print(double[][] matrix) {
        if (isLegalMatrix(matrix)) {
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[0].length; col++) {
                    if (col == 0)
                        System.out.print("[" + matrix[row][col]);
                    else
                        System.out.print(", " + matrix[row][col]);
                }
                System.out.print("]");
                System.out.println();
            }
            System.out.println();
        } else System.out.println("Invalid Matrix");
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (isLegalMatrix(matrix1) && isLegalMatrix(matrix2))
            if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length)
                return true;
        return false;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (isLegalMatrix(matrix1) && isLegalMatrix(matrix2))
            if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length)
                return true;
        return false;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        if (haveSameDimension(matrix1, matrix2)) {
            int[][] result = new int[matrix1.length][matrix1[0].length];
            for (int row = 0; row < matrix1.length; row++) {
                for (int col = 0; col < matrix1[0].length; col++) {
                    result[row][col] = matrix1[row][col] + matrix2[row][col];
                }
            }
            return result;
        } else return null;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        if (haveSameDimension(matrix1, matrix2)) {
            double[][] result = new double[matrix1.length][matrix1[0].length];
            for (int row = 0; row < matrix1.length; row++) {
                for (int col = 0; col < matrix1[0].length; col++) {
                    result[row][col] = matrix1[row][col] + matrix2[row][col];
                }
            }
            return result;
        } else return null;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        if (haveSameDimension(matrix1, matrix2)) {
            int[][] result = new int[matrix1.length][matrix1[0].length];
            for (int row = 0; row < matrix1.length; row++) {
                for (int col = 0; col < matrix1[0].length; col++) {
                    result[row][col] = matrix1[row][col] - matrix2[row][col];
                }
            }
            return result;
        } else return null;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        if (haveSameDimension(matrix1, matrix2)) {
            double[][] result = new double[matrix1.length][matrix1[0].length];
            for (int row = 0; row < matrix1.length; row++) {
                for (int col = 0; col < matrix1[0].length; col++) {
                    result[row][col] = matrix1[row][col] - matrix2[row][col];
                }
            }
            return result;
        } else return null;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (isLegalMatrix(matrix1) && isLegalMatrix(matrix2))
            if (matrix1[0].length == matrix2.length) {
                int[][] result = new int[matrix1.length][matrix2[0].length];
                for (int i = 0; i < matrix1.length; i++) {
                    for (int j = 0; j < matrix2[0].length; j++) {
                        int sum = 0;
                        for (int k = 0; k < matrix1[0].length; k++) {
                            sum = sum + matrix1[i][k] * matrix2[k][j];
                        }
                        result[i][j] = sum;
                    }
                }
                return result;
            }
        return null;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        if (isLegalMatrix(matrix1) && isLegalMatrix(matrix2))
            if (matrix1[0].length == matrix2.length) {
                double[][] result = new double[matrix1.length][matrix2[0].length];
                for (int i = 0; i < matrix1.length; i++) {
                    for (int j = 0; j < matrix2[0].length; j++) {
                        double sum = 0;
                        for (int k = 0; k < matrix1[0].length; k++) {
                            sum = sum + matrix1[i][k] * matrix2[k][j];
                        }
                        result[i][j] = sum;
                    }
                }
                return result;
            }
        return null;
    }
}
