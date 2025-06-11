package bank.management.system;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

public class signupThree extends JFrame {
    JRadioButton r1, r2, r3, r4;
    signupThree(){

        setTitle("New Account Application Form - Page 3");
        setLayout(null);
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 38));
        l1.setBounds(170, 20, 600, 40);
        add(l1);

        JLabel type = new JLabel("Account Type:");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 140, 200, 30);
        add(type);

        r1 = new JRadioButton("Savings Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 20));
        r1.setBounds(300, 140, 200, 30);
        r1.setBackground(Color.white);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 20));
        r2.setBounds(500, 140, 250, 30);
        r2.setBackground(Color.white);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 20));
        r3.setBounds(300, 200, 200, 30);
        r3.setBackground(Color.white);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 20));
        r4.setBounds(500, 200, 300, 30);
        r4.setBackground(Color.white);
        add(r4);

        setSize(850, 870);
        setLocation(350, 0);
        setVisible(true);
    }
    public static void main(String[] args) {
        new signupThree();
    }
}
