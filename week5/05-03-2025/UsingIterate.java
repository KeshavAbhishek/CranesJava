import java.util.stream.Stream;

/**
 * ==========================================================
 * Program Name: UsingIterate
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 05-03-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class UsingIterate {
    public static void main(String[] args) {
        Stream.iterate(1, ele->ele+1).filter(ele->ele%2==0).limit(5).forEach(System.out::println);
    }
}