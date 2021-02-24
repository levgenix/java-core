package ru.itsinfo.module2;

/**
 * Реализуйте метод, который возвращает букву,
 * стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 *
 * Требования:
 * Сигнатура метода должна быть: charExpression(int a)
 */
public class Task_2_2_2 {
    public static void main(String[] args) {
        System.out.println("Char: " + charExpression(1));
    }

    public static char charExpression(int a) {
        char simbol = '\\';
        return (char) (simbol + a);
    }
}
