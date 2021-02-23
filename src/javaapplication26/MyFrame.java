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

    
    
    
    // Java program to implement 
// a Simple Registration Form 
// using Java Swing 


public class MyFrame 
	extends JFrame 
	implements ActionListener { 

	// Components of the Form 
	private Container c; 
	private JLabel title; 
	private JLabel name; 
        private JLabel gpa; 
        private JComboBox grade;
	private JTextField tname; 
	private JLabel mno; 
	private JTextField tmno; 
	private JLabel gender; 
	private JRadioButton male; 
	private JRadioButton female; 
	private ButtonGroup gengp; 
	private JLabel dob; 
	private JComboBox date; 
	private JComboBox month; 
	private JComboBox year; 
	private JLabel add; 
	private JTextArea tadd; 
	private JCheckBox term; 
	private JButton sub; 
	private JButton reset; 
	private JTextArea tout; 
	private JLabel res; 
	private JTextArea resadd; 

	private String dates[] 
		= { "1", "2", "3", "4", "5", 
			"6", "7", "8", "9", "10", 
			"11", "12", "13", "14", "15", 
			"16", "17", "18", "19", "20", 
			"21", "22", "23", "24", "25", 
			"26", "27", "28", "29", "30", 
			"31" }; 
	private String months[] 
		= { "Jan", "feb", "Mar", "Apr", 
			"May", "Jun", "July", "Aug", 
			"Sep", "Oct", "Nov", "Dec" }; 
	private String years[] 
		= { "1995", "1996", "1997", "1998", 
			"1999", "2000", "2001", "2002", 
			"2003", "2004", "2005", "2006", 
			"2007", "2008", "2009", "2010", 
			"2011", "2012", "2013", "2014", 
			"2015", "2016", "2017", "2018", 
			"2019" }; 
        private String grades[] 
		= { "0","0.1", "0.2", "0.3", "0.4", "0.5", 
			"0.6", "0.7", "0.8", "0.9", "1.0", 
			"1.1", "1.2", "1.3", "1.4", "1.5", 
			"1.6", "1.7", "1.8", "1.9", "2.0", 
			"2.1", "2.2", "2.3", "2.4", "2.5", 
			"2.6", "2.7", "2.8", "2.9", "3.0", 
			"3.1", "3.2", "3.3", "3.4", "3.5", 
                        "3.6", "3.7", "3.8", "3.9", "4.0" }; 

	// constructor, to initialize the components 
	// with default values. 
	public MyFrame() 
	{ 
		setTitle("CAREER ANALYSIS SYSTEM"); 
		setBounds(300, 90, 900, 600); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setResizable(false); 

		c = getContentPane(); 
		c.setLayout(null); 

		title = new JLabel("CAREER ANALYSIS SYSTEM"); 
		title.setFont(new Font("Arial", Font.PLAIN, 30)); 
		title.setSize(500, 30); 
		title.setLocation(250, 30); 
		c.add(title); 

		name = new JLabel("Name"); 
		name.setFont(new Font("Arial", Font.PLAIN, 20)); 
		name.setSize(100, 20); 
		name.setLocation(100, 100); 
		c.add(name); 

		tname = new JTextField(); 
		tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
		tname.setSize(190, 20); 
		tname.setLocation(200, 100); 
		c.add(tname); 

		mno = new JLabel("Mobile"); 
		mno.setFont(new Font("Arial", Font.PLAIN, 20)); 
		mno.setSize(100, 20); 
		mno.setLocation(100, 150); 
		c.add(mno); 

		tmno = new JTextField(); 
		tmno.setFont(new Font("Arial", Font.PLAIN, 15)); 
		tmno.setSize(150, 20); 
		tmno.setLocation(200, 150); 
		c.add(tmno); 

		gender = new JLabel("Gender"); 
		gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
		gender.setSize(100, 20); 
		gender.setLocation(100, 200); 
		c.add(gender); 

		male = new JRadioButton("Male"); 
		male.setFont(new Font("Arial", Font.PLAIN, 15)); 
		male.setSelected(true); 
		male.setSize(75, 20); 
		male.setLocation(200, 200); 
		c.add(male); 

		female = new JRadioButton("Female"); 
		female.setFont(new Font("Arial", Font.PLAIN, 15)); 
		female.setSelected(false); 
		female.setSize(80, 20); 
		female.setLocation(275, 200); 
		c.add(female); 

		gengp = new ButtonGroup(); 
		gengp.add(male); 
		gengp.add(female); 

		dob = new JLabel("Date Of Birth"); 
		dob.setFont(new Font("Arial", Font.PLAIN, 15)); 
		dob.setSize(200, 20); 
		dob.setLocation(100, 250); 
		c.add(dob); 

		date = new JComboBox(dates); 
		date.setFont(new Font("Arial", Font.PLAIN, 15)); 
		date.setSize(50, 20); 
		date.setLocation(200, 250); 
		c.add(date); 

		month = new JComboBox(months); 
		month.setFont(new Font("Arial", Font.PLAIN, 15)); 
		month.setSize(60, 20); 
		month.setLocation(250, 250); 
		c.add(month); 

		year = new JComboBox(years); 
		year.setFont(new Font("Arial", Font.PLAIN, 15)); 
		year.setSize(60, 20); 
		year.setLocation(320, 250); 
		c.add(year); 

		add = new JLabel("Email"); 
		add.setFont(new Font("Arial", Font.PLAIN, 20)); 
		add.setSize(100, 20); 
		add.setLocation(100, 300); 
		c.add(add); 

		tadd = new JTextArea(); 
		tadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
		tadd.setSize(200, 20); 
		tadd.setLocation(200, 300); 
		tadd.setLineWrap(true); 
		c.add(tadd); 
                
                gpa = new JLabel("Gpa"); 
		gpa.setFont(new Font("Arial", Font.PLAIN, 20)); 
		gpa.setSize(100, 20); 
		gpa.setLocation(100, 350); 
		c.add(gpa); 
                
                
                grade = new JComboBox(grades); 
		grade.setFont(new Font("Arial", Font.PLAIN, 15)); 
		grade.setSize(50, 20); 
		grade.setLocation(200, 350); 
		c.add(grade); 


		term = new JCheckBox("Accept Terms And Conditions."); 
		term.setFont(new Font("Arial", Font.PLAIN, 15)); 
		term.setSize(250, 20); 
		term.setLocation(150, 400); 
		c.add(term); 

		sub = new JButton("Submit"); 
		sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
		sub.setSize(100, 20); 
		sub.setLocation(150, 450); 
		sub.addActionListener(this); 
		c.add(sub); 

		reset = new JButton("Reset"); 
		reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
		reset.setSize(100, 20); 
		reset.setLocation(270, 450); 
		reset.addActionListener(this); 
		c.add(reset); 

		tout = new JTextArea(); 
		tout.setFont(new Font("Arial", Font.PLAIN, 15)); 
		tout.setSize(300, 400); 
		tout.setLocation(500, 100); 
		tout.setLineWrap(true); 
		tout.setEditable(false); 
		c.add(tout); 

		res = new JLabel(""); 
		res.setFont(new Font("Arial", Font.PLAIN, 20)); 
		res.setSize(500, 25); 
		res.setLocation(100, 500); 
		c.add(res); 

		resadd = new JTextArea(); 
		resadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
		resadd.setSize(200, 75); 
		resadd.setLocation(580, 175); 
		resadd.setLineWrap(true); 
		c.add(resadd); 

		setVisible(true); 
	} 

	// method actionPerformed() 
	// to get the action performed 
	// by the user and act accordingly 
	public void actionPerformed(ActionEvent e) 
	{ 
		if (e.getSource() == sub) { 
			if (term.isSelected()) { 
				String data1; 
				String data 
					= "Name : "
					+ tname.getText() + "\n"
					+ "Mobile : "
					+ tmno.getText() + "\n"; 
				if (male.isSelected()) 
					data1 = "Gender : Male"
							+ "\n"; 
				else
					data1 = "Gender : Female"
							+ "\n"; 
				String data2 
					= "Date OF Birth : "
					+ (String)date.getSelectedItem() 
					+ "/" + (String)month.getSelectedItem() 
					+ "/" + (String)year.getSelectedItem() 
					+ "\n"; 

				String data3 = "Email : " + tadd.getText()+"\n"; 
                                 String data4 
                                        ="Gpa :"
                                       + (String)grade.getSelectedItem();
                                
				tout.setText(data + data1 + data2 + data3 +data4); 
				tout.setEditable(false); 
                                
                               
				res.setText("Analyized Successfully.."); 
			} 
			else { 
				tout.setText(""); 
				resadd.setText(""); 
				res.setText("Please accept the terms & conditions.."); 
			} 
		} 

		else if (e.getSource() == reset) { 
			String def = ""; 
			tname.setText(def); 
			tadd.setText(def); 
			tmno.setText(def); 
			res.setText(def); 
			tout.setText(def); 
			term.setSelected(false); 
			date.setSelectedIndex(0); 
			month.setSelectedIndex(0); 
			year.setSelectedIndex(0); 
                        grade.setSelectedIndex(0); 
			resadd.setText(def); 
		} 
	} 
} 



    
    
