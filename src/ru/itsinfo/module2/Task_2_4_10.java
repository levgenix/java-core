package ru.itsinfo.module2;

/**
 Что произойдет, если находясь на 12 строчке программы нажать step into?
 1) Программа переместится в первую строчку метода main
 + 2) Программа переместится в первую строчку метода getMinFromTwo
 3) Программа завершит свою работу
 4) Программа переместится на следующую строчку метода getMinFromFour
 */
public class Task_2_4_10 {

    public static void main(String[] args) {
        int minFromFour = getMinFromFour(14, 11, 10, 15);
        System.out.println(minFromFour);
    }

    public static int getMinFromFour(int a, int b, int c, int d) {
        int firstPairResult = getMinFromTwo(a, b);
        int secondPairResult = getMinFromTwo(c, d);

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
