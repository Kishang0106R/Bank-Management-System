package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class signupOne extends JFrame implements ActionListener {

    long random;
    JTextField nameTextField, FatherTextField, EmailTextField, AddressTextField, CityTextField, StateTextField, PinCodeTextField;
    JButton next;
    JRadioButton male, female, other, married, unmarried, otherStatus;
    JDateChooser dateChooser;

    signupOne(){

        setLayout(null);

        Random ran = new Random();
        random = (Math.abs(ran.nextLong() % 9000L) + 1000L);

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

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        nameTextField.setBounds(300, 120, 400, 30);
        add(nameTextField);

        JLabel fatherName = new JLabel("Father's Name:");
        fatherName.setFont(new Font("Raleway",Font.BOLD, 20));
        fatherName.setBounds(100, 170, 200, 30);
        add(fatherName);

        FatherTextField = new JTextField();
        FatherTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        FatherTextField.setBounds(300, 170, 400, 30);
        add(FatherTextField);

        JLabel DOB = new JLabel("Date of Birth: ");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 220, 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();    
        dateChooser.setBounds(300, 220, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 270, 200, 30);
        add(gender);

        male = new JRadioButton("male");
        male.setBounds( 300, 270, 120, 30);
        male.setBackground(Color.white);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(421, 270, 120, 30);
        female.setBackground(Color.white);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 320, 200, 30);
        add(email);

        EmailTextField = new JTextField();
        EmailTextField.setFont(new Font("Raleway", Font.BOLD,18));
        EmailTextField.setBounds(300, 320, 400, 30);
        add(EmailTextField);

        JLabel MaritalStatus = new JLabel("Marital Status:");
        MaritalStatus.setFont(new Font("Raleway", Font.BOLD, 20));
        MaritalStatus.setBounds(100, 370, 200, 30);
        add(MaritalStatus);

        married = new JRadioButton("Married");
        married.setBounds(300, 370, 120, 30);
        married.setBackground(Color.white);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(421, 370, 120, 30);
        unmarried.setBackground(Color.white);
        add(unmarried);

        otherStatus = new JRadioButton("Other");
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

        AddressTextField = new JTextField();
        AddressTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        AddressTextField.setBounds(300, 420, 400, 30);
        add(AddressTextField);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 470, 200, 30);
        add(city);

        CityTextField = new JTextField();
        CityTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        CityTextField.setBounds(300,470, 400, 30);
        add(CityTextField);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 520, 200, 30);
        add(state);

        StateTextField = new JTextField();
        StateTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        StateTextField.setBounds(300, 520, 400, 30);
        add(StateTextField);

        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 570, 200, 30);
        add(pincode);

        PinCodeTextField = new JTextField();
        PinCodeTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        PinCodeTextField.setBounds(300, 570, 400, 30);
        add(PinCodeTextField);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 20));
        next.setBounds(620, 650, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.white);
        setSize(850, 870);
        setLocation(350, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String formno = ""+ random;
        String name = nameTextField.getText();
        String fatherName = FatherTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }else if(female.isSelected()) {
            gender = "Female";
        }
        String email = EmailTextField.getText();
        String maritalStatus = null;
        if(married.isSelected()){
            maritalStatus = "Married";
        }else if(unmarried.isSelected()) {
            maritalStatus = "Unmarried";
        }else if(otherStatus.isSelected()) {
            maritalStatus = "Other";
        }
        String address = AddressTextField.getText();
        String city = CityTextField.getText();
        String state = StateTextField.getText();
        String pincode = PinCodeTextField.getText();

        try {
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "name is Required");
            }else if(fatherName.equals("")){
                JOptionPane.showMessageDialog(null, "Father's name is Required");
            }else if(dob.equals("")){
                JOptionPane.showMessageDialog(null, "Date of Birth is Required");
            }else if(gender == null){
                JOptionPane.showMessageDialog(null, "Gender is Required");
            }else if(email.equals("")){
                JOptionPane.showMessageDialog(null, "Email is Required");
            }else if(maritalStatus == null){
                JOptionPane.showMessageDialog(null, "Marital Status is Required");
            }else if(address.equals("")){
                JOptionPane.showMessageDialog(null, "Address is Required");
            }else if(city.equals("")){
                JOptionPane.showMessageDialog(null, "City is Required");
            }else if(state.equals("")){
                JOptionPane.showMessageDialog(null, "State is Required");
            }else if(pincode.equals("")){
                JOptionPane.showMessageDialog(null, "Pincode is Required");
            }else{
                conn c = new conn();
                String query = "INSERT INTO signupone (formno, name, fatherName, dob, gender, email, marital_status, address, city, pincode, state) " +
                "VALUES('" + formno + "','" + name + "','" + fatherName + "','" + dob + "','" + gender + "','" + email + "','" + maritalStatus + "','" + address + "','"+city+"','" + pincode + "','" + state + "')";
                c.s.executeUpdate(query);
                setVisible(false);
                new signupTwo(formno).setVisible(true);
            }

        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new signupOne();
    }
    
}