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
        try{
            ResultSet rs = c.s.executeQuery("Select * from bank where pin = '"+pin+"'");
            while(rs.next()){
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }else{
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }

        JLabel Text = new JLabel("Your Current Balance is: "+ balance);
        Text.setBounds(250, 180, 400, 30);
        Text.setFont(new Font("Raleway", Font.BOLD, 20));
        Text.setForeground(Color.WHITE);
        label.add(Text);

        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
        setUndecorated(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        String action = ae.getActionCommand();
        if(action.equals("BACK")){
            setVisible(false);
            new transaction(pin).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
