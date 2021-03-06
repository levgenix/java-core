package ru.itsinfo.module2;

/**
 * Ниже приведён пример кода рассмотренной ранее программы, в котором была допущена ошибка.
 * Использя режим дебага постарайтесь найти строчку программы, в которой эта ошибка была допущена.
 * В поле ответа введите название переменной, объявленной в строчке с ошибкой
 *
 * + secondPairResult
 */
public class Task_2_4_12 {
    public static void main(String[] args) {
        int minFromFour = getMinFromFour(14, 11, 10, 15);
        System.out.println(minFromFour);
    }

    public static int getMinFromFour(int a, int b, int c, int d) {
        int firstPairResult = getMinFromTwo(a, b);
        int secondPairResult = getMinFromTwo(d, b);

        return getMinFromTwo(firstPairResult, secondPairResult);
    }

    public static int getMinFromTwo(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
}
