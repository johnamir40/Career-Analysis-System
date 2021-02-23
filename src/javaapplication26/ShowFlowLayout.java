// Java program to implement 
// a Simple Registration Form 
// using Java Swing 
package javaapplication26;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javaapplication26.CareerAnalysisSystem.GenerateID;
import static javaapplication26.CareerAnalysisSystem.GeneratePassword;
import javaapplication26.LoginPage;

class MainPage extends JFrame implements ActionListener {

    // Components of the Form 
    private Container frame;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup genderbutton;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel email;
    private JTextArea emailText;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
    private JButton proceed;

    private JLabel Logintitle;
    private String dates[]
            = {"1", "2", "3", "4", "5",
                "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15",
                "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25",
                "26", "27", "28", "29", "30",
                "31"};
    private String months[]
            = {"Jan", "feb", "Mar", "Apr",
                "May", "Jun", "July", "Aug",
                "Sup", "Oct", "Nov", "Dec"};
    private String years[]
            = {"1995", "1996", "1997", "1998",
                "1999", "2000", "2001", "2002",
                "2003", "2004", "2005", "2006",
                "2007", "2008", "2009", "2010",
                "2011", "2012", "2013", "2014",
                "2015", "2016", "2017", "2018",
                "2019"};

    // constructor, to initialize the components 
    // with default values. 
    String ID = GenerateID();
    String Password = GeneratePassword();

    public MainPage() {
        setTitle(" Career analysis system ");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);

        frame = getContentPane();
        frame.setLayout(null);

        title = new JLabel("Career analysis system");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(500, 30);
        title.setLocation(150, 30);
        frame.add(title);

        Logintitle = new JLabel("Career analysis system");
        Logintitle.setFont(new Font("Arial", Font.PLAIN, 30));
        Logintitle.setSize(500, 30);
        Logintitle.setLocation(250, 30);
        Logintitle.setVisible(false);
        frame.add(Logintitle);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        frame.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        frame.add(tname);

        mno = new JLabel("Mobile");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(100, 150);
        frame.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(200, 150);
        frame.add(tmno);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 200);
        frame.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 200);
        frame.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 200);
        frame.add(female);

        genderbutton = new ButtonGroup();
        genderbutton.add(male);
        genderbutton.add(female);

        dob = new JLabel("DOB");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 250);
        frame.add(dob);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 250);
        frame.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(250, 250);
        frame.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(320, 250);
        frame.add(year);

        email = new JLabel("Email");
        email.setFont(new Font("Arial", Font.PLAIN, 20));
        email.setSize(60, 20);
        email.setLocation(100, 300);
        frame.add(email);

        emailText = new JTextArea();
        emailText.setFont(new Font("Arial", Font.PLAIN, 15));
        emailText.setSize(150, 20);
        emailText.setLocation(200, 300);
        emailText.setLineWrap(true);
        frame.add(emailText);

        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 400);
        frame.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        frame.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        frame.add(reset);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        frame.add(res);
            
        JTextArea info = new JTextArea();
        info.setSize(350,100);
        info.setLocation(400,170);
        frame.add(info);
        setVisible(true);
    }

    // method actionPerformed() 
    // to get the action performed 
    // by the user and act accordingly 
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                
                String data
                        = " ID  : "
                        + ID + "\n"
                        + " Password : "
                        + Password + "\n";
                
                res.setText("Registration Successfully..");
                reset.setText("Proceed");

            } else {
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the"
                        + " terms & conditions..");
                reset.setText("reset");
            }
        } else if (e.getSource() == reset) {

            LoginPage myLogin = new LoginPage();

        }
        
    }
   
}

// Driver Code 
class Registration {

    public static void main(String[] args) throws Exception {
        MainPage f = new MainPage();
    }
}

