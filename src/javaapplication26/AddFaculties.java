/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author johna
 */
public class AddFaculties 
        extends JFrame 
	implements ActionListener{
    
    
    
       private Container c;
    private JLabel title;
    private JLabel user; 
    private JLabel password;
    private JTextField tuser;
    private JTextField tpassword;
    private JTextArea tout;
     private JButton sub; 

     public AddFaculties(){ 
     
     setTitle("CAREER ANALYSIS SYSTEM"); 
		setBounds(300, 90, 900, 600); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setResizable(false); 

		c = getContentPane(); 
		c.setLayout(null); 
                
                title = new JLabel("Add Colleage Details"); 
		title.setFont(new Font("Arial", Font.PLAIN, 30)); 
		title.setSize(500, 30); 
		title.setLocation(300, 30); 
		c.add(title); 

                
                user=new JLabel("College name:");
                user.setFont(new Font("Arial", Font.PLAIN, 20));
                user.setSize(500, 30); 
		user.setLocation(100, 100); 
		c.add(user); 
                
                
                
                tuser = new JTextField(); 
		tuser.setFont(new Font("Arial", Font.PLAIN, 15)); 
		tuser.setSize(150, 30); 
		tuser.setLocation(280, 100); 
		c.add(tuser); 

                
                
                password=new JLabel("College Info:");
                password.setFont(new Font("Arial", Font.PLAIN, 20));
                password.setSize(500, 30); 
		password.setLocation(100, 150); 
		c.add(password); 

                
                tpassword = new JTextField(); 
		tpassword.setFont(new Font("Arial", Font.PLAIN, 15)); 
		tpassword.setSize(450, 250); 
		tpassword.setLocation(280, 150); 
		c.add(tpassword); 

                
                
                  
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args)
    {
        AddFaculties a = new AddFaculties ();
        
        
    }
    
}
