package ru.itsinfo.module2;

/**
 * Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c ?
 * Допустимая погрешность – 0.0001 (1E-4)
 * Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 *
 * Требования:
 * Метод должен иметь сигнатуру: doubleExpression(double a, double b, double c)
 */
public class Task_2_1_10 {
    public static void main(String[] args) {
        if (doubleExpression(5d, 3d, 8d)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(c - (a + b)) <= 0.0001;
    }
}
