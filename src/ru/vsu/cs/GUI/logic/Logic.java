package ru.vsu.cs.GUI.logic;

public class Logic {

    public static int getAmountCloseNumbers(int[] array) {

        double average = getAverage(array);
        int l = getLowestNearestValue(array, average);
        int h = getHighestNearestValue(array, average);
        int k;
        if ((average - l) == 0.5) {
            k = countAmountIdenticalNumbers(array, l, h);
        } else {
            int b = getNearestNumber(average, l, h);
            k = countAmountIdenticalNumbers1(array, b);
        }
        return k;
    }

    private static double getAverage(int[] array) {//средне арифметическое значение
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    private static int getLowestNearestValue(int[] array, double average) {//находим меньшее рядом стоящее
        int l = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= average && array[i] >= l) {
                l = array[i];
            }
        }
        return l;
    }

    private static int getHighestNearestValue(int[] array, double average) {//находим большее рядом стоящее
        int h = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= average && array[i] >= h) {
                h = array[i];
                break;
            }
        }
        return h;
    }

    private static int getNearestNumber(double average, int l, int h) {//выясняем какое ближе
        int b;
        if ((average - l) == 0) {
            b = l;
        } else if ((average - l) < (h - average)) {
            b = l;
        } else
            b = h;
        return b;
    }

    private static int countAmountIdenticalNumbers(int[] array, int l, int h) {//если 0.5 расстояние то считаем так
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

    private static int countAmountIdenticalNumbers1(int[] array, int b) {//узнаем кол-во нужных элементов
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (b == array[i]) {
                j++;
            }
        }
        return j;
    }
}