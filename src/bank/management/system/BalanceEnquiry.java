package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {

    String pin;

    JLabel label2;

    JButton d;


    BalanceEnquiry(String pin)
    {

        this.pin = pin;

        ImageIcon i1 = new ImageIcon((ClassLoader.getSystemResource("icon/atm2.png")));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("Your Current Balance is Rs.");
        label1.setFont(new Font("System", Font.BOLD,16));
        label1.setBounds(430,180,700,35);
        label1.setForeground(Color.WHITE);
        l3.add(label1);

        label2 = new JLabel();
        label2.setFont(new Font("System", Font.BOLD,16));
        label2.setBounds(430,220,400,35);
        label2.setForeground(Color.WHITE);
        l3.add(label2);


        d = new JButton("Back");
        d.setBounds(700,406,150,35);
        d.setBackground(new Color(65,125,128));
        d.setForeground(Color.WHITE);
        d.addActionListener(this);
        l3.add(d);

        int balance = 0;
        try{
            Connn c = new Connn();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
            while (resultSet.next()) {
                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        }catch(Exception E)
        {
            E.printStackTrace();
        }

        label2.setText(""+balance);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Main_Class(pin);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
