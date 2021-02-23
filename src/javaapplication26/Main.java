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
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static javaapplication26.CareerAnalysisSystem.GenerateID;
import static javaapplication26.CareerAnalysisSystem.GeneratePassword;
import static javaapplication26.CareerAnalysisSystem.ReadFromFiles;
import static javaapplication26.CareerAnalysisSystem.WriteInFiles;
import static javaapplication26.CareerAnalysisSystem.WriteInFiles;
import static javaapplication26.Rank.GetGradeGpa;

/**
 *
 * @author johna
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static final Login L = new Login();

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {

////        THE ACCEPTING SCORE OF THE FACULTY
       Scanner input = new Scanner(System.in);
     
////
//        ArrayList<User> UsersList = new ArrayList<User>();
//        User U1 = new User();
//////        INSERT NAME, GENDER, AGE, MOBILE NO, EMAIL.
//        System.out.println("-------------------------- WELCOME TO YOUR CAREER ANALYSIS SYSTEM   -------------------------------");
//        System.out.println("ENTER YOUR INFO PLEASE   ");
//        System.out.print("Full name :");
//        String Name = input.nextLine();
//        U1.setName(Name);
//        System.out.print("Age :");
//        String age = input.next();
//        U1.setAge(age);
//        System.out.print("Mobile No :");
//        String mobile = input.next();
//        U1.setMobile(mobile);
//        System.out.print("Email :");
//        String email = input.next();
//        U1.setEmail(email);
//
////        USER GET THE ID AND THE PASSWORD;
//        System.out.println("-------------------------- ID & PASSWORD   -------------------------------");
//        String ID = GenerateID();
//        String Password = GeneratePassword();
//        System.out.println("ID :" + ID);
//        U1.setId(ID);
//        System.out.println("Password :" + Password);
//        U1.setPassword(Password);
//        WriteInFiles(U1);
//        ReadFromFiles(U1);
//
////        INSERT MATHS, PHYSICS, CHEMISTRY, BIOLOGY,ENGLISH.
//        System.out.println("-------------------------------------- REQUIRED SUBJECTS -----------------------------------------");
//        System.out.println("ENTER YOUR GRADE IN MATHS :");
//        float grades[] = new float[5];
//        grades[0] = input.nextFloat();
//        System.out.println("ENTER YOUR GRADE IN PHYSICS :");
//        grades[1] = input.nextFloat();
//        System.out.println("ENTER YOUR GRADE IN CHEMISTRY :");
//        grades[2] = input.nextFloat();
//        System.out.println("ENTER YOUR GRADE IN BIOLOGY :");
//        grades[3] = input.nextFloat();
//        System.out.println("ENTER YOUR GRADE IN ENGLISH :");
//        grades[4] = input.nextFloat();
//        double sum = 0;
//
//        for (int i = 0; i < grades.length; i++) {
//            sum += grades[i];
//
//        }
//        double average = sum / grades.length;
//
//        System.out.println("ENTER YOUR GPA :");
//        double GPA = input.nextDouble();
//        GetGradeGpa(average, GPA);
//        UsersList.add(U1);





//admin gui

//        LoginPage l = new LoginPage();

//        AdminOptions a = new AdminOptions();


//student gui    

//   MainPage f = new MainPage();

//   QuestionsWindow w = new QuestionsWindow();

//        AddFaculties a = new AddFaculties ();

      
      
      
      
      
      
      
////         //Admin Part 


//            ArrayList<User> users = new ArrayList<User>();
//            FileOutputStream fo = new FileOutputStream(new File("Users.txt"));
//            ObjectOutputStream oo = new ObjectOutputStream(fo);
//            oo.writeObject(users); 
//            oo.close();

       
       
//      
//      Admin a = new Admin("admin","admin");
//        
//       
//        while (!a.loggedin) {
//            
//            System.out.println("Enter the username :");
//            String Username = input.next();
//            System.out.println("Enter the password :");
//            String Password = input.next();
//           a.logindetails(Username, Password);
//        }
//       a.viewStudents();
//       System.out.println("Enter an ID you want to look for ");
//       String ID = input.next();
//       a.viewStudent(ID);
//       a.accountActivation(ID, true);

    }

}
