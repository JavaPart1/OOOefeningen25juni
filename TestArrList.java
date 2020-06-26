package be.vdab.OefArrList;

import be.vdab.OOOef24juni.Circle;

import java.util.ArrayList;
import java.util.Date;

public class TestArrList {
    public static void main(String[] args) {
        // ArrayList declareren en initialiseren
        ArrayList<Object> objects = new ArrayList<Object>();

        // Objecten maken om in ArrayList te steken
        Circle c1 = new Circle(5);
        Date dd = new Date();
        Loan l1 = new Loan(100000.00);

        // ArrayList opvullen mt 3 objecten
        objects.add(c1);
        objects.add(dd);
        objects.add(l1);

        // Display inhoud vn ArrayList
        for (int i = 0; i < objects.size() ; i++) {
            System.out.println(objects.get(i));

        }
    }
}
