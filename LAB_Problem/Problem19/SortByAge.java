/**
 * ==========================================================
 * Program Name: SortByAge
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 06-03-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Tuple {
    String name;
    int age;

    Tuple(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SortByAge {
    public static void main(String[] args) {
        List<Tuple> list = new ArrayList<>();
        list.add(new Tuple("Alice", 30));
        list.add(new Tuple("Bob", 25));
        list.add(new Tuple("Charlie", 35));

        Collections.sort(list, (a, b) -> Integer.compare(a.age, b.age));

        for (Tuple t : list) {
            System.out.println(t.name + ": " + t.age);
        }
    }
}