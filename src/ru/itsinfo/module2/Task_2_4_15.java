package ru.itsinfo.module2;

/**
 * В спортивном центре есть три возрастные группы для занятий волейболом 1 - от 7 до 13 лет 2 - от 14 до 17 лет 3 - от 18 до 65 лет.
 *
 * Напишите публичный нестатичный метод determineGroup который принимает возраст человека и возвращает целое число,
 * которое обозначает номер группы в которую его надо определить, если подходящей группы нет - верните -1.
 *
 * Пример ввода: 10
 * Пример вывода: 1
 *
 * Пример ввода: 60
 * Пример вывода: 3
 *
 * Пример ввода: 77
 * Пример вывода: -1
 *
 * Требования:
 * Сигнатура метода должна быть: determineGroup(int age)
 * Метод должен возвращать int
 * Метод не должен быть статическим
 */
public class Task_2_4_15 {

    public static void main(String[] args) {

        System.out.println(new Task_2_4_15().determineGroup(3));
        System.out.println(new Task_2_4_15().determineGroup(10));
        System.out.println(new Task_2_4_15().determineGroup(15));
        System.out.println(new Task_2_4_15().determineGroup(60));
        System.out.println(new Task_2_4_15().determineGroup(65));
        System.out.println(new Task_2_4_15().determineGroup(77));
    }

    public int determineGroup(int age) {
        if (age > 6 && age < 14) {
            return 1;
        }
        if (age > 13 && age < 18) {
            return 2;
        }
        if (age > 17 && age < 66) {
            return 3;
        }
        return -1;
    }
}
