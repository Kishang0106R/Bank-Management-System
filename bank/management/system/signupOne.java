package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

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

        JTextField nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        nameTextField.setBounds(300, 120, 400, 30);
        add(nameTextField);

        JLabel fatherName = new JLabel("Father's Name:");
        fatherName.setFont(new Font("Raleway",Font.BOLD, 20));
        fatherName.setBounds(100, 170, 200, 30);
        add(fatherName);

        JTextField FatherTextField = new JTextField();
        FatherTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        FatherTextField.setBounds(300, 170, 400, 30);
        add(FatherTextField);

        JLabel DOB = new JLabel("Date of Birth: ");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 220, 200, 30);
        add(DOB);

        JDateChooser dateChooser = new JDateChooser();    
        dateChooser.setBounds(300, 220, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 270, 200, 30);
        add(gender);

        JRadioButton male = new JRadioButton("male");
        male.setBounds( 300, 270, 120, 30);
        male.setBackground(Color.white);
        add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(421, 270, 120, 30);
        female.setBackground(Color.white);
        add(female);

        JRadioButton other = new JRadioButton("Other");
        other.setBounds(542, 270, 120, 30);
        other.setBackground(Color.white);
        add(other);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);

        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 320, 200, 30);
        add(email);

        JTextField EmailTextField = new JTextField();
        EmailTextField.setFont(new Font("Raleway", Font.BOLD,18));
        EmailTextField.setBounds(300, 320, 400, 30);
        add(EmailTextField);

        JLabel MaritalStatus = new JLabel("Marital Status:");
        MaritalStatus.setFont(new Font("Raleway", Font.BOLD, 20));
        MaritalStatus.setBounds(100, 370, 200, 30);
        add(MaritalStatus);

        JRadioButton married = new JRadioButton("Married");
        married.setBounds(300, 370, 120, 30);
        married.setBackground(Color.white);
        add(married);

        JRadioButton unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(421, 370, 120, 30);
        unmarried.setBackground(Color.white);
        add(unmarried);

        JRadioButton otherStatus = new JRadioButton("Other");
        otherStatus.setBounds(542, 370, 120, 30);
        otherStatus.setBackground(Color.white);
        add(otherStatus);

        ButtonGroup maritalStatusGroup = new ButtonGroup();
        maritalStatusGroup.add(married);
        maritalStatusGroup.add(unmarried);
        maritalStatusGroup.add(otherStatus);

        JLabel Address = new JLabel("Address:");
        Address.setFont(new Font("Raleway", Font.BOLD, 20));
        Address.setBounds(100, 420, 200, 30);
        add(Address);

        JTextField AddressTextField = new JTextField();
        AddressTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        AddressTextField.setBounds(300, 420, 400, 30);
        add(AddressTextField);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 470, 200, 30);
        add(city);

        JTextField CityTextField = new JTextField();
        CityTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        CityTextField.setBounds(300,470, 400, 30);
        add(CityTextField);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 520, 200, 30);
        add(state);

        JTextField StateTextField = new JTextField();
        StateTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        StateTextField.setBounds(300, 520, 400, 30);
        add(StateTextField);

        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 570, 200, 30);
        add(pincode);

        JTextField PinCodeTextField = new JTextField();
        PinCodeTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        PinCodeTextField.setBounds(300, 570, 400, 30);
        add(PinCodeTextField);

        getContentPane().setBackground(Color.white);
        setSize(850, 870);
        setLocation(350, 0);
        setVisible(true);
    }
    public static void main(String[] args) {
        new signupOne();
    }
    
}