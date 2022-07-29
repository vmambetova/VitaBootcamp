package com.bootcampexcersise.module10;

import java.util.HashMap;
import java.util.Map;

public class ElectronicItemDetails {

    public static void main(String[] args) {

        Map <String, Double> itemHashMap = new HashMap();
        itemHashMap.put("TV", 123.4) ;
        itemHashMap.put("Refrigerator", 1000.1);
        itemHashMap.put("Washing Machine", 1300.2);
        itemHashMap.put("Laptop", 1240.6);
        ElectronicItemDetails obj = new ElectronicItemDetails();
        System.out.println("The price of the TV is " + obj.returnPriceOfItem(itemHashMap, "TV"));
        System.out.println("The price of the refrigerator is " + obj.returnPriceOfItem(itemHashMap, "Refrigerator"));
        System.out.println("The price of the washing machine is " + obj.returnPriceOfItem(itemHashMap, "Washing Machine"));
        System.out.println("The price of the laptop is " + obj.returnPriceOfItem(itemHashMap, "Laptop"));
    }

    public Double returnPriceOfItem(Map<String, Double> map, String name){
        return map.get(name);
    }
}