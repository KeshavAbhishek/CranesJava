
/**
 * ==========================================================
 * Program Name: FilterEven
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 06-03-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEven {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list = list.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}