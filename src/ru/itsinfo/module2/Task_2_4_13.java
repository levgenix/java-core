package ru.itsinfo.module2;

import java.math.BigInteger;

/**
 * Реализуйте метод factorial, вычисляющий факториал заданного натурального числа.
 * Факториал N вычисляется как 1 ⋅ 2 ⋅ ... ⋅ N.
 *
 * Поскольку это очень быстро растущая функция, то даже для небольших N вместимости типов int и long
 * очень скоро не хватит. Поэтому будем использовать BigInteger.
 *
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода
 * добавит проверяющая система.
 *
 * Пример ввода 1: 1
 * Пример возвращаемого значения 1: 1
 *
 * Пример ввода 2: 3
 * Пример возвращаемого значения 2: 6
 */
public class Task_2_4_13 {
    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(3));
        System.out.println(factorial(4));
    }

    public static BigInteger factorial(int value) {
        BigInteger factorial = BigInteger.ONE;

        while (value != 0) {
            factorial = factorial.multiply(BigInteger.valueOf(value));
            value--;
        }

        return factorial;
    }
}
