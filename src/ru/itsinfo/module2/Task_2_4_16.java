package ru.itsinfo.module2;

import java.util.Arrays;

/**
 * Напишите метод evenArray который принимает целое число типа int и возвращает массив,
 * заполненный четными числами от 1 до этого числа.
 *
 * Пример ввода: 8
 * Пример вывода: [2,4,6,8]
 *
 * Требования:
 * 1. Метод должен быть публичным.
 * 2. Параметр должен иметь тип int.
 * 3. Сигнатура метода должна быть: evenArray(int number)
 */
public class Task_2_4_16 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Task_2_4_16().evenArray(8)));
        System.out.println(Arrays.toString(new Task_2_4_16().evenArray(9)));
        System.out.println(Arrays.toString(new Task_2_4_16().evenArray(11)));
    }

    public int[] evenArray(int number) {
        int[] arr = new int[(int) number / 2];
        for (int i = 0, n = 2; i < arr.length; i++, n = n + 2) {
            arr[i] = n;
        }
        return arr;
    }
}
