/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Muhhammed Adel
 */
public class Rank  extends User {

    private float Grade;
    private String CoureseName;

    float MathGrade;

    public float GetGrade() {
        return Grade;
    }

    public void setGrade(float Grade) {
        this.Grade = Grade;
    }

    public String GetCourseName() {
        return CoureseName;
    }

    public void setGrade(String CoureseName) {
        this.CoureseName = CoureseName;
    }

    public Rank(String CourseName, int Grade) {
    }

    public static void Engineer_details() {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose your branch:: ");
        System.out.println("1- Electrical Engineering");
        System.out.println("2- Chemical Engineering");
        System.out.println("3- Petroleum Engineering");
        System.out.println("4- Aerospace Aviation Engineering");
        System.out.print("Enter your choice :");
        int Branch = input.nextInt();
        
        switch (Branch) {
            case 1:
                System.out.println("Electrical Engineering is available in :");
                System.out.println("UK");
                System.out.println("University: Stanford");
                System.out.println("Email-Eleceng@stanford.edu");
                break;
            case 2:
                System.out.println("Chemical Engineering is available in :");
                System.out.println("UK");
                System.out.println("University: Stanford");
                System.out.println("Email-Chemeng@stanford.edu");

                break;
            case 3:
                System.out.println("Petroleum Engineering is available in :");
                System.out.println("UK");
                System.out.println("University: Stanford");
                System.out.println("Email-Peteng@stanford.edu");

                break;
            case 4:
                System.out.println("Aerospace Aviation Engineering is available in :");
                System.out.println("UK");
                System.out.println("University: Stanford");
                System.out.println("Email-Aeroeng@stanford.edu");

                break;

        }
    }

    public static void Medecine_details() {
        Scanner input = new Scanner(System.in);

        tout.setText("Choose your branch: ");
        System.out.println("1- Angiology Medecine");
        System.out.println("2- Cardiology Medecine");
        System.out.println("3- Gastroenterology Medecine");
        System.out.println("4-Dermatology Medecine");
        System.out.print("Enter your choice :");
        int Branch = input.nextInt();

        switch (Branch) {
            case 1:
                System.out.println("Angiology Medecine is available in :");
                System.out.println("UK");
                System.out.println("University: Stanford");
                System.out.println("Email-Angmed@stanford.edu");
                break;
            case 2:
                System.out.println("Cardiology Medecine is available in :");
                System.out.println("UK");
                System.out.println("University: Stanford");
                System.out.println("Email-Cardmed@stanford.edu");

                break;
            case 3:
                System.out.println("Gastroenterology is available in :");
                System.out.println("UK");
                System.out.println("University: Stanford");
                System.out.println("Email-Gasmed@stanford.edu");

                break;
            case 4:
                System.out.println("Dermatology Medecine is available in :");
                System.out.println("UK");
                System.out.println("University: Stanford");
                System.out.println("Email-Dermed@stanford.edu");

                break;

        }
    }

    public static  void Bus_details() {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose your branch: ");
        System.out.println("1- Accounting");
        System.out.println("2- Finance");
        System.out.println("3- Marketing");
        System.out.print("Enter your choice :");
        int Branch = input.nextInt();
        
        switch (Branch) {
            case (1):
                System.out.println("Accounting is available in :");
                System.out.println("UK");
                System.out.println("University: Stanford");
                System.out.println("Email-Accbus@stanford.edu");
                break;
            case (2):
                System.out.println("Finance is available in :");
                System.out.println("UK");
                System.out.println("University: Stanford");
                System.out.println("Email-Finbus@stanford.edu");

                break;
            case (3):
                System.out.println("Marketing is available in :");
                System.out.println("UK");
                System.out.println("University: Stanford");
                System.out.println("Email-Markbus@stanford.edu");

                break;

        }
    }

    public static void  Cs_details() {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose your branch: ");
        System.out.println("1- BI");
        System.out.println("2- Data Architect");
        System.out.println("3- Applications Architect");
        System.out.print("Enter your choice :");
        int Branch = input.nextInt();
        switch (Branch) {
            case 1:
                System.out.println("BI is available in :");
                System.out.println("UK");
                System.out.println("University: Stanford");
                System.out.println("Email-Bics@stanford.edu");
                break;
            case 2:
                System.out.println("Data Architect is available in :");
                System.out.println("UK");
                System.out.println("University: Stanford");
                System.out.println("Email-datacs@stanford.edu");

                break;
            case 3:
                System.out.println("Applications Architect is available in :");
                System.out.println("UK");
                System.out.println("University: Stanford");
                System.out.println("Email-appcs@stanford.edu");

                break;

        }
    }

    public static  void GetGradeGpa(double grade, double gpa) {

        Scanner input = new Scanner(System.in);
        if ((grade > 95 && grade <= 100) && (gpa > 3.0 && gpa <= 4)) {

            System.out.println("you can eneter :");

            System.out.println("1.business adminstration ");
            System.out.println("2.Computer Science ");
            System.out.println("3.Engineering ");
            System.out.println("4.Medicine ");
            System.out.print("Enter your choice :");
            int choose = input.nextInt();
           
            switch (choose) {
                case 1:
                    Bus_details();
                    break;
                case 2:
                    Cs_details();
                    break;
                case 3:
                    Engineer_details();
                    break;
                case 4:
                    Medecine_details();
                    break;

            }

        } else if ((grade > 85 && grade <= 100) && (gpa >= 2.5 && gpa < 4.0)) {

            System.out.println("you can enter :");
            System.out.println("1.business adminstration ");
            System.out.println("2.Computer Science ");
            System.out.println("3.Engineering ");
            System.out.print("Enter your choice :");

            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    Bus_details();
                    break;
                case 2:
                    Cs_details();
                    break;
                case 3:
                    Engineer_details();
                    break;

            }
        } 
        else if ((grade > 70 && grade <= 100) && (gpa >= 2.0 && gpa < 4.0)) {

            System.out.println("you can enter :");

            System.out.println("1.business adminstration ");
            System.out.println("2.Computer Science ");
            System.out.print("Enter your choice :");

            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    Bus_details();
                    break;
                case 2:
                    Cs_details();
                    break;

            }
        } else if ((grade > 60 && gpa <= 100) && (gpa >= 2.0 && gpa < 4.0)) {

            System.out.println("you can enter :");

            System.out.println("1.business adminstration ");
            System.out.print("Enter your choice :");

            int choose = input.nextInt();

            switch (choose) {
                case 1:
                    Bus_details();
                    break;
            }

        } else {

            System.err.println("gpa or grade are not logical ");

        }

    }
}
