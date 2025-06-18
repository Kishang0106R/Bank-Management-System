package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

JButton a1, a2, a3, a4, a5, a6, back;
        String pin;

    FastCash(String pin){
        this.pin = pin;
        
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Transaction.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0, 0, 900, 900);
        add(label);

        JLabel text = new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(280, 100, 500, 50);
        text.setFont(new Font("Raleway", Font.BOLD, 25));
        text.setForeground(Color.WHITE);
        label.add(text);

        a1 = new JButton("100");
        a1.setFont(new Font("Raleway", Font.BOLD, 20));
        a1.setBounds(250, 180, 190, 30);
        a1.setForeground(Color.BLACK);
        a1.setBackground(Color.WHITE);
        a1.addActionListener(this);
        label.add(a1);

        a2 = new JButton("500");
        a2.setFont(new Font("Raleway", Font.BOLD, 20));
        a2.setBounds(464, 180, 190, 30);
        a2.setBackground(Color.WHITE);
        a2.setForeground(Color.BLACK);
        a2.addActionListener(this);
        label.add(a2);

        a3 = new JButton("1000");
        a3.setFont(new Font("Raleway", Font.BOLD, 20));
        a3.setBounds(250, 235, 190, 30);
        a3.setForeground(Color.BLACK);
        a3.setBackground(Color.WHITE);
        a3.addActionListener(this);
        label.add(a3);

        a4 = new JButton("2000");
        a4.setFont(new Font("Raleway", Font.BOLD, 20));
        a4.setBounds(464, 235, 190, 30);
        a4.setBackground(Color.WHITE);
        a4.setForeground(Color.BLACK);
        a4.addActionListener(this);
        label.add(a4);

        a5 = new JButton("5000");
        a5.setFont(new Font("Raleway", Font.BOLD, 20));
        a5.setBounds(250, 290, 190, 30);
        a5.setForeground(Color.BLACK);
        a5.setBackground(Color.WHITE);
        a5.addActionListener(this);
        label.add(a5);

        a6 = new JButton("10000");
        a6.setFont(new Font("Raleway", Font.BOLD, 20));
        a6.setBounds(464, 290, 190, 30);
        a6.setBackground(Color.WHITE);
        a6.setForeground(Color.BLACK);
        a6.addActionListener(this);
        label.add(a6);

        back = new JButton("Back");
        back.setFont(new Font("Raleway", Font.BOLD, 20));
        back.setForeground(Color.BLACK);
        back.setBounds(464, 345, 190, 30);
        back.setBackground(Color.WHITE);
        back.addActionListener(this);
        label.add(back);

        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            setVisible(false);
            new transaction(pin).setVisible(true);
        }else {
            String amount = ((JButton)ae.getSource()).getText();
            conn conn = new conn();
            try{
                ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance = 0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                if(ae.getSource() != back && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                Date date = new Date();
                String query = "insert into bank values('"+pin+"', '"+date+"', 'Withdrawal', '"+amount+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+ amount+ " Debited Sucessfully");
                
                setVisible(false);
                new transaction(pin).setVisible(true);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        new FastCash("");
    }
}
