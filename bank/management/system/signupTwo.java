package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class signupTwo extends JFrame implements ActionListener {

    JTextField pantextfield, aadharTextField;
    JRadioButton existingYes, existingNo;
    JCheckBox seniorCheckBox, notSeniorCheckBox;
    JComboBox religionCombo, categoryCombo, incomeCombo, educationCombo, occupationCombo;
    JButton next;
    String formNo;


    signupTwo(String formNo) {
        this.formNo = formNo;
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
        religionCombo = new JComboBox<String>(valReligions);
        religionCombo.setBackground(Color.white);
        religionCombo.setBounds(350, 120, 400, 30);
        add(religionCombo);

        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 180, 100, 30);
        add(category);

        String valcategory[] = {"General", "OBC", "SC", "ST", "Other"};
        categoryCombo = new JComboBox<String>(valcategory);
        categoryCombo.setBackground(Color.white);
        categoryCombo.setBounds(350, 180, 400, 30);
        add(categoryCombo);

        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 100, 30);
        add(income);

        String valIncome[]= {"Null", "<1,00,00","<2,00,000", "<5,00,000","<10,00,000", "More then 10,00,000"};
        incomeCombo = new JComboBox<String>(valIncome);
        incomeCombo.setBackground(Color.white);
        incomeCombo.setBounds(350, 240, 400, 30);
        add(incomeCombo);

        JLabel education =  new JLabel("Educational Qualification:");
        education.setFont(new Font("Raleway", Font.BOLD, 20));
        education.setBounds(100, 300, 250, 30);
        add(education);

        String valEducation[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Others"};
        educationCombo = new JComboBox<String>(valEducation);
        educationCombo.setBackground(Color.white);
        educationCombo.setBounds(350, 300, 400, 30);
        add(educationCombo);

        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 360, 200, 30);
        add(occupation);

        String valOccupation[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Others"};
        occupationCombo = new JComboBox<String>(valOccupation);
        occupationCombo.setBackground(Color.white);
        occupationCombo.setBounds(350, 360, 400, 30);
        add(occupationCombo); 

        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100, 420, 200, 30);
        add(pan);

        pantextfield = new JTextField();
        pantextfield.setFont(new Font("Raleway", Font.BOLD, 18));
        pantextfield.setBounds(350, 420, 400, 30);
        add(pantextfield);

        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(100, 480, 200, 30);
        add(aadhar);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        aadharTextField.setBounds(350, 480, 400, 30);
        add(aadharTextField);

        JLabel senior = new JLabel("Senior Citizen:");
        senior.setFont(new Font("Raleway", Font.BOLD, 20));
        senior.setBounds(100, 540, 200, 30);
        add(senior);

        seniorCheckBox = new JCheckBox("Yes");
        seniorCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        seniorCheckBox.setBackground(Color.white);
        seniorCheckBox.setBounds(350, 540, 100, 30);
        add(seniorCheckBox);

        notSeniorCheckBox = new JCheckBox("No");
        notSeniorCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));  
        notSeniorCheckBox.setBackground(Color.white);
        notSeniorCheckBox.setBounds(500, 540, 100, 30);
        add(notSeniorCheckBox);

        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(seniorCheckBox);
        seniorGroup.add(notSeniorCheckBox);

        JLabel existing = new JLabel("Existing Account:");
        existing.setFont(new Font("Raleway", Font.BOLD, 20));
        existing.setBounds(100, 600, 200, 30);
        add(existing);

        existingYes = new JRadioButton("Yes");
        existingYes.setBackground(Color.white);
        existingYes.setBounds(350, 600, 100, 30);
        add(existingYes);

        existingNo = new JRadioButton("No");
        existingNo.setBackground(Color.white);
        existingNo.setBounds(500, 600, 100, 30);
        add(existingNo);

        ButtonGroup existingGroup = new ButtonGroup();
        existingGroup.add(existingYes);
        existingGroup.add(existingNo);

        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
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
        String religion = (String) religionCombo.getSelectedItem();
        String category = (String) categoryCombo.getSelectedItem();
        String income = (String) incomeCombo.getSelectedItem();
        String education = (String) educationCombo.getSelectedItem();
        String occupation = (String) occupationCombo.getSelectedItem();
        String pan = pantextfield.getText();
        String aadhar = aadharTextField.getText();
        String seniorCitizen = null;
        if(seniorCheckBox.isSelected()){
            seniorCitizen = "Yes";
        }else if(notSeniorCheckBox.isSelected()){
            seniorCitizen = "No";
        }
        String existingAccount = null;
        if(existingYes.isSelected()){
            existingAccount = "Yes";
        }else if(existingNo.isSelected()){
            existingAccount = "No";
        }

        try{
            if(religion.equals("")){
                JOptionPane.showMessageDialog(null, "Religion is required");
            } else if(category.equals("")){
                JOptionPane.showMessageDialog(null, "Category is required");
            } else if(income.equals("")){
                JOptionPane.showMessageDialog(null, "Income is required");
            } else if(education.equals("")){
                JOptionPane.showMessageDialog(null, "Education is required");
            } else if(occupation.equals("")){
                JOptionPane.showMessageDialog(null, "Occupation is required");
            } else if(pan.equals("")){
                JOptionPane.showMessageDialog(null, "PAN Number is required");
            } else if(aadhar.equals("")){
                JOptionPane.showMessageDialog(null, "Aadhar Number is required");
            } else if(seniorCitizen == null){
                JOptionPane.showMessageDialog(null, "Senior Citizen status is required");
            } else if(existingAccount == null){
                JOptionPane.showMessageDialog(null, "Existing Account status is required");
            } else {
                conn conn = new conn();
                String query = "insert into signupTwo values('"+formNo+"', '"+religion+"', '"+category+"', '"+income+"', '"+education+"', '"+occupation+"', '"+pan+"', '"+aadhar+"', '"+seniorCitizen+"', '"+existingAccount+"')";
                conn.s.executeUpdate(query);
                setVisible(false);
                new signupThree(formNo).setVisible(true);
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
    public static void main(String[] args) {
        new signupTwo("");
    }
}