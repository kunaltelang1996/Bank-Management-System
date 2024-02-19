package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {

    String pin;

    TextField textField;

    JButton d,b;

    Withdrawl(String pin)
    {

        this.pin = pin;

        ImageIcon i1 = new ImageIcon((ClassLoader.getSystemResource("icon/atm2.png")));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("Maximum Withdrawl is Rs. 10,000");
        label1.setFont(new Font("System", Font.BOLD,16));
        label1.setBounds(460,180,700,35);
        label1.setForeground(Color.WHITE);
        l3.add(label1);

        JLabel label2 = new JLabel("Please Enter your Amount");
        label2.setFont(new Font("System", Font.BOLD,16));
        label2.setBounds(460,220,400,35);
        label2.setForeground(Color.WHITE);
        l3.add(label2);

        textField = new TextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(460,260,320,25);
        textField.setFont(new Font("Raleway", Font.BOLD,22));
        l3.add(textField);

        d = new JButton("Withdraw");
        d.setBounds(700,362,150,35);
        d.setBackground(new Color(65,125,128));
        d.setForeground(Color.WHITE);
        d.addActionListener(this);
        l3.add(d);

        b = new JButton("Back");
        b.setBounds(700,406,150,35);
        b.setBackground(new Color(65,125,128));
        b.setForeground(Color.WHITE);
        b.addActionListener(this);
        l3.add(b);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==d) {
            try {

                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
                } else {
                    Connn c = new Connn();
                    ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }

                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }
                    c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','Withdrawl','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debitted Successfully");
                    setVisible(false);
                    new Main_Class(pin);
                }

            } catch (Exception E) {
                E.printStackTrace();
            }
        }else if (e.getSource()==b)
        {
            setVisible(false);
            new Main_Class(pin);
        }
    }

    public static void main(String[] args) {

        new Withdrawl("");
    }
}
