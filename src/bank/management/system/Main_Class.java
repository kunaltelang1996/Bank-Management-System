package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_Class extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7;

    String pin;

    Main_Class(String pin)
    {

        this.pin = pin;


        ImageIcon i1 = new ImageIcon((ClassLoader.getSystemResource("icon/atm2.png")));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("Please Select your Transaction");
        label1.setBounds(430,180,700,35);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD,28));
        l3.add(label1);

        b1 = new JButton("Deposit");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(6,125,128));
        b1.setBounds(405,272,150,32);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("Cash Withdrawl");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(6,125,128));
        b2.setBounds(705,272,150,32);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("Fast Cash");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(6,125,128));
        b3.setBounds(405,319,150,32);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("Mini Statement");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(6,125,128));
        b4.setBounds(705,319,150,32);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("Pin Change");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(6,125,128));
        b5.setBounds(405,366,150,32);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("Balance Enquiry");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(6,125,128));
        b6.setBounds(705,366,150,32);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("Exit");
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(6,125,128));
        b7.setBounds(705,411,150,32);
        b7.addActionListener(this);
        l3.add(b7);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try{
            if(e.getSource()==b1)
            {
                new Deposit(pin);
                setVisible(false);
            }else if (e.getSource()==b7)
            {
                System.exit(0);
            } else if (e.getSource()==b2) {
                new Withdrawl(pin);
                setVisible(false);
            } else if (e.getSource()==b6) {
                setVisible(false);
                new BalanceEnquiry(pin);
            }

        }catch(Exception E)
        {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Main_Class("");
    }
}
