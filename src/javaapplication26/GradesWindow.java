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
import static javaapplication26.Rank.GetGradeGpa;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

// Java program to implement 
// a Simple Registration Form 
// using Java Swing 
/**
 *
 * @author Muhhammed Adel
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johna
 */
public class GradesWindow
        extends JFrame
        implements ActionListener {

    private Container c;
    private JLabel title;
    private JLabel Q1;
    private JLabel Q2;
    private JLabel Q3;
    private JLabel Q4;
    private JLabel Q5;
    private JLabel Q6;

    private JTextField tq1;
    private JTextField tq2;
    private JTextField tq3;
    private JTextField tq4;
    private JTextField tq5;
    private JTextField tq6;
    float grades[] = new float[5];
    private JButton sub;
    double sum = 0;

    public GradesWindow() {
        setTitle("CAREER ANALYSIS SYSTEM");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("REQUIRED SUBJECTS");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(500, 30);
        title.setLocation(300, 30);
        c.add(title);

        Q1 = new JLabel("MATHS'S GRADE:");
        Q1.setFont(new Font("Arial", Font.PLAIN, 20));
        Q1.setSize(500, 30);
        Q1.setLocation(100, 100);
        c.add(Q1);

        tq1 = new JTextField("");
        tq1.setFont(new Font("Arial", Font.PLAIN, 15));
        tq1.setSize(50, 20);
        tq1.setLocation(100, 150);
        tq1.addActionListener(this);
        c.add(tq1);

        Q2 = new JLabel("PHYSICS'S GRADE: ");
        Q2.setFont(new Font("Arial", Font.PLAIN, 20));
        Q2.setSize(500, 30);
        Q2.setLocation(100, 200);
        c.add(Q2);

        tq2 = new JTextField("");
        tq2.setFont(new Font("Arial", Font.PLAIN, 15));
        tq2.setSize(50, 20);
        tq2.setLocation(100, 250);
        tq2.addActionListener(this);
        c.add(tq2);

        Q3 = new JLabel("CHEMISTRY'S GRADE:");
        Q3.setFont(new Font("Arial", Font.PLAIN, 20));
        Q3.setSize(500, 30);
        Q3.setLocation(100, 300);
        c.add(Q3);

        tq3 = new JTextField("");
        tq3.setFont(new Font("Arial", Font.PLAIN, 15));
        tq3.setSize(50, 20);
        tq3.setLocation(100, 350);
        tq3.addActionListener(this);
        c.add(tq3);

        Q4 = new JLabel("BIOLOGY'S GRADE:");
        Q4.setFont(new Font("Arial", Font.PLAIN, 20));
        Q4.setSize(500, 30);
        Q4.setLocation(500, 100);
        c.add(Q4);

        tq4 = new JTextField("");
        tq4.setFont(new Font("Arial", Font.PLAIN, 15));
        tq4.setSize(50, 20);
        tq4.setLocation(500, 150);
        c.add(tq4);

        Q5 = new JLabel("ENGLISH'S GRADE:");
        Q5.setFont(new Font("Arial", Font.PLAIN, 20));
        Q5.setSize(500, 30);
        Q5.setLocation(500, 200);
        c.add(Q5);

        tq5 = new JTextField("");
        tq5.setFont(new Font("Arial", Font.PLAIN, 15));
        tq5.setSize(50, 20);
        tq5.setLocation(500, 250);
        tq5.addActionListener(this);
        c.add(tq5);

        Q6 = new JLabel("GPA:");
        Q6.setFont(new Font("Arial", Font.PLAIN, 20));
        Q6.setSize(500, 30);
        Q6.setLocation(500, 300);
        c.add(Q6);

        tq6 = new JTextField("");
        tq6.setFont(new Font("Arial", Font.PLAIN, 15));
        tq6.setSize(50, 20);
        tq6.setLocation(500, 350);
        tq6.addActionListener(this);
        c.add(tq6);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 20));
        sub.setSize(150, 30);
        sub.setLocation(370, 450);
        sub.addActionListener(this);
        c.add(sub);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int val1 = Integer.parseInt(tq1.getText());
        int val2 = Integer.parseInt(tq2.getText());
        int val3 = Integer.parseInt(tq3.getText());
        int val4 = Integer.parseInt(tq4.getText());
        int val5 = Integer.parseInt(tq5.getText());
        int val6 = Integer.parseInt(tq6.getText());

        sum = val1 + val2 + val3 + val4 + val5;
        double avr = sum / 5;

        GetGradeGpa(avr, val6);
        if (e.getSource() == sub) {
            QuestionsWindow q = new QuestionsWindow();
        }

    }
    public static void main(String[] args) {
        GradesWindow g = new GradesWindow();

    }

}
