package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Signup extends JFrame {

    JRadioButton r1, r2, r3, r4;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    JTextField textName, textFname, textEmail, textadd, textcity, textPC, textState;

    JDateChooser dateChooser;
    Signup()
    {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO" + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Ralway", Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Ralway", Font.BOLD, 22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Ralway", Font.BOLD, 22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelfName.setBounds(100,240,200,30);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway", Font.BOLD, 14));
        textFname.setBounds(300,240,400,30);
        add(textFname);

        JLabel DOB = new JLabel("Date Of Birth :");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender :");
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelemail = new JLabel("Email Id :");
        labelemail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelemail.setBounds(100,390,300,30);
        add(labelemail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);


        JLabel labelMS = new JLabel("Marital Status :");
        labelMS.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMS.setBounds(100,440,300,30);
        add(labelMS);

        r3 = new JRadioButton("Married");
        r3.setBounds(300,440,100,30);
        r3.setBackground(new Color(222,255,228));
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(r3);

        r4 = new JRadioButton("Unmarried");
        r4.setBounds(450,440,100,30);
        r4.setBackground(new Color(222,255,228));
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        add(r4);


        JLabel labeladd = new JLabel("Address :");
        labeladd.setFont(new Font("Raleway", Font.BOLD, 20));
        labeladd.setBounds(100,490,300,30);
        add(labeladd);

        textadd = new JTextField();
        textadd.setFont(new Font("Raleway", Font.BOLD,14));
        textadd.setBounds(300,490,400,30);
        add(textadd);

        JLabel labelcity = new JLabel("City :");
        labelcity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelcity.setBounds(100,540,300,30);
        add(labelcity);

        textcity = new JTextField();
        textcity.setFont(new Font("Raleway", Font.BOLD,14));
        textcity.setBounds(300,540,400,30);
        add(textcity);

        JLabel labelPC = new JLabel("Pin Code :");
        labelPC.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPC.setBounds(100,590,300,30);
        add(labelPC);

        textPC = new JTextField();
        textPC.setFont(new Font("Raleway", Font.BOLD,14));
        textPC.setBounds(300,590,400,30);
        add(textPC);

        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("Raleway", Font.BOLD, 20));
        labelstate.setBounds(100,640,300,30);
        add(labelstate);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD,14));
        textState.setBounds(300,640,400,30);
        add(textState);








//        JLabel labelno = new JLabel("Phone No. :");
//        labelno.setFont(new Font("Raleway", Font.BOLD, 20));
//        labelno.setBounds(100,290,300,30);
//        add(labelno);
//
//        textNo = new JTextField();
//        textNo.setFont(new Font("Raleway", Font.BOLD,14));
//        textNo.setBounds(300,290,400,30);
//        add(textNo);
//
//        JLabel labelemail = new JLabel("Email Id :");
//        labelemail.setFont(new Font("Raleway", Font.BOLD, 20));
//        labelemail.setBounds(100,340,300,30);
//        add(labelemail);
//
//        textEmail = new JTextField();
//        textEmail.setFont(new Font("Raleway", Font.BOLD,14));
//        textEmail.setBounds(300,340,400,30);
//        add(textEmail);






        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Signup();
    }
}
