package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class BalanceEnquiry extends JFrame implements ActionListener {

    JButton back;
    String pin;

    BalanceEnquiry(String pin) {
        this.pin = pin;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Transaction.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0, 0, 900, 900);
        add(label);

        back = new JButton("BACK");
        back.setBounds(464, 345, 190, 30);
        back.setFont(new Font("Raleway", Font.BOLD, 20));
        back.addActionListener(this);
        label.add(back);

        conn c = new conn();
        int balance = 0;

        try {
            ResultSet rs = c.s.executeQuery("SELECT * FROM bank WHERE pin = '" + pin + "'");
            while (rs.next()) {
                String type = rs.getString("type");
                int amt = Integer.parseInt(rs.getString("amount"));

                if (type.equalsIgnoreCase("Deposit")) {
                    balance += amt;
                } else if (type.equalsIgnoreCase("Withdrawal") || type.equalsIgnoreCase("Fast Cash")) {
                    balance -= amt;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        JLabel text = new JLabel("Your Current Balance is: Rs " + balance);
        text.setBounds(250, 180, 400, 30);
        text.setFont(new Font("Raleway", Font.BOLD, 20));
        text.setForeground(Color.WHITE);
        label.add(text);

        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
        setUndecorated(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            setVisible(false);
            new transaction(pin).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
