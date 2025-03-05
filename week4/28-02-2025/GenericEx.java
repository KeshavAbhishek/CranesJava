/**
 * ==========================================================
 * Program Name: GenericEx
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 28-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */
class Box<T>{
    private T value;
    Box(T value){
        this.value = value;
    }

    T getData(){
        return value;
    }
}

public class GenericEx {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        Box<Integer> data = new Box(10);
        System.out.println(data.getData());
        
        System.out.println();
        
        Box<String> data2 = new Box("Keshav");
        System.out.println(data2.getData());

        Box<Float> data3 = new Box(15.5f);
        System.out.println(data3.getData());

        Box<Boolean> data4 = new Box(true);
        System.out.println(data4.getData());
    }
}