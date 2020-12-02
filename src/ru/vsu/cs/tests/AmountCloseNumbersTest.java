package ru.vsu.cs.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vsu.cs.logic.AmountCloseNumbers;

class AmountCloseNumbersTest {

    @Test
    public void test1GetQuantityEqualNumbers() {
        int array = AmountCloseNumbers.getAmountCloseNumbers(new int[]{5, 5, 5, 5, 5});
        int result = 5;
        Assertions.assertEquals(array, result);
    }

    @Test
    public void test2GetQuantityEqualNumbers() {
        int array = AmountCloseNumbers.getAmountCloseNumbers(new int[]{2, 4, 3, 6, 4, 3});
        int result = 2;
        Assertions.assertEquals(array, result);
    }

    @Test
    public void test3GetQuantityEqualNumbers() {
        int array = AmountCloseNumbers.getAmountCloseNumbers(new int[]{3, 2, 3});
        int result = 2;
        Assertions.assertEquals(array, result);
    }

    @Test
    public void test4GetQuantityEqualNumbers() {
        int array = AmountCloseNumbers.getAmountCloseNumbers(new int[]{5, 6, 3, 2, 6});
        int result = 1;
        Assertions.assertEquals(array, result);
    }

    @Test
    public void test5GetQuantityEqualNumbers() {
        int array = AmountCloseNumbers.getAmountCloseNumbers(new int[]{7, 8, 9});
        int result = 1;
        Assertions.assertEquals(array, result);
    }

    @Test
    public void test6GetQuantityEqualNumbers() {
        int array = AmountCloseNumbers.getAmountCloseNumbers(new int[]{7, 8, 2, 4, 3, 5, 4});
        int result = 1;
        Assertions.assertEquals(array, result);
    }
}