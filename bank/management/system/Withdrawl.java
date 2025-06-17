package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Withdrawl extends JFrame implements ActionListener{

    JButton withdrawl, back;
    JTextField amount;
    String pin;

    Withdrawl(String pin){
        this.pin = pin;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Transaction.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0,0, 900, 900);
        add(label);

        JLabel text = new JLabel("Enter the amount you want to withdrawl");
        text.setFont(new Font("Raleway", Font.BOLD, 18));
        text.setBounds(280, 100, 500, 50);
        text.setForeground(Color.WHITE);
        label.add(text);

        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 20));
        amount.setBounds(295, 180, 320, 30);
        label.add(amount);

        withdrawl = new JButton("Withdrawl");
        withdrawl.setFont(new Font("Raleway", Font.BOLD, 20));
        withdrawl.setBounds(464, 290, 190, 30);
        withdrawl.setBackground(Color.WHITE);
        withdrawl.setForeground(Color.BLACK);
        withdrawl.addActionListener(this);
        label.add(withdrawl);

        back = new JButton("Back");
        back.setFont(new Font("Raleway", Font.BOLD, 20));
        back.setBounds(464, 345, 190, 30);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        label.add(back);

        setSize(900, 900);
        setLocation(300, 0);
        //setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == withdrawl){
            String number = amount.getText();
            Date date = new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw.");
            }else{
                try{
                    conn conn = new conn();
                    String query = "insert into bank values('"+date+"', 'Withdrwal', '"+number+"')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null , "rs "+ number+" withraw Successfully");
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        }else if (ae.getSource() == back){
            setVisible(false);
            new transaction(pin).setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        new Withdrawl("");
    }
}
