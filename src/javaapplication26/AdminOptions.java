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
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author johna
 */
public class AdminOptions 
extends JFrame 
	implements ActionListener
{

    private Container c;
    private JLabel title;

  private JButton sub; 
    private JButton addu; 
    private JButton addf; 
    private JButton show; 
    

public AdminOptions(){



 setTitle("CAREER ANALYSIS SYSTEM_ADMIN"); 
		setBounds(300, 190, 900, 300); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setResizable(false); 

		c = getContentPane(); 
		c.setLayout(null); 
                
                title = new JLabel("OPTIONS"); 
		title.setFont(new Font("Arial", Font.PLAIN, 30)); 
		title.setSize(500, 30); 
		title.setLocation(370, 30); 
		c.add(title); 

                
                 addu = new JButton("Add User"); 
		addu.setFont(new Font("Arial", Font.PLAIN, 17)); 
		addu.setSize(150, 30); 
		addu.setLocation(450, 150); 
		addu.addActionListener(this); 
		c.add(addu); 

                
                 show = new JButton("Show User"); 
		show.setFont(new Font("Arial", Font.PLAIN, 17)); 
		show.setSize(150, 30); 
		show.setLocation(270, 150);
		show.addActionListener(this); 
		c.add(show); 
                   
                
                addf = new JButton("Add Faculty"); 
		addf.setFont(new Font("Arial", Font.PLAIN, 17)); 
		addf.setSize(150, 30); 
		addf.setLocation(100, 150); 
		addf.addActionListener(this); 
		c.add(addf); 


                
                    
                sub = new JButton("Next"); 
		sub.setFont(new Font("Arial", Font.PLAIN, 20)); 
		sub.setSize(150, 30); 
		sub.setLocation(650, 150); 
		sub.addActionListener(this); 
		c.add(sub); 

               
                
                 setVisible(true);
                
}

public static void main(String[] args)
{
    
    AdminOptions a = new AdminOptions();
    
    
}





     @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
