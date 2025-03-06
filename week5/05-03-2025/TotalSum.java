import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * ==========================================================
 * Program Name: TotalSum
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 05-03-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */
class Product3 {
    int pid;
    String pname;
    int price;

    public Product3(int pid, String pname, int price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{ Pid " + pid + " Pname  " + pname + " Price: " + price + " }";
    }

}


public class TotalSum {
    public static void main(String[] args) {
        ArrayList<Product3> productlist = new ArrayList<>();
        productlist.add(new Product3(101, "Cooler", 1500));
        productlist.add(new Product3(102, "AC", 15000));
        productlist.add(new Product3(103, "Heater", 10000));
        productlist.add(new Product3(101, "Filter", 5000));
        productlist.add(new Product3(101, "Matka", 200));

        System.out.println("Original...");
        productlist.forEach(System.out::println);

        int tPrice = productlist.stream()
        .map(p3->p3.price)
        .reduce(0, (sum, price)->(sum+price));
        System.out.println("Sum: " + tPrice);

        tPrice=productlist.stream()
        .map(p3->p3.price)
        .reduce(0, Integer::sum);
        
        System.out.println("Avg: " + tPrice/(productlist.size()));

        double totalAmt = productlist.stream().collect(Collectors.averagingDouble(prod->prod.price));
        System.out.println("Avg using collectors: " + totalAmt);

        Product3 product4 = productlist.stream().min((p1,p2)->p1.price>p2.price?1:-1).get();
        System.out.println("\nMin..\nPname: " + product4.pname + "\t" + product4.price);

        Product3 product5 = productlist.stream().max((p1,p2)->p1.price>p2.price?1:-1).get();
        System.out.println("\nMax..\nPname: " + product5.pname + "\t" + product5.price);
    }
}