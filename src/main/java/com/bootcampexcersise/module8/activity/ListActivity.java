package com.bootcampexcersise.module8.activity;

//Needs to be completed

import java.awt.print.PrinterGraphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a list of names. Use ArrayList.
        List list = new ArrayList();
        list.add("Ross");
        list.add("Rachel");
        list.add("Monica");
        list.add("Joey");
        list.add("Chandler");
        list.add("Phoebe");

        //TODO: 2 - Call print method to print the list passed as its parameter.
        ListActivity print = new ListActivity();
        print.print(list);
    }

    void print(List list) {
        System.out.println(list);
        //TODO: 3 - Type code to print this list
        //Notice the order in which elements get printed.
        Iterator<Object> nameOfIterator = list.iterator();
        System.out.println("*** Work of iterator ***");
        while (nameOfIterator.hasNext()) {
            System.out.println(nameOfIterator.next());
        }

        System.out.println("*** Work of for loop ***");
        for (Object nameOfMyObject : list) {
            System.out.println(nameOfMyObject.toString());
        }


    }}

