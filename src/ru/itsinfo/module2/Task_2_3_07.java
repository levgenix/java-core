package ru.itsinfo.module2;

/**
 * Выберите выражения, которые дадут в качестве результата строку A12.
 * "A" + ('\t' + '\u0003') // true
 * 'A' + '1' + "2" // false
 * "A" + 12 // true
 * 'A' + "12" // true
 */
public class Task_2_3_07 {
    public static void main(String[] args) {
        System.out.println("A" + ('\t' + '\u0003'));
        System.out.println('A' + '1' + "2");
        System.out.println("A" + 12);
        System.out.println('A' + "12");
    }
}
