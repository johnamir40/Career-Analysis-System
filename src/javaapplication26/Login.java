/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

import javaapplication26.Admin;
import java.util.Scanner;

/**
 *
 * @author Maged Alaa
 */
public class Login {

    public Admin logindetails() {
        Scanner input = new Scanner(System.in);
        String u = "admin";
        String p = "admin";
        String username;
        System.out.print("Username: ");
        username = input.next();
        System.out.print("Password: ");
        String password;
        password = input.next();
        if (username.equals(u) && password.equals(p)) {
            Admin admin = new Admin(u, p);

            System.out.println("Logged in");
            return admin;

        } else {
            System.err.println("The username or the password is incorrect");
            System.exit(0);
            return null; 
        }

    }
}
