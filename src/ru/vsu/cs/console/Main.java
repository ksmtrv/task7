package ru.vsu.cs.console;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n = readSomething("the size of the array");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = readSomething("an array element");
        }

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
        printSomething(array, k);
    }

    private static double getAverage(int[] array) {//среднее арифметическое значение
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

    private static int readSomething(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter %s ", name);
        return scanner.nextInt();
    }

    private static void printSomething(int[] array, int k) {
        String arr = Arrays.toString(array);
        System.out.println("Original array --> " + arr +
                ". The amount of the estimated value --> " + k);
    }
}