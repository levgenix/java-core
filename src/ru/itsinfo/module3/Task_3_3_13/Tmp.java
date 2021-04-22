package ru.itsinfo.module3.Task_3_3_13;

public class Tmp {

    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 1;
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);

        Integer c = 1000;
        Integer d = 1000;
        System.out.println(c > d);
        System.out.println(c < d);
        System.out.println(c == d);
        System.out.println(c.hashCode());
        System.out.println(c.intValue() == d.intValue());
    }

    public final String str;
    public static final int i = 0;

    //public final Tmp() {}
    public Tmp(int value, String str) {

        this.str = str;
    }

    public final void tmpMethod() {
        final int i = 0;

    }
}
