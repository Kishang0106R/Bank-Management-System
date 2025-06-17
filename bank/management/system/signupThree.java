package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class signupThree extends JFrame implements ActionListener {
    JRadioButton SavingAccount, FixedDipositAccount, CurrentAccount, RecurringDepositAccount;
    JCheckBox atmCard, internetBanking, mobileBanking, emailAlert, chequeBook, eStatement, declaration;
    JButton submit, cancel;
    String formNo;

    signupThree(String formNo){
        this.formNo = formNo;

        setTitle("New Account Application Form - Page 3");
        setLayout(null);
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 38));
        l1.setBounds(170, 20, 600, 40);
        add(l1);

        JLabel type = new JLabel("Account Type:");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 140, 200, 30);
        add(type);

        SavingAccount = new JRadioButton("Savings Account");
        SavingAccount.setFont(new Font("Raleway", Font.BOLD, 20));
        SavingAccount.setBounds(310, 140, 200, 30);
        SavingAccount.setBackground(Color.white);
        add(SavingAccount);

        FixedDipositAccount = new JRadioButton("Fixed Deposit Account");
        FixedDipositAccount.setFont(new Font("Raleway", Font.BOLD, 20));
        FixedDipositAccount.setBounds(510, 140, 250, 30);
        FixedDipositAccount.setBackground(Color.white);
        add(FixedDipositAccount);

        CurrentAccount = new JRadioButton("Current Account");
        CurrentAccount.setFont(new Font("Raleway", Font.BOLD, 20));
        CurrentAccount.setBounds(310, 200, 200, 30);
        CurrentAccount.setBackground(Color.white);
        add(CurrentAccount);

        RecurringDepositAccount = new JRadioButton("Recurring Deposit Account");
        RecurringDepositAccount.setFont(new Font("Raleway", Font.BOLD, 20));
        RecurringDepositAccount.setBounds(510, 200, 300, 30);
        RecurringDepositAccount.setBackground(Color.white);
        add(RecurringDepositAccount);

        ButtonGroup groupAccountType = new ButtonGroup();
        groupAccountType.add(CurrentAccount);
        groupAccountType.add(SavingAccount);
        groupAccountType.add(FixedDipositAccount);
        groupAccountType.add(RecurringDepositAccount);

        JLabel cardNumber = new JLabel ("Card Number:");
        cardNumber.setFont(new Font("Raleway", Font.BOLD, 22));
        cardNumber.setBounds(100, 260, 200, 30);
        add(cardNumber);

        JLabel cardNumberValue = new JLabel("XXXX-XXXX-XXXX-1234");
        cardNumberValue.setFont(new Font("Raleway", Font.BOLD, 22));
        cardNumberValue.setBounds(310, 260, 300, 30);
        add(cardNumberValue);

        JLabel cardNumberHint = new JLabel("Your 16-digit Card Number");
        cardNumberHint.setFont(new Font("Raleway", Font.BOLD, 12));
        cardNumberHint.setBounds(310, 280, 300, 20);
        add(cardNumberHint);

        JLabel pin = new JLabel("pin:");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 320, 200, 30);
        add(pin);

        JLabel pinValue = new JLabel("XXXX");
        pinValue.setFont(new Font("Raleway", Font.BOLD, 22));
        pinValue.setBounds(310, 320, 300, 30);
        add(pinValue);

        JLabel pinHint = new JLabel("YOur 4-digit Password");
        pinHint.setFont(new Font("Raleway", Font.BOLD, 12));
        pinHint.setBounds(310, 340, 300, 20);
        add(pinHint);

        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 400, 210, 30);
        add(services);

        atmCard = new JCheckBox("ATM Card");
        atmCard.setFont(new Font("Raleway", Font.BOLD, 20));
        atmCard.setBounds(310, 400, 200, 30);
        atmCard.setBackground(Color.white);
        add(atmCard);

        internetBanking = new JCheckBox("Internet Banking");
        internetBanking.setFont(new Font("Raleway", Font.BOLD, 20));
        internetBanking.setBounds(510, 400, 200, 30);
        internetBanking.setBackground(Color.white);
        add(internetBanking);

        mobileBanking = new JCheckBox("Mobile Banking");
        mobileBanking.setFont(new Font("Raleway", Font.BOLD, 20));
        mobileBanking.setBounds(310, 450, 200, 30);
        mobileBanking.setBackground(Color.white);
        add(mobileBanking);

        emailAlert = new JCheckBox("Email Alert");
        emailAlert.setFont(new Font("Raleway", Font.BOLD, 20));
        emailAlert.setBounds(510, 450, 200, 30);
        emailAlert.setBackground(Color.white);
        add(emailAlert);

        chequeBook = new JCheckBox("Cheque Book");
        chequeBook.setFont(new Font("Raleway", Font.BOLD, 20));
        chequeBook.setBounds(310, 500, 200, 30);
        chequeBook.setBackground(Color.white);
        add(chequeBook);

        eStatement = new JCheckBox("E-Statement");
        eStatement.setFont(new Font("Raleway", Font.BOLD, 20));
        eStatement.setBounds(510, 500, 200, 30);
        eStatement.setBackground(Color.white);
        add(eStatement);

        declaration = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.");        
        declaration.setFont(new Font("Raleway", Font.BOLD, 12));
        declaration.setBounds(100, 600, 700, 30);
        declaration.setBackground(Color.white);
        add(declaration);

        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway", Font.BOLD, 20));
        submit.setBounds(250, 680, 150, 40);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway", Font.BOLD, 20));     
        cancel.setBounds(450, 680, 150, 40);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);

        setSize(850, 870);
        setLocation(350, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String accountype = null;
            if(SavingAccount.isSelected()){
                accountype = "Saving Account";
            }else if (FixedDipositAccount.isSelected()){
                accountype = "Fixed Deposit Account";
            }else if (CurrentAccount.isSelected()){
                accountype = "Current Account";
            }else if (RecurringDepositAccount.isSelected()){
                accountype = "Recurring Deposit Account";
            }

            Random random = new Random();
            String cardNumber = "" + Math.abs(random.nextLong()% 90000000L + 5040936000000000L);
            String pin = "" + Math.abs(random.nextLong()% 9000L + 1000L);
            String services = "";
            if(atmCard.isSelected()){
                services += "ATM Card";
            }
            if(internetBanking.isSelected()){
                services += "Internet Banking";
            }
            if(mobileBanking.isSelected()){
                services += "Mobile Banking";
            }
            if(emailAlert.isSelected()){
                services += "Email Alert";
            }
            if(chequeBook.isSelected()){
                services += "Cheque Book";
            }
            if(eStatement.isSelected()){
                services += "E-Statement";
            }


            try{
                if(accountype.equals("")){
                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                }else if(cardNumber.equals("")){
                    JOptionPane.showMessageDialog(null, "Card Number is Required");
                }else if(pin.equals("")){
                    JOptionPane.showMessageDialog(null, "Pin is Required");
                }else if(services.equals("")){
                    JOptionPane.showMessageDialog(null, "Services are Required");
                }else if(!declaration.isSelected()){
                    JOptionPane.showMessageDialog(null, "You must declare that the details are correct");
                }else{
                    conn c = new conn();
                    String query1 = "insert into signupThree values('"+formNo+"','"+ accountype +"', '"+ cardNumber +"', '"+ pin +"', '"+ services +"')";
                    String query2 = "insert into login values('"+formNo+"','"+ cardNumber +"', '"+ pin +"')";

                    c.s.executeUpdate(query1);
                    c.s.executeUpdate(query2);

                    JOptionPane.showMessageDialog(null, "Card Number: " + cardNumber + "\nPin: " + pin);
                    setVisible(false);
                    new Deposit(pin).setVisible(true);
                }
            }catch(Exception e){
                System.out.println(e);
            }

        }else if(ae.getSource() == cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new signupThree("");
    }
}
