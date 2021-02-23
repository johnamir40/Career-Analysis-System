/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import static javaapplication26.Rank.GetGradeGpa;

/**
 *
 * @author Muhhammed Adel
 */
public class CareerAnalysisSystem {

    public static String GeneratePassword() {
        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";

        String PassRand = upperAlphabet + lowerAlphabet + numbers;

        StringBuilder SB1 = new StringBuilder();
        StringBuilder SB2 = new StringBuilder();
        Random random = new Random();

        int PassLength = 8;
        for (int i = 0; i < PassLength; i++) {

            int index = random.nextInt(PassRand.length());

            char randomChar = PassRand.charAt(index);

            SB1.append(randomChar);
        }

        String Password = SB1.toString();

        return Password;

    }

    public static String GenerateID() {

        String numbers = "0123456789";

        String IdRand = numbers;

        StringBuilder SB2 = new StringBuilder();
        Random random = new Random();

        int IdLength = 5;

        for (int i = 0; i < IdLength; i++) {

            int index = random.nextInt(IdRand.length());

            char randomChar = IdRand.charAt(index);

            SB2.append(randomChar);
        }

        String ID = SB2.toString();

        return ID;

    }


    public static void WriteInFiles(User user) throws FileNotFoundException, IOException {

        FileOutputStream f = new FileOutputStream(new File("Users.txt"));
        ObjectOutputStream o = new ObjectOutputStream(f);

        // Write objects to file
        o.writeObject(user);

        o.close();
        f.close();

    }


    public static void ReadFromFiles(User user) throws FileNotFoundException, IOException, ClassNotFoundException {

        FileInputStream fi = new FileInputStream(new File("Users.txt"));

        ObjectInputStream oi = new ObjectInputStream(fi);
        user = (User) oi.readObject();
        System.out.println(user.toString());
 
        oi.close();

    }
     public void CareerAnalysisSystem()throws IOException, FileNotFoundException, ClassNotFoundException {
        
        
      Scanner input = new Scanner(System.in);
      
       ArrayList<User> UsersList = new ArrayList<User>();
        User U1 = new User();
      
     System.out.println("-------------------------- WELCOME TO YOUR CAREER ANALYSIS SYSTEM   -------------------------------");
        System.out.println("ENTER YOUR INFO PLEASE   ");
        System.out.print("Full name :");
        String Name = input.nextLine();
        U1.setName(Name);
        System.out.print("Age :");
        String age = input.next();
        U1.setAge(age);
        System.out.print("Mobile No :");
        String mobile = input.next();
        U1.setMobile(mobile);
        System.out.print("Email :");
        String email = input.next();
        U1.setEmail(email);
    
    //        USER GET THE ID AND THE PASSWORD;
        System.out.println("-------------------------- ID & PASSWORD   -------------------------------");
        String ID = GenerateID();
        String Password = GeneratePassword();
        System.out.println("ID :" + ID);
        U1.setId(ID);
        System.out.println("Password :" + Password);
        U1.setPassword(Password);
        WriteInFiles(U1);
////        ReadFromFiles(U1);

//        INSERT MATHS, PHYSICS, CHEMISTRY, BIOLOGY,ENGLISH.
        System.out.println("-------------------------------------- REQUIRED SUBJECTS -----------------------------------------");
        System.out.println("ENTER YOUR GRADE IN MATHS :");
        float grades[] = new float[5];
        grades[0] = input.nextFloat();
        System.out.println("ENTER YOUR GRADE IN PHYSICS :");
        grades[1] = input.nextFloat();
        System.out.println("ENTER YOUR GRADE IN CHEMISTRY :");
        grades[2] = input.nextFloat();
        System.out.println("ENTER YOUR GRADE IN BIOLOGY :");
        grades[3] = input.nextFloat();
        System.out.println("ENTER YOUR GRADE IN ENGLISH :");
        grades[4] = input.nextFloat();
        double sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];

        }
        double average = sum / grades.length;
         System.out.println("ENTER YOUR GPA :");
        double GPA = input.nextDouble();
        GetGradeGpa(average, GPA);
        UsersList.add(U1);
        
       
        
    
    
    } 


}

