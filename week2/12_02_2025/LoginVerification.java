/*
 * 
 class
 LoginVerification
 email_id and password - instance variable
 use constructors to initialize
 
 have method verifyLogin(email_id, password)
 returns true if(email_id and password matches) else false
 */
/**
 * ==========================================================
 * Program Name: LoginVerification
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 12-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.Scanner;
public class LoginVerification {
    String email;
    String password;
    LoginVerification(){}
    public LoginVerification(String email, String password){
        this.email = email;
        this.password = password;
    }

    public boolean verifyLogin(){
        Scanner sc = new Scanner(System.in);
        String e = sc.nextLine();
        String pass = sc.nextLine();
        sc.close();
        return e.compareToIgnoreCase(this.email)==0 && pass.compareTo(this.password)==0;
    }
    public static void main(String[] args) {
        LoginVerification LV = new LoginVerification("crystaled2003@gmail.com", "Keshav@123");
        System.out.println(LV.verifyLogin()==true?"Login Done":"Login Failed");
    }
}