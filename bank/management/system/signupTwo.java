package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class signupTwo extends JFrame implements ActionListener {

    signupTwo(){
        setTitle("NEW ACCOUNT APPLICATION FORM-PAGE 2");
        setLayout(null);
        

        JLabel formno = new JLabel("Page 2: Additional Details");
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(170, 20, 600, 40);
        add(formno);

        getContentPane().setBackground(Color.white);
        setSize(850, 870);
        setLocation(350, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

    }
    public static void main(String[] args) {
        new signupTwo();
    }
}
