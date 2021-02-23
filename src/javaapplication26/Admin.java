/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maged Alaa
 */
public class Admin implements Serializable {

    private String username;
    private String password;
    Boolean loggedin = false;

    public Admin() {

    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Admin logindetails(String u, String p) {

        if (username.equals(u) && password.equals(p)) {
            Admin admin = new Admin(u, p);
            loggedin = true;
            System.out.println("Logged in");
            return admin;

        } else {
            System.err.println("The username or the password is incorrect");
            return null;
        }

    }

    public void allstudents() {
        ArrayList<User> studentslist = new ArrayList<User>();
    }

    public void viewStudents() throws FileNotFoundException, IOException, ClassNotFoundException {
        try {
            FileInputStream fi = new FileInputStream(new File("Users.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            ArrayList<User> users = (ArrayList<User>) oi.readObject();
            oi.close();
            for (User element : users) {
                System.out.println(element.toString());
                System.out.println("");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void viewStudent(String id) {
        try {
            FileInputStream fi = new FileInputStream(new File("Users.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            ArrayList<User> users = (ArrayList<User>) oi.readObject();
            oi.close();
            User user = null;
            for (User element : users) {

                if (element.getId().equals(id)) {
                    user = element;
                    break;
                }
            }
            if (user == null) {
                System.out.println("User not found");

            } else {
                System.out.println(user.toString());
                System.out.println("");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.\n" + e);
        } catch (ClassNotFoundException e) {
            System.out.println("An error occurred.\n" + e);
        }
    }

    public void accountActivation(String id, boolean activation) throws IOException {

        try {
            FileInputStream fi = new FileInputStream(new File(id + ".txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            User user = (User) oi.readObject();
            oi.close();
            user.setActivation(activation);
            FileOutputStream fo = new FileOutputStream(new File(id + ".txt"));
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(user);
            oo.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
