package org.example;


public class Variant10 {

    public enum Direction {
        NORTH, WEST, SOUTH, EAST;
    }

    /**
     * @param parameter is integer number
     * @return transformed number
     */
    public int integerTask(int x) {
        int restX100 = x % 100;
        int b = restX100 % 10;
        return b * 10 + (restX100 - b) / 10;
    }

    public boolean booleanTask(int a, int b) {
        return ((a % 2 == 0 && b % 2 == 1) || (a % 2 == 1 && b % 2 == 0));
    }

    public static int[] Iftask(int a, int b) {
        if (a == b) {
            a = b = 0;
        } else {
            a = b = a + b;
        }
        return new int[]{a, b};
    }

    public static Direction caseTask(int x) {
        switch (x) {
            case 0:
                return Direction.NORTH;
            case 1:
                return Direction.WEST;
            case 2:
                return Direction.SOUTH;
            case 3:
                return Direction.EAST;
            default:
                throw new IllegalArgumentException("Parameter" + x + "should be in range [0..3]");
        }
    }

    public double forTask(int n) {
        double s = 0;
        for (double i = 1; i <= n; i++) {
            s = s + (1 / i);
        }
        ;
        return s;
    }

    public int whileTask(int n) {
        int k = 0;
        while (Math.pow(3, k) < n) {
            k++;
        }
        return k;
    }

    public double[] arrayTask(double[] array) {
        int n = array.length;
        double[] arr = new double[n];
        int i2 = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                arr[i2] = array[i];
                i2++;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (array[i] % 2 != 0) {
                arr[i2] = array[i];
                i2++;
            }
        }
        return arr;
    }

    public int[][] matrixtask(int[][] array, int m, int n) {
        int[][] mas = new int[m][n / 2];
        int y2 = 0;
        for (int i = 0; i < m; i++) {
            y2 = 0;
            for (int y = 1; y < n; y += 2) {
                mas[i][y2] = array[i][y];
                y2 += 1;
            }
        }
        return mas;
    }
}
