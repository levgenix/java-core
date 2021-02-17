package ru.itsinfo.module2;

/**
 * Укажите пары эквивалентных булевских операторов. Операторы эквивалентны, если их таблицы истинности совпадают,
 * т.е. для любой пары аргументов оба оператора дают один и тот же результат.
 *
 * Если ответ не очевиден, то составьте таблицы истинности для всех упомянутых операторов и сравните их.
 * | и ||  ++   // true
 * ^ и !=  ++   // true
 * & и ==
 * | и !=
 */
public class Task_2_1_04 {
    public static void main(String[] args) {
        One();
        Two();
        Three();
        Four();
    }

    public static void One() {
        System.out.println("============== | и || ============");
        System.out.println((true | true) + " " + (true || true));
        System.out.println((true | false) + " " + (true || false));
        System.out.println((false | true) + " " + (false || true));
        System.out.println((false | false) + " " + (false || false));
    }

    public static void Two() {
        System.out.println("============== ^ и != ============");
        System.out.println((true ^ true) + " " + (true != true));
        System.out.println((true ^ false) + " " + (true != false));
        System.out.println((false ^ true) + " " + (false != true));
        System.out.println((false ^ false) + " " + (false != false));
    }

    public static void Three() {
        System.out.println("============== & и == ============");
        System.out.println((true & true) + " " + (true == true));
        System.out.println((true & false) + " " + (true == false));
        System.out.println((false & true) + " " + (false == true));
        System.out.println((false & false) + " " + (false == false));
    }

    private static void Four() {
        System.out.println("============== | и != ============");
        System.out.println((true | true) + " " + (true != true));
        System.out.println((true | false) + " " + (true != false));
        System.out.println((false | true) + " " + (false != true));
        System.out.println((false | false) + " " + (false != false));
    }
}
