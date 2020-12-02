package ru.vsu.cs.logic;

public class AmountCloseNumbers {

    public static int getAmountCloseNumbers(int[] array) {

        double average = getAverage(array);
        int l = getLowestNearestValue(array, average);
        int h = getHighestNearestValue(array, average);
        int res;
        if ((average - l) == 0.5) {
            res = countAmountIdenticalNumbers(array, l, h);
        } else {
            int n = getNearestNumber(average, l, h);
            res = countAmountIdenticalNumbers1(array, n);
        }
        return res;
    }

    private static double getAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    private static int getLowestNearestValue(int[] array, double average) {
        int l = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= average && array[i] >= l) {
                l = array[i];
            }
        }
        return l;
    }

    private static int getHighestNearestValue(int[] array, double average) {
        int h = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= average && array[i] >= h) {
                h = array[i];
                break;
            }
        }
        return h;
    }

    private static int getNearestNumber(double average, int l, int h) {
        int n;
        if ((average - l) == 0) {
            n = l;
        } else if ((average - l) < (h - average)) {
            n = l;
        } else
            n = h;
        return n;
    }

    private static int countAmountIdenticalNumbers(int[] array, int l, int h) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (h == array[i]) {
                j++;
            }
            if (l == array[i]) {
                j++;
            }
        }
        return j;
    }

    private static int countAmountIdenticalNumbers1(int[] array, int b) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (b == array[i]) {
                j++;
            }
        }
        return j;
    }
}