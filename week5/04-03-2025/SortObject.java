/**
 * ==========================================================
 * Program Name: SortObject
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 04-03-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.ArrayList;
import java.util.Collections;


class Product{
    String name;
    double price;

    Product(String pname, double price){
        this.name = pname;
        this.price = price;
    }

    @Override
    public String toString(){
        return '{' + name + ", " + price + "}";
    }
}

public class SortObject {
    public static void main(String[] args) {
        ArrayList<Product> prod = new ArrayList<>();

        Product p1 = new Product("HP", 45000.0f);
        Product p2 = new Product("DELL", 55000.0f);

        prod.add(p1);
        prod.add(p2);

        System.out.println(prod.get(0));
        System.out.println(prod.get(1));
        System.out.println();


        System.out.println("Sort by name...");
        Collections.sort(prod, (pp1, pp2)->{
            return pp1.name.compareTo(pp2.name);
        });
        System.out.println(prod.get(0));
        System.out.println(prod.get(1));
        System.out.println();

        System.out.println("Sort by price...");
        Collections.sort(prod, (pp1, pp2)->{
            return Double.compare(pp1.price, pp2.price);
        });
        Collections.reverse(prod);

        System.out.println(prod.get(0));
        System.out.println(prod.get(1));
    }
}