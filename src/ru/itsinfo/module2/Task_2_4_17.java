package ru.itsinfo.module2;

/**
 * Напишите метод printOddNumbers, который принимает массив и выводит в консоль только нечетные числа из него, через запятую.
 * Конец вывода должен перевести курсор на новую строку.
 *
 * Пример ввода: [3,5,20,8,7,3,100]
 * Пример вывода: 3,5,7,3
 */
public class Task_2_4_17 {
    public static void main(String[] args) {
        int[] arr = { 3,5,20,8,7,3,100 };
        printOddNumbers(arr);
    }

    public static void printOddNumbers(int[] arr) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                strBuilder.append(arr[i]).append(",");
            }
        }
        System.out.println(strBuilder.toString().substring(0, strBuilder.length() - 1));
    }
}
