/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Muhhammed Adel
 */
public class LoginPage implements ActionListiner {
    
    JButton Login = new JButton("Login");
    JFrame frame = new JFrame();
    JLabel Password = new JLabel("Password");
    JLabel Username = new JLabel("Username");
    JTextArea User = new JTextArea();
    JTextArea Pass = new JTextArea();
    
    LoginPage() {
        // Frame 

        frame.setSize(400, 500);
        frame.setBackground(Color.gray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        // Password Label
        Password.setFont(new Font("Ariel", Font.PLAIN, 20));
        Password.setLocation(20, 100);
        Password.setSize(190, 20);
        Pass.setSize(190, 20);
        Pass.setLocation(120, 100);
        frame.add(Password);
        frame.add(Pass);

        // User Label
        User.setLocation(40, 100);
        Username.setFont(new Font("Ariel", Font.PLAIN, 20));
        Username.setLocation(20, 60);
        Username.setSize(190, 20);
        User.setLocation(120, 60);
        User.setSize(190, 20);
        frame.add(Username);
        frame.add(User);

        // Login Button
        Login.setSize(80, 40);
        Login.setLocation(150, 200);
        frame.add(Login);
        frame.setVisible(true);
        
//        if (Username.equals("Username") && Password.equals("Password")) {
//            
//            
//        }
//        
    }

    public static void main(String[] args) {
        LoginPage w = new LoginPage();
        
    }
    
}
