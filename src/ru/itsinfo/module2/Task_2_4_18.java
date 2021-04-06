package ru.itsinfo.module2;

import java.util.Arrays;

/**
 * Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке массив.
 * Массивы могут быть любой длины, в том числе нулевой.
 *
 * Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность:
 * он будет идти по двум исходным массивам и сразу формировать отсортированный результирующий массив.
 * Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась.
 *
 * К сожалению, автоматически это не проверить, так что это остается на вашей совести :)
 *
 * Пример ввода: {0, 2, 2} и {1, 3}
 * Пример вывода: {0, 1, 2, 2, 3}
 */
public class Task_2_4_18 {
    public static void main(String[] args) {
        int[] a1 = { 0, 2, 2 };
        int[] a2 = { 1, 3 };
        System.out.println(Arrays.toString(mergeArrays(a1, a2)));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] arr = new int[a1.length + a2.length];
        boolean a1_isEmpty = false, a2_isEmpty = false;

        for (int i = 0, a1_current = 0, a2_current = 0; i < arr.length; i++) {
            if (a1_current == a1.length) {
                a1_isEmpty = true;
            } else if (a2_current == a2.length) {
                a2_isEmpty = true;
            }

            if (a1_isEmpty && !a2_isEmpty) {
                arr[i] = a2[a2_current];
                a2_current++;
                continue;
            } else if (a2_isEmpty && !a1_isEmpty) {
                arr[i] = a1[a1_current];
                a1_current++;
                continue;
            }

            if (a1[a1_current] < a2[a2_current]) {
                arr[i] = a1[a1_current];
                a1_current++;
            } else {
                arr[i] = a2[a2_current];
                a2_current++;
            }
        }

        return arr;
    }
}
