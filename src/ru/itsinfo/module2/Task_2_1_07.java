package ru.itsinfo.module2;

/**
 * Напишите публичный метод priceCalculation, который считает стоимость товара.
 * В метод передается цена товара (может быть дробной) и количество товара,
 * метод должен возвращать итоговую цену покупки.
 *
 * Пример ввода: 8.50, 2
 * Пример вывода: 17.0
 *
 * Требования:
 * Сигнатура метода должна быть: priceCalculation(double price, int count)
 */
public class Task_2_1_07 {
    public static void main(String[] args) {
        Task_2_1_07 main = new Task_2_1_07();

        System.out.println(main.priceCalculation(99.99, 3));
        System.out.println(main.priceCalculation(15d, 4));
        System.out.println(main.priceCalculation(8.50, 2));
    }

    public double priceCalculation(double price, int count) {
        return price * count;
    }
}
