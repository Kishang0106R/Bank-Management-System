package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class signupOne extends JFrame {

    signupOne(){

        setLayout(null);

        Random ran = new Random();
        long random = (Math.abs(ran.nextLong() % 9000L) + 1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        JLabel personDetails = new JLabel("page 1: Personal Details");
        personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personDetails.setBounds(290, 60, 600, 40);
        add(personDetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 120, 100, 30);
        add(name);

        JLabel fatherName = new JLabel("Father's Name:");
        fatherName.setFont(new Font("Raleway",Font.BOLD, 20));
        fatherName.setBounds(100, 170, 200, 30);
        add(fatherName);

        JLabel DOB = new JLabel("Date of Birth: ");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 220, 200, 30);
        add(DOB);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 270, 200, 30);
        add(gender);

        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 320, 200, 30);
        add(email);

        JLabel MaritalStatus = new JLabel("Marital Status:");
        MaritalStatus.setFont(new Font("Raleway", Font.BOLD, 20));
        MaritalStatus.setBounds(100, 370, 200, 30);
        add(MaritalStatus);

        JLabel Address = new JLabel("Address:");
        Address.setFont(new Font("Raleway", Font.BOLD, 20));
        Address.setBounds(100, 420, 200, 30);
        add(Address);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 470, 200, 30);
        add(city);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 520, 200, 30);
        add(state);

        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 570, 200, 30);
        add(pincode);

        

        getContentPane().setBackground(Color.white);
        setSize(850, 870);
        setLocation(350, 0);
        setVisible(true);
    }
    public static void main(String[] args) {
        new signupOne();
    }
    
}
