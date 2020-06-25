package be.vdab.OOOef25juni;

import be.vdab.OOOef24juni.Shape;

public class TestCircWex {
    public static void main(String[] args) {
        try {
            CircleWEx c1 = new CircleWEx(8);
            System.out.println("aantal objecten: " + Shape.getCount());
            System.out.println(c1.toString());
            CircleWEx c2 = new CircleWEx(-1);
            System.out.println("aantal objecten: " + Shape.getCount());
            System.out.println(c2.toString());
            CircleWEx c3 = new CircleWEx(100);
            System.out.println("aantal objecten: " + Shape.getCount());
            System.out.println(c3.toString());
            CircleWEx c4 = new CircleWEx(0);
            System.out.println("aantal objecten: " + Shape.getCount());
            System.out.println(c4.toString());

        } catch (IllegalArgumentException ex1) {
            System.out.println(ex1.getMessage());
        }
        System.out.println("aantal objecten: " + Shape.getCount());
    }
}
