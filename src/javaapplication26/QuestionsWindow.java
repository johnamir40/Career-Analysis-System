/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

/**
 *
 * @author johna
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication26.Rank.Engineer_details;

import static javaapplication26.Rank.GetGradeGpa;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class QuestionsWindow
        extends JFrame
        implements ActionListener {

    private Container frame;
    private JLabel title;
    private JLabel G1;
    private JLabel G2;
    private JLabel G3;
    private JLabel G4;
    private JLabel G5;
    private JLabel G6;
    private JTextField Gtq1;
    private JTextField Gtq2;
    private JTextField Gtq3;
    private JTextField Gtq4;
    private JTextField Gtq5;
    private JTextField Gtq6;

    private JTextField tq1;
    private JTextField tq2;
    private JTextField tq3;
    private JTextField tq4;
    private JTextField tq5;
    private JTextField tq6;
    
    private JButton sub;
    double sum = 0;
    double gpa=0;

    private JLabel Q1;
    private JLabel Q2;
    private JLabel Q3;
    private JLabel Q4;
    private JLabel Q5;
    private JLabel Q6;
    private JLabel Q7;
    private JLabel Q8;
    private JLabel Q9;
    private JLabel Q10;
    private JLabel Q11;

    private JRadioButton yes1;
    private JRadioButton yes2;
    private JRadioButton yes3;
    private JRadioButton yes4;
    private JRadioButton yes5;
    private JRadioButton yes6;
    private JRadioButton yes7;
    private JRadioButton yes8;
    private JRadioButton yes9;
    private JRadioButton yes10;
    private JRadioButton yes11;

    private JRadioButton no1;
    private JRadioButton no2;
    private JRadioButton no3;
    private JRadioButton no4;
    private JRadioButton no5;
    private JRadioButton no6;
    private JRadioButton no7;
    private JRadioButton no8;
    private JRadioButton no9;
    private JRadioButton no10;
    private JRadioButton no11;
    
    
    private JTextArea result;
    

    private int EngCtr = 0;
    private int CsCtr = 0;
    private int BusCtr = 0;
    private int MedCtr = 0;

    public QuestionsWindow() {

        setTitle("CAREER ANALYSIS SYSTEM");
        setBounds(700, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);

        frame = getContentPane();
        frame.setLayout(null);

        title = new JLabel("REQUIREMENTS");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(500, 30);
        title.setLocation(300, 30);
        frame.add(title);

        G1 = new JLabel("MATHS'S GRADE:");
        G1.setFont(new Font("Arial", Font.PLAIN, 20));
        G1.setSize(500, 30);
        G1.setLocation(100, 100);
        frame.add(G1);

        Gtq1 = new JTextField("");
        Gtq1.setFont(new Font("Arial", Font.PLAIN, 15));
        Gtq1.setSize(50, 20);
        Gtq1.setLocation(100, 150);
        Gtq1.addActionListener(this);
        frame.add(Gtq1);

        G2 = new JLabel("PHYSICS'S GRADE: ");
        G2.setFont(new Font("Arial", Font.PLAIN, 20));
        G2.setSize(500, 30);
        G2.setLocation(100, 200);
        frame.add(G2);

        Gtq2 = new JTextField("");
        Gtq2.setFont(new Font("Arial", Font.PLAIN, 15));
        Gtq2.setSize(50, 20);
        Gtq2.setLocation(100, 250);
        Gtq2.addActionListener(this);
        frame.add(Gtq2);

        G3 = new JLabel("CHEMISTRY'S GRADE:");
        G3.setFont(new Font("Arial", Font.PLAIN, 20));
        G3.setSize(500, 30);
        G3.setLocation(100, 300);
        frame.add(G3);

        Gtq3 = new JTextField("");
        Gtq3.setFont(new Font("Arial", Font.PLAIN, 15));
        Gtq3.setSize(50, 20);
        Gtq3.setLocation(100, 350);
        Gtq3.addActionListener(this);
        frame.add(Gtq3);

        G4 = new JLabel("BIOLOGY'S GRADE:");
        G4.setFont(new Font("Arial", Font.PLAIN, 20));
        G4.setSize(500, 30);
        G4.setLocation(500, 100);
        frame.add(G4);

        Gtq4 = new JTextField("");
        Gtq4.setFont(new Font("Arial", Font.PLAIN, 15));
        Gtq4.setSize(50, 20);
        Gtq4.setLocation(500, 150);
        frame.add(Gtq4);

        G5 = new JLabel("ENGLISH'S GRADE:");
        G5.setFont(new Font("Arial", Font.PLAIN, 20));
        G5.setSize(500, 30);
        G5.setLocation(500, 200);
        frame.add(G5);

        Gtq5 = new JTextField("");
        Gtq5.setFont(new Font("Arial", Font.PLAIN, 15));
        Gtq5.setSize(50, 20);
        Gtq5.setLocation(500, 250);
        Gtq5.addActionListener(this);
        frame.add(Gtq5);

        G6 = new JLabel("GPA:");
        G6.setFont(new Font("Arial", Font.PLAIN, 20));
        G6.setSize(500, 30);
        G6.setLocation(500, 300);
        frame.add(G6);

        Gtq6 = new JTextField("");
        Gtq6.setFont(new Font("Arial", Font.PLAIN, 15));
        Gtq6.setSize(50, 20);
        Gtq6.setLocation(500, 350);
        Gtq6.addActionListener(this);
        frame.add(Gtq6);

        Q1 = new JLabel("Are you interested in Maths?");
        Q1.setFont(new Font("Arial", Font.PLAIN, 15));
        Q1.setSize(500, 30);
        Q1.setLocation(100, 600);
        frame.add(Q1);

        yes1 = new JRadioButton("YES");
        yes1.setFont(new Font("Arial", Font.PLAIN, 15));
        yes1.setSelected(false);
        yes1.addActionListener(this);
        yes1.setSize(75, 20);
        yes1.setLocation(100, 635);
        frame.add(yes1);

        no1 = new JRadioButton("NO");
        no1.setFont(new Font("Arial", Font.PLAIN, 15));
        no1.setSelected(false);
        no1.setSize(75, 20);
        no1.setLocation(175, 635);
        frame.add(no1);

        Q2 = new JLabel("Are you interested in Arts?");
        Q2.setFont(new Font("Arial", Font.PLAIN, 15));
        Q2.setSize(500, 30);
        Q2.setLocation(100, 700);
        frame.add(Q2);

        yes2 = new JRadioButton("YES");
        yes2.setFont(new Font("Arial", Font.PLAIN, 15));
        yes2.setSelected(false);
        yes2.addActionListener(this);
        yes2.setSize(75, 20);
        yes2.setLocation(100, 735);
        frame.add(yes2);

        no2 = new JRadioButton("NO");
        no2.setFont(new Font("Arial", Font.PLAIN, 15));
        no2.setSelected(false);
        no2.setSize(75, 20);
        no2.setLocation(175, 735);
        frame.add(no2);

        Q11 = new JLabel("Are you interested in Programming?");
        Q11.setFont(new Font("Arial", Font.PLAIN, 15));
        Q11.setSize(500, 30);
        Q11.setLocation(90, 800);
        frame.add(Q11);

        yes11 = new JRadioButton("YES");
        yes11.setFont(new Font("Arial", Font.PLAIN, 15));
        yes11.setSelected(false);
        yes11.setSize(75, 20);
        yes11.addActionListener(this);
        yes11.setLocation(100, 835);
        frame.add(yes11);

        no11 = new JRadioButton("NO");
        no11.setFont(new Font("Arial", Font.PLAIN, 15));
        no11.setSelected(false);
        no11.setSize(75, 20);
        no11.setLocation(175, 835);
        frame.add(no11);

        Q3 = new JLabel("Are you interested in Biological sciences?");
        Q3.setFont(new Font("Arial", Font.PLAIN, 15));
        Q3.setSize(500, 30);
        Q3.setLocation(90, 900);
        frame.add(Q3);

        yes3 = new JRadioButton("YES");
        yes3.setFont(new Font("Arial", Font.PLAIN, 15));
        yes3.setSelected(false);
        yes3.setSize(75, 20);
        yes3.addActionListener(this);
        yes3.setLocation(100, 935);
        frame.add(yes3);

        no3 = new JRadioButton("NO");
        no3.setFont(new Font("Arial", Font.PLAIN, 15));
        no3.setSelected(false);
        no3.setSize(75, 20);
        no3.setLocation(175, 935);
        frame.add(no3);

        Q4 = new JLabel("Are you interested in Chemistry?");
        Q4.setFont(new Font("Arial", Font.PLAIN, 15));
        Q4.setSize(500, 30);
        Q4.setLocation(90, 420);
        frame.add(Q4);

        yes4 = new JRadioButton("YES");
        yes4.setFont(new Font("Arial", Font.PLAIN, 15));
        yes4.setSelected(false);
        yes4.setSize(75, 20);
        yes4.setLocation(100, 455);
        yes4.addActionListener(this);
        frame.add(yes4);

        no4 = new JRadioButton("NO");
        no4.setFont(new Font("Arial", Font.PLAIN, 15));
        no4.setSelected(false);
        no4.setSize(75, 20);
        no4.setLocation(175, 455);
        frame.add(no4);

        Q5 = new JLabel("Are you interested in Graphics?");
        Q5.setFont(new Font("Arial", Font.PLAIN, 15));
        Q5.setSize(500, 30);
        Q5.setLocation(90, 500);
        frame.add(Q5);

        yes5 = new JRadioButton("YES");
        yes5.setFont(new Font("Arial", Font.PLAIN, 15));
        yes5.setSelected(false);
        yes5.addActionListener(this);
        yes5.setSize(75, 20);
        yes5.setLocation(100, 535);
        frame.add(yes5);

        no5 = new JRadioButton("NO");
        no5.setFont(new Font("Arial", Font.PLAIN, 15));
        no5.setSelected(false);
        no5.setSize(75, 20);
        no5.setLocation(175, 535);
        frame.add(no5);

        Q6 = new JLabel("Are you interested in Entrepreneurship?");
        Q6.setFont(new Font("Arial", Font.PLAIN, 15));
        Q6.setSize(500, 30);
        Q6.setLocation(490, 800);
        frame.add(Q6);

        yes6 = new JRadioButton("YES");
        yes6.setFont(new Font("Arial", Font.PLAIN, 15));
        yes6.setSelected(false);
        yes6.setSize(75, 20);
        yes6.addActionListener(this);
        yes6.setLocation(500, 835);
        frame.add(yes6);

        no6 = new JRadioButton("NO");
        no6.setFont(new Font("Arial", Font.PLAIN, 15));
        no6.setSelected(false);
        no6.setSize(75, 20);
        no6.setLocation(575, 835);
        frame.add(no6);

        Q7 = new JLabel("Are you interested in Anatomy?");
        Q7.setFont(new Font("Arial", Font.PLAIN, 15));
        Q7.setSize(500, 30);
        Q7.setLocation(490, 700);
        frame.add(Q7);

        yes7 = new JRadioButton("YES");
        yes7.setFont(new Font("Arial", Font.PLAIN, 15));
        yes7.setSelected(false);
        yes7.addActionListener(this);
        yes7.setSize(75, 20);
        yes7.setLocation(500, 735);
        frame.add(yes7);

        no7 = new JRadioButton("NO");
        no7.setFont(new Font("Arial", Font.PLAIN, 15));
        no7.setSelected(false);
        no7.setSize(75, 20);
        no7.setLocation(575, 735);
        frame.add(no7);

        Q8 = new JLabel("Are you interested in Finance?");
        Q8.setFont(new Font("Arial", Font.PLAIN, 15));
        Q8.setSize(500, 30);
        Q8.setLocation(490, 600);
        frame.add(Q8);

        yes8 = new JRadioButton("YES");
        yes8.setFont(new Font("Arial", Font.PLAIN, 15));
        yes8.setSelected(false);
        yes8.setSize(75, 20);
        yes8.addActionListener(this);
        yes8.setLocation(500, 635);
        frame.add(yes8);

        no8 = new JRadioButton("NO");
        no8.setFont(new Font("Arial", Font.PLAIN, 15));
        no8.setSelected(false);
        no8.setSize(75, 20);
        no8.setLocation(575, 635);
        frame.add(no8);

        Q9 = new JLabel("Are you interested in Health and helping others?");
        Q9.setFont(new Font("Arial", Font.PLAIN, 15));
        Q9.setSize(500, 30);
        Q9.setLocation(490,500);
        frame.add(Q9);

        yes9 = new JRadioButton("YES");
        yes9.setFont(new Font("Arial", Font.PLAIN, 15));
        yes9.setSelected(false);
        yes9.setSize(75, 20);
        yes9.setLocation(500, 540);
        yes9.addActionListener(this);
        frame.add(yes9);

        no9 = new JRadioButton("NO");
        no9.setFont(new Font("Arial", Font.PLAIN, 15));
        no9.setSelected(false);
        no9.setSize(75, 20);
        no9.setLocation(575, 540);
        frame.add(no9);

        Q10 = new JLabel("Are you interested in Accounting?");
        Q10.setFont(new Font("Arial", Font.PLAIN, 15));
        Q10.setSize(500, 30);
        Q10.setLocation(490, 420);
        frame.add(Q10);

        yes10 = new JRadioButton("YES");
        yes10.setFont(new Font("Arial", Font.PLAIN, 15));
        yes10.setSelected(false);
        yes10.setSize(75, 20);
        yes10.addActionListener(this);
        yes10.setLocation(500, 455);
        frame.add(yes10);

        no10 = new JRadioButton("NO");
        no10.setFont(new Font("Arial", Font.PLAIN, 15));
        no10.setSelected(false);
        no10.setSize(75, 20);
        no10.setLocation(575, 455);
        frame.add(no10);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 20));
        sub.setSize(150, 30);
        sub.setLocation(310, 660);
        frame.add(sub);
        sub.addActionListener(this);
        
        result = new JTextArea();
        result.setSize(500,550);
        result.setLocation(820, 100);
        frame.add(result);
        
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (yes1.isSelected()) {
            EngCtr++;
            CsCtr++;
        }
        if (yes2.isSelected()) {
            EngCtr++;
        }

        if (yes11.isSelected()) {
            CsCtr++;
        }

        if (yes4.isSelected()) {
            MedCtr++;
        }
        if (yes5.isSelected()) {
            EngCtr++;
        }
        if (yes6.isSelected()) {
            CsCtr++;
        }
        if (yes7.isSelected()) {
            BusCtr++;
        }
        if (yes8.isSelected()) {
            MedCtr++;
        }
        if (yes9.isSelected()) {
            BusCtr++;
        }
        if (yes10.isSelected()) {
            BusCtr++;
        }

        if (e.getSource() == sub) {
            result.setText(Engineer());
        }

        int val1 = Integer.parseInt(tq1.getText());
        int val2 = Integer.parseInt(tq2.getText());
        int val3 = Integer.parseInt(tq3.getText());
        int val4 = Integer.parseInt(tq4.getText());
        int val5 = Integer.parseInt(tq5.getText());
        int val6 = Integer.parseInt(tq6.getText());
        gpa = val6;
        sum = val1 + val2 + val3 + val4 + val5;
        double avr = sum / 5;

        GetGradeGpa(avr, val6);

        if (MedCtr > EngCtr && MedCtr > BusCtr && MedCtr > CsCtr) {
            if ((avr > 90 && avr <= 100) && (gpa >= 3.0 && gpa < 4)) {
             
            }
        }

    }

    public static void main(String[] args) {
        QuestionsWindow w = new QuestionsWindow();

    }

    public String Read(String filename) throws FileNotFoundException, IOException {

        BufferedReader br = new BufferedReader(new FileReader(filename));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
            String everything = sb.toString();
            return everything ;
        } finally {
            br.close();
        }
    }

    private String Engineer() {
       Scanner input = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
//        ReadFiles("Eng.txt");
       result.append(String.format("Choose your branch:: /n" 
               + "1- Electrical Engineering /n"
               + "2- Chemical Engineering /n" 
               + "3- Petroleum Engineering /n"
               + "4- Aerospace Aviation Engineering /n" 
               + "Enter your choice : /n"));
       
        int Branch = input.nextInt();

        switch (Branch) {
            case 1:
                 result.append(String.format("Electrical Engineering is available in : /n" 
               + "UK /n"
               + " University: Stanford /n" 
               + "Email-Eleceng@stanford.edu /n"
                 ));
                break;
            case 2:
                 result.append(String.format("Chemical Engineering is available in : /n" 
               + "UK /n"
               + " University: Stanford /n" 
               + "Email-Chemeng@stanford.edu /n"
                 ));
                

                break;
            case 3:
                    result.append(String.format("Petroleum Engineering is available in : /n" 
               + "UK /n"
               + " University: Stanford /n" 
               + "Email-Peteng@stanford.edu /n"
                 ));
                

                break;
            case 4:
                          result.append(String.format("Aerospace Aviation Engineering is available in : /n" 
               + "UK /n"
               + " University: Stanford /n" 
               + "Email-Aeroeng@stanford.edu /n"
                 ));
               

                break;

       
    
    }
        return result.toString();
    
    }
      
}
