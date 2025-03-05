import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ==========================================================
 * Program Name: WithSream
 * Description :
 * Author : Keshav Abhishek
 * Created On : 05-03-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

class Product2 {
    int pid;
    String pname;
    double price;

    public Product2(int pid, String pname, double price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{ Pid " + pid + " Pname  " + pname + " Price: " + price + " }";
    }

}

public class WithSream {
    public static void main(String[] args) {
        ArrayList<Product2> productlist = new ArrayList<>();
        productlist.add(new Product2(101, "Cooler", 1500));
        productlist.add(new Product2(102, "AC", 15000));
        productlist.add(new Product2(103, "Heater", 10000));
        productlist.add(new Product2(101, "Filter", 5000));
        productlist.add(new Product2(101, "Matka", 200));

        System.out.println("Original...");
        productlist.forEach(System.out::println);

        System.out.println("\n\nFiltered...");
        List<Product2> list2 = productlist.stream().filter(p -> p.price > 6000).collect(Collectors.toList());
        list2.forEach(System.out::println);

    }
}