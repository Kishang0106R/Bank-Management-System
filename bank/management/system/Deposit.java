package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Deposit extends JFrame implements ActionListener{
    JButton deposit, back;
    JTextField amount;
    String pin;
    
    Deposit(String pin){
        this.pin = pin;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Transaction.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Label = new JLabel(i3);
        Label.setBounds(0, 0, 900, 900);
        add(Label);

        JLabel text = new JLabel("Enter the amount you want to deposit.");
        text.setForeground(Color.WHITE);
        text.setBounds(280, 100, 500, 50);
        text.setFont(new Font("Raleway", Font.BOLD, 18));
        Label.add(text);

        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 20));
        amount.setBounds(295, 180, 320, 30);
        Label.add(amount);

        deposit = new JButton("Deposit");
        deposit.setBounds(464, 290, 190, 30);
        deposit.setFont(new Font("Raleway", Font.BOLD, 20));
        deposit.setBackground(Color.WHITE);
        deposit.setForeground(Color.BLACK);
        deposit.addActionListener(this);
        Label.add(deposit);

        back = new JButton("Back");
        back.setBounds(464, 345, 190, 30);
        back.setFont(new Font("Raleway", Font.BOLD, 20));
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        Label.add(back);

        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
    }
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource() == deposit){

        }else if (ae.getSource() == back){
            setVisible(false);
            new transaction(pin).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Deposit("");
    }
}