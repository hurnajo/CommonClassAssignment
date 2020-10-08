package main;

import java.util.ArrayList;

public class ToStringMethodSample {
    public static void main(String[] args) {
        // create an integer
        Integer i = 50;

        // Create a list
        ArrayList list = new ArrayList();

        // add elements in list
        list.add(50);
        list.add("Hello ITA5");

        // print their string representation
        System.out.println(i.toString());
        System.out.println(list.toString());
    }
}
