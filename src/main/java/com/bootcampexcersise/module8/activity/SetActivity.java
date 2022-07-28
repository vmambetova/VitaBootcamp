package com.bootcampexcersise.module8.activity;

import java.util.HashSet;
import java.util.Set;

public class SetActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a set of names.
        HashSet friends = new HashSet<>();
        //Also try adding a few duplicate entries to this set.


        //TODO: 2 - Call print method to print the set passed as its parameter.

        friends.add("Rachel");
        friends.add("Monica");
        friends.add("Phoebe");
        friends.add("Cahndler");
        friends.add("Ross");
        friends.add("Joey");
        friends.add("Joey"); // duplicate Joey never hurts nobody :)
        System.out.println("Output: ");
        for (Object nameOfObject : friends) {
            System.out.println(nameOfObject.toString());
        }
    }

    /*void print(Set set) {
        System.out.println();
    }*/
}
