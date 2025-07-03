package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class MiniStatement extends JFrame implements ActionListener {
    String pin;
    JButton back;

    MiniStatement(String pin){
        this.pin = pin;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/paper.avif"));
        Image i2 = i1.getImage().getScaledInstance(500, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0,0, 500, 700);
        add(label);

        back = new JButton("BACK");
        back.setFont(new Font("Raleway", Font.BOLD, 20));
        back.setBounds(300, 650, 190, 30);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setBorder(null);
        back.addActionListener(this);
        label.add(back);

        JLabel text = new JLabel("Indian Bank");
        text.setFont(new Font("Raleway", Font.BOLD, 20));
        text.setBounds(200, 50, 500, 50);
        text.setForeground(Color.BLACK);
        label.add(text);

        JTextArea mini = new JTextArea();
        mini.setBounds(20, 170, 440, 460);
        mini.setFont(new Font("Raleway", Font.PLAIN, 18));
        mini.setEditable(false);
        mini.setOpaque(false);
        mini.setForeground(Color.BLACK);
        label.add(mini);

        JLabel card = new JLabel();
        card.setBounds(20, 130, 700, 50);
        card.setFont(new Font("Raleway", Font.BOLD, 18));
        card.setForeground(Color.BLACK);
        label.add(card);

        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from login where pin = '"+pin+"'");
            while(rs.next()){
                card.setText("Card Number: " + rs.getString("cardnumber").substring(0,4) + "XXXXXXXX" + rs.getString("cardnumber").substring(12) + " | Pin: " + rs.getString("pin"));
            }
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pin+"'");
            while(rs.next()){
                mini.append(rs.getString("date") + "    " + rs.getString("type") + "    " + rs.getString("amount") + "\n");
            }
        }catch(Exception e){
            System.out.println(e);
        }

        

        setUndecorated(true);
        setSize(500, 700);
        setLocation(300, 40);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == back){
            setVisible(false);
            new transaction(pin).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new MiniStatement("");
    }
    
}
