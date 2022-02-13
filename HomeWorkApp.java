import java.util.Arrays;


public class HomeWorkApp {
    public static void main(String[] args) {

        /**
         * 1
         */
        int[] array = {1, 0, 0, 1, 1, 1, 0, 0, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else array[i] = 0;
        }

        /**
         * 2
         */
        int[] array2 = new int[100];
        int count = 1;
        for (int i = 0; i < array2.length; i++) {
            array2[i] = count;
            count++;
        }

        /**
         * 3
         */
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] = array3[i] * 2;
            }
        }
        /**
         * 4
         */
        int[][] matrix = new int[8][8];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        /**
         * 6
         */

        int[] array4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = array4[0];
        int min = array4[0];
        for (int i = 0; i < array4.length; i++) {
            if (max <= array4[i]) {
                max = array4[i];
            }
            if (min >= array4[i]) {
                min = array4[i];
            }
        }
    }

    /**
     * 5
     */

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }

    /**
     * 7
     */
    public static boolean checkBalance(int[] array) {
        if (array.length > 1) {
            int sumOfArrayElements = array[0];
            for (int i = 0; i < array.length; i++) {
                if (i > 0) {
                    sumOfArrayElements = sumOfArrayElements + array[i];
                }
            }
            int half = sumOfArrayElements / 2;
            int sumAfter = array[0];
            for (int i = 0; i < array.length; i++) {
                if (i > 0) {
                    sumAfter = sumAfter + array[i];
                    if (sumAfter == half) {
                        return true;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("array length must be more then 1");
        }
        return false;
    }
}