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

        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100, 120, 100, 30);
        add(religion);

        String valReligions[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        JComboBox religionCombo = new JComboBox(valReligions);
        religionCombo.setBackground(Color.white);
        religionCombo.setBounds(350, 120, 400, 30);
        add(religionCombo);

        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 180, 100, 30);
        add(category);

        String valcategory[] = {"General", "OBC", "SC", "ST", "Other"};
        JComboBox categoryCombo = new JComboBox(valcategory);
        categoryCombo.setBackground(Color.white);
        categoryCombo.setBounds(350, 180, 400, 30);
        add(categoryCombo);

        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 100, 30);
        add(income);

        JLabel education =  new JLabel("Educational Qualification:");
        education.setFont(new Font("Raleway", Font.BOLD, 20));
        education.setBounds(100, 300, 250, 30);
        add(education);

        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 360, 200, 30);
        add(occupation);

        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100, 420, 200, 30);
        add(pan);

        JTextField pantextfield = new JTextField();
        pantextfield.setFont(new Font("Raleway", Font.BOLD, 18));
        pantextfield.setBounds(350, 420, 400, 30);
        add(pantextfield);

        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(100, 480, 200, 30);
        add(aadhar);

        JLabel senior = new JLabel("Senior Citizen:");
        senior.setFont(new Font("Raleway", Font.BOLD, 20));
        senior.setBounds(100, 540, 200, 30);
        add(senior);

        JLabel existing = new JLabel("Existing Account:");
        existing.setFont(new Font("Raleway", Font.BOLD, 20));
        existing.setBounds(100, 600, 200, 30);
        add(existing);

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
