package ru.itsinfo.module2;

import java.math.BigInteger;

/**
 * Реализуйте предыдущую задачу с использованием рекурсии.
 *
 * Пример ввода 1: 1
 * Пример возвращаемого значения 1: 1
 *
 * Пример ввода 2: 3
 * Пример возвращаемого значения 2: 6
 *
 * Требования:
 * 1. Метод должен быть public.
 * 1. Метод должен быть static.
 * 3. Передаваемый параметр должен иметь тип int.
 * 4. Реализация метода должна быть через рекурсию.
 */
public class Task_2_4_14 {

    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(3));
        System.out.println(factorial(4));
    }

    public static BigInteger factorial(int value) {
        if (value == 0) return BigInteger.ONE;
        return BigInteger.valueOf(value).multiply(factorial(value - 1));
    }
}
