/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

import java.awt.Container;
import java.awt.Font;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author johna
 */
/**
 *
 * @author johna
 */
public class ResultsWindow
        extends GradesWindow
        implements ActionListener {

    private Container c;
    private JLabel title;

    private JTextArea tout;
    private JButton sub;

    public ResultsWindow() {
        setTitle("CAREER ANALYSIS SYSTEM_ADMIN");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Result Analysis");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(500, 30);
        title.setLocation(350, 30);
        c.add(title);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(700, 300);
        tout.setLocation(100, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        sub = new JButton("Close");
        sub.setFont(new Font("Arial", Font.PLAIN, 20));
        sub.setSize(150, 30);
        sub.setLocation(370, 450);
        sub.addActionListener(this);
        c.add(sub);

        setVisible(true);

    }
   public static void main(String[] args) {
        ResultsWindow r = new ResultsWindow();

    }
    @Override
    public void actionPerformed(ActionEvent e) {

//        if (GetMed() > GetEng() && MedCtr > BusCtr && MedCtr > CsCtr) {
//            if ((grade > 90 && grade <= 100) && (gpa >= 3.0 && gpa < 4)) {
//                JOptionPane.showMessageDialog(null, "We Suggest Medicine School /n" + "-----------------------------------------------------");
//
//            }
//        }
//        (null," We Suggest Medicine School \n " )
//            +"-----------------------------------------------------" );
//             ReadFiles("Med.txt");
//                Medecine_details();

    }
//else {
//                return ;
//            }
////            if (eng > bus && eng > cs) {
////                System.out.println("Engineer is your second preference");
////                if ((grade > 85 && grade <= 100) && (gpa >= 2.5 && gpa < 4.0)) {
////                    Engineer_details();
////                } else {
////                    System.out.println("Your grades don't match Engineering");
////                }
////                if (cs > bus) {
////                    System.out.println("Computer Science is your third preference");
////                    if ((grade > 70 && grade <= 100) && (gpa >= 2.0 && gpa < 4.0)) {
////                        Cs_details();
////                    } else {
////                        System.out.println("Your grades don't match with computer science");
////                    }
////                    System.out.println("Business is your fourth preference");
////                    Bus_details();
////                }
//
//            }
//
//         if (eng > med && eng > cs && eng > bus) {
//            System.out.println(" We Suggest Engineering School \n ");
//            if ((grade > 85 && grade <= 100) && (gpa >= 2.5 && gpa < 4.0)) {
//                Engineer_details();
//
//            } else {
//                return ;
//            }
////            if (cs > bus) {
////                System.out.println("Computer Science is the second preference");
////                if ((grade > 70 && grade <= 100) && (gpa >= 2.0 && gpa < 4.0)) {
////                    Cs_details();
////                } else {
////                    System.out.println("Your grades don't match Computer Science");
////                }
////                System.out.println("Business is the third preference");
////                Bus_details();
////            }
//
//        } else if (cs > med && cs > eng && cs > bus) {
//            System.out.println(" We Suggest Computer Science School \n ");
//            if ((grade > 70 && grade <= 100) && (gpa >= 2.0 && gpa < 4.0)) {
//                Cs_details();
//
//            } else {
//               return ;
//            }
//           
//
//        } else if (bus > med && bus > eng && bus > cs) {
//            System.out.println(" We Suggest Bussiness School \n ");
//            if ((grade > 60 && gpa <= 100) && (gpa >= 2.0 && gpa < 4.0)) {
//                Bus_details();
//            }
//
//        } else if (med == eng) {
//            System.out.println(" We Suggest Medicine / Engineering  School  ,choose one ");
//            System.out.println("1-Medicine");
//            System.out.println("2-engineering");
//            int ch = input.nextInt();
//            switch (ch) {
//                case 1:
//                    if ((grade > 95 && grade <= 100) && (gpa >= 3.0 && gpa < 4)) {
//
//                        Medecine_details();
//
//                    } else {
//                        System.out.println("Your grades don't match with medecine");
//                    }
//                    break ;
//                case 2:
//                    if ((grade > 85 && grade <= 100) && (gpa >= 2.5 && gpa < 4.0)) {
//                        Engineer_details();
//
//                    } else {
//                        System.out.println("Your grades don't match Engineering");
//                    }
//                    System.out.println("restart the program again and Answer the questions again");
//                    break ;
//            }
//
//        } else if (med == cs) {
//            System.out.println("medicine and cs are your first preference ,choose one ");
//            System.out.println("1-Medicine");
//            System.out.println("2-computer science");
//            int ch = input.nextInt();
//            switch (ch) {
//                case 1:
//                    if ((grade > 95 && grade <= 100) && (gpa >= 3.0 && gpa < 4)) {
//
//                        Medecine_details();
//
//                    } else {
//                        return ;
//                    }
//                    break;
//                case 2:
//                    if ((grade > 70 && grade <= 100) && (gpa >= 2.0 && gpa < 4.0)) {
//                        Cs_details();
//                    } else {
//                        System.out.println("Your grades don't match computer science ");
//                    }
//
//                    System.out.println("restart the program again and Answer the questions again");
//                    break ;
//            }
//
//        } else if (med == bus) {
//            System.out.println("medicine and bus are your first preference ,choose one ");
//            System.out.println("1-Medicine");
//            System.out.println("2-business");
//            int ch = input.nextInt();
//            switch (ch) {
//                case 1:
//                    if ((grade > 95 && grade <= 100) && (gpa >= 3.0 && gpa < 4)) {
//
//                        Medecine_details();
//
//                    } else {
//                        System.out.println("Your grades don't match with medecine");
//                    }
//                    break ;
//                case 2:
//                    System.out.println("Business is your first preference");
//                    if ((grade > 60 && gpa <= 100) && (gpa >= 2.0 && gpa < 4.0)) {
//                        Bus_details();
//                    } else {
//                        System.out.println("restart the program again and Answer the questions again ");
//                    }
//                    break ;
//            }
//
//        } else if (med == bus) {
//            System.out.println("medicine and bus are your first preference ,choose one ");
//            System.out.println("1-Medicine");
//            System.out.println("2-business");
//            int ch = input.nextInt();
//            switch (ch) {
//                case 1:
//                    if ((grade > 95 && grade <= 100) && (gpa >= 3.0 && gpa < 4)) {
//
//                        Medecine_details();
//
//                    } else {
//                        System.out.println("Your grades don't match with medecine");
//                    }
//                    break ;
//
//                case 2:
//                    System.out.println("Business is your first preference");
//                    if ((grade > 60 && gpa <= 100) && (gpa >= 2.0 && gpa < 4.0)) {
//                        Bus_details();
//                    } else {
//                        System.out.println("Your grades don't match with Business");
//                    }
//                    System.out.println("restart the program again and Answer the questions again");
//                    break ;
//            }
//
//        } else if (eng == cs) {
//            System.out.println("engineering and computer science are your first preference ,choose one ");
//            System.out.println("1-engineering");
//            System.out.println("2-computer science");
//            int ch = input.nextInt();
//            switch (ch) {
//                case 1:
//                    if ((grade > 85 && grade <= 100) && (gpa >= 2.5 && gpa < 4.0)) {
//                        Engineer_details();
//
//                    } else {
//                        System.out.println("Your grades don't match Engineering");
//                    }
//                    break ;
//                case 2:
//
//                    System.out.println(" computer science is your first preference");
//
//                    if ((grade > 70 && grade <= 100) && (gpa >= 2.0 && gpa < 4.0)) {
//                        Cs_details();
//                    } else {
//                        System.out.println("Your grades don't match computer science ");
//                    }
//                    System.out.println("restart the program again and Answer the questions again");
//                    break ;
//            }
//
//        } else if (eng == bus) {
//            System.out.println("engineering and business are your first preference ,choose one ");
//            System.out.println("1-engineering");
//            System.out.println("2-business");
//            int ch = input.nextInt();
//            switch (ch) {
//                case 1:
//                    if ((grade > 85 && grade <= 100) && (gpa >= 2.5 && gpa < 4.0)) {
//                        Engineer_details();
//                    }
//                     
//                    break ;
//                case 2:
//
//                    
//                    if ((grade > 60 && gpa <= 100) && (gpa >= 2.0 && gpa < 4.0)) {
//                        Bus_details();
//                    } 
//                        
//                    
//                    System.out.println("restart the program again and Answer the questions again");
//                    break ;
//            }
//        } else if (cs == bus) {
//            System.out.println("computer science and business are your first preference ,choose one ");
//            System.out.println("1-computer science");
//            System.out.println("2-business");
//            int ch = input.nextInt();
//            switch (ch) {
//                case 1:
//                   
//
//                    if ((grade > 70 && grade <= 100) && (gpa >= 2.0 && gpa < 4.0)) {
//                        Cs_details();
//                    } 
//                    break ;
//                    
//                case 2:
//
//                   
//                    if ((grade > 60 && gpa <= 100) && (gpa >= 2.0 && gpa < 4.0)) {
//                        Bus_details();
//                    } 
//                    System.out.println("restart the program again and Answer the questions again");
//                    break ;
//            }
//        }
//
//    }

    public static void ReadFiles(String Filename) throws FileNotFoundException, IOException, ClassNotFoundException {

        try {

            FileInputStream fis = new FileInputStream(Filename);
            Scanner sc = new Scanner(fis);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
