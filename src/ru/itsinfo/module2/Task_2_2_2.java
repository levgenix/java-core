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
//
//        System.out.println("0: " + "A" + ('\t' + '\u0003'));
//        System.out.println("1: " + 'A' + '1' + "2");
//        System.out.println("2: " + "A" + 12);
//        System.out.println("3: " + 'A' + "12");
//
//        allSymbols();
    }

    public static char charExpression(int a) {
        char simbol = '\\';
        return (char) (simbol + a);
    }

//    public static void allSymbols() {
//        for (int i = 0; i < 65_535 ; i++) {
//            System.out.print(charExpression(i));
//        }
//    }
}
