package bank.management.system;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;;
public class Login extends JFrame implements ActionListener{
    Login(){
        setTitle("ATUOMATED TELLER MACHINE");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/images.png"));
        Image i2 = i1.getImage(). getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 100, 150, 150);
        add(label);
        getContentPane().setBackground(Color.white);


        JLabel text = new JLabel("welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 40));
        text.setBounds(250, 30, 500, 40);
        add(text);

        JLabel cardno = new JLabel("Card NO: ");
        cardno.setFont(new Font("osward", Font.BOLD, 20));
        cardno.setBounds(250, 130, 150, 40);
        add(cardno);

        JTextField CardTextField = new JTextField();
        CardTextField.setBounds(340, 130, 400, 40);
        add(CardTextField);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("osward", Font.BOLD, 20));
        pin.setBounds(250, 190, 400, 40);
        add(pin);

        JPasswordField pinTextField = new JPasswordField();
        pinTextField.setBounds(340, 190, 400, 40);
        add(pinTextField);

        JButton login = new JButton("SIGN IN");
        login.setBounds(380, 250, 100, 40);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        add(login);

        JButton clear = new JButton("CLEAR");
        clear.setBounds(580, 250, 100, 40);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        add(clear);

        JButton signup = new JButton("SIGN UP");
        signup.setBounds(480, 310, 100, 40);
        signup.setBackground(Color.black);  
        signup.setForeground(Color.white);
        add(signup);

        setSize(800, 410);
        setVisible(true);
        setLocation(350, 200);
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
    public static void main(String[] args) {
        new Login();
    }
}
