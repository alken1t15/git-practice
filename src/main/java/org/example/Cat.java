package org.example;

import org.example.test1.Animal;

import java.util.*;

public  class Cat  {
    String name;

    private static Cat renameCat(Cat cat) {
        System.out.print(cat.name);
        cat = new Cat();
        cat.name = "Mia";
        return cat;
    }

    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.name = "Yuna";
//        renameCat(cat);
//        System.out.print(cat.name);
//        Integer[] ageArray;
//        try {
//            String age = "29";
//            ageArray = new Integer[]{Integer.parseInt(age)};
//        } catch (NumberFormatException nfe) {
//            System.out.println("Error parsing age");
//        }
//        System.out.println(Arrays.toString(ageArray));
        Map<Integer, Integer> relations = new HashMap<>();
        relations.put(1, 2);
        relations.put(3, 4);
        relations.forEach((k, v) -> relations.put(v, k));
    }

//    public final Integer doNothingForNow(int... numbers, boolean needSum) {
//        return null;
//    }
}
