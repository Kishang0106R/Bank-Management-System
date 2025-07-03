package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener {

    JPasswordField pinTextField, rePinTextField;
    JButton changePinButton, backButton;
    String pin;

    PinChange(String pin){
        this.pin = pin;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Transaction.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);   
        JLabel label = new JLabel(i3);
        label.setBounds(0, 0, 900, 900);
        add(label);

        JLabel text = new JLabel("Change Your Pin");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD, 26));
        text.setBounds(350, 100, 500, 50);
        label.add(text);

        JLabel pinLabel = new JLabel("New Pin: ");
        pinLabel.setForeground(Color.WHITE);
        pinLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        pinLabel.setBounds(250, 180, 150, 30);
        label.add(pinLabel);

        pinTextField = new JPasswordField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 20));
        pinTextField.setBounds(464, 180, 200, 30);
        label.add(pinTextField);

        JLabel rePinLabel = new JLabel("Re-Enter New Pin: ");
        rePinLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        rePinLabel.setForeground(Color.WHITE);
        rePinLabel.setBounds(250, 235, 200, 30);
        label.add(rePinLabel);

        rePinTextField = new JPasswordField();
        rePinTextField.setFont(new Font("Raleway", Font.BOLD, 20));
        rePinTextField.setBounds(464, 235, 200, 30);
        label.add(rePinTextField);

        changePinButton = new JButton("Change Pin");
        changePinButton.setBounds(464, 290, 190, 30);
        changePinButton.setFont(new Font("Raleway", Font.BOLD, 20));
        changePinButton.addActionListener(this);
        label.add(changePinButton);

        backButton = new JButton("BACK");
        backButton.setBounds(464, 345, 190, 30);
        backButton.setFont(new Font("Raleway", Font.BOLD, 20));
        backButton.addActionListener(this);
        label.add(backButton);

        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == changePinButton){
            try{
                String newPin = pinTextField.getText();
                String rePin = rePinTextField.getText();

                if(!newPin.equals(rePin)){
                    JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                    return;
                }

                if(newPin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter a new PIN");
                    return;
                }
                if(rePin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please re-enter the new PIN");
                    return;
                }

                conn conn = new conn();
                String query1 = "update bank set pin = '"+rePin+"' where pin = '"+pin+"'";
                String query2 = "update login set pin = '"+rePin+"' where pin = '"+pin+"'";
                String query3 = "update signupThree set pin = '"+rePin+"' where pin = '"+pin+"'";

                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);
                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new transaction(rePin).setVisible(true);
            }catch(Exception e){
                System.out.println(e);
            }
        }else {
            setVisible(false);
            new transaction(pin).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new PinChange("").setVisible(true);
    }
}
