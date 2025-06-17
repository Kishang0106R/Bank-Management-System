package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class transaction extends JFrame implements ActionListener {

    JButton deposit, withdrawl, fastcash, ministatement, pinchange, balanceenquiry, exit;
    String pin;

    transaction(String pin) {
        this.pin = pin;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Transaction.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0, 0, 900, 900);
        add(label);
        
        JLabel text = new JLabel("please select your transaction");
        text.setBounds(280, 100, 500, 50);
        text.setFont(new Font("Raleway", Font.BOLD, 25));
        text.setForeground(Color.WHITE);
        label.add(text);

        deposit = new JButton("Deposit");
        deposit.setBounds(250, 180, 190, 30);
        deposit.setFont(new Font("Raleway", Font.BOLD, 20));
        deposit.setBackground(Color.WHITE);
        deposit.setForeground(Color.BLACK);
        deposit.addActionListener(this);
        label.add(deposit);

        withdrawl = new JButton("Withdrawl");
        withdrawl.setBounds(464, 180, 190, 30);
        withdrawl.setFont(new Font("Raleway", Font.BOLD, 20));
        withdrawl.setBackground(Color.WHITE);
        withdrawl.setForeground(Color.BLACK);
        withdrawl.addActionListener(this);
        label.add(withdrawl);

        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(250, 235, 190, 30);
        fastcash.setFont(new Font("Raleway", Font.BOLD, 20));
        fastcash.setBackground(Color.WHITE);
        fastcash.setForeground(Color.BLACK);
        fastcash.addActionListener(this);
        label.add(fastcash);

        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(464, 235, 190, 30);
        ministatement.setFont(new Font("Raleway", Font.BOLD, 20));
        ministatement.setBackground(Color.WHITE);
        ministatement.setForeground(Color.BLACK);
        ministatement.addActionListener(this);
        label.add(ministatement);

        pinchange = new JButton("Pin Change");
        pinchange.setBounds(250, 290, 190, 30);
        pinchange.setFont(new Font("Raleway", Font.BOLD, 20));
        pinchange.setBackground(Color.WHITE);
        pinchange.setForeground(Color.BLACK);
        pinchange.addActionListener(this);
        label.add(pinchange);

        balanceenquiry = new JButton("Balance Enquiry");
        balanceenquiry.setBounds(464, 290, 190, 30);
        balanceenquiry.setFont(new Font("Raleway", Font.BOLD, 20));
        balanceenquiry.setForeground(Color.BLACK);
        balanceenquiry.setBackground(Color.WHITE);
        balanceenquiry.addActionListener(this);
        label.add(balanceenquiry);

        exit = new JButton("Exit");
        exit.setBounds(250, 345, 190, 30);
        exit.setFont(new Font("Raleway", Font.BOLD, 20));
        exit.setBackground(Color.WHITE);
        exit.setForeground(Color.BLACK);
        exit.addActionListener(this);
        label.add(exit);

        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == exit){
            System.exit(0);
        }else if(ae.getSource() == deposit){
            setVisible(false);
            new Deposit(pin).setVisible(true);
        }else if(ae.getSource() == withdrawl){
            setVisible(false);
            new Withdrawl(pin).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new transaction("");
    }
}

