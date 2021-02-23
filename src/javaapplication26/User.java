/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Muhhammed Adel
 */
class User implements Serializable {

    // User info 
    private boolean activated;

    private String id;

    private String Name;

    private String email;

    private String mobile;

    private String age;

    private String password;

    // Constructors 
    User() {
        id = "";
        Name = "";
        password = "";

    }

    public User(String id, String Name, String password, String email, String age, String mobile, boolean activated) {
        this.id = id;
        this.Name = Name;
        this.password = password;
        this.email = email;
        this.age = age;
        this.mobile = mobile;
        this.activated = activated;

    }

    public User login(String id, String password) {

        if (this.id.equals(id) && this.password.equals(password)) {
            FileInputStream fi = null;
            try {
                fi = new FileInputStream(new File(id + ".txt"));
                ObjectInputStream oi = new ObjectInputStream(fi);
                User user = (User) oi.readObject();
                oi.close();
                System.out.println("Logged in");
                return user;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fi.close();
                } catch (IOException ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        System.err.println("The username or the password is incorrect");

        return null;

    }

    public void saveFile() {
        try {
            FileOutputStream fi = new FileOutputStream(new File(this.id + ".txt"));
            ObjectOutputStream oi = new ObjectOutputStream(fi);
            oi.writeObject(this);
            oi.close();
        } catch (IOException e) {
            System.out.println("An error occurred.\n" + e);
        }

    }

    public boolean Register() {
        try {
             
            
            File file = new File(this.id + ".txt");
           
            if (file.exists())
            {
                 System.err.println("This User already exsists.\n");
                return false ;
            }
            
            FileInputStream fi = new FileInputStream(new File("Users.txt"));
                ObjectInputStream oi = new ObjectInputStream(fi);
                ArrayList<User> user = (ArrayList<User>) oi.readObject();
                oi.close();
                user.add(this);
            FileOutputStream fo = new FileOutputStream(new File("Users.txt"));
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(user); 
            oo.close();
           
            this.saveFile();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;

    }

    // Setter and Getters 
    public void setActivation(boolean activated) {
        this.activated = activated;
    }

    public String getName() {
        return Name;
    }

    public void setName(String n) {
        Name = n;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String a) {
        age = a;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mob) {
        this.mobile = mob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name:" + Name + "\nID: " + id + "\nPassword: " + password + "\nAge: " + age + "\nEmail: " + email + "\nMobile: " + mobile + "\nActivated: " + activated;
    }
}
