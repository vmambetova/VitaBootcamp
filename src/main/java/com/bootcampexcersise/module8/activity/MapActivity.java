package com.bootcampexcersise.module8.activity;
//Needs to be completed
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapActivity {
    public static void main(String[] args) {

        Map names = new HashMap();
        names.put("1", "Rachel");
        names.put("2", "Ross");
        names.put("3", "Monica");
        names.put("4", "Joey");
        names.put("5", "Chandler");
        names.put("6", "Phoebe");

        MapActivity obj = new MapActivity();
        obj.print(names);
    }

    void print(Map map) {
        Set keySet = map.keySet();
        System.out.println("*************************************");
        System.out.println("Key\tValue");
        Iterator iterat = keySet.iterator();
        while (iterat.hasNext()){
            String key = (String) iterat.next();
            System.out.println(key + "\t" + map.get(key));
        }
        System.out.println("*************************************");

    }
}
