package ru.vsu.cs.console;

import ru.vsu.cs.logic.AmountCloseNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n = readSomething("the size of the array");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = readSomething("an array element");
        }

        int res = AmountCloseNumbers.getAmountCloseNumbers(array);

        printSomething(array, res);
    }

    private static int readSomething(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter %s ", name);
        return scanner.nextInt();
    }

    private static void printSomething(int[] array, int res) {
        String arr = Arrays.toString(array);
        System.out.println("Original array --> " + arr +
                ". The amount of the estimated value --> " + res);
    }
}