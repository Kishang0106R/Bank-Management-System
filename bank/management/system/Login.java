package bank.management.system;
import java.awt.*;

import javax.swing.*;;
public class Login extends JFrame {
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

        JTextField pinTextField = new JPasswordField();
        pinTextField.setBounds(340, 190, 400, 40);
        add(pinTextField);

        setSize(800, 400);
        setVisible(true);
        setLocation(350, 200);
    }
    public static void main(String[] args) {
        new Login();
    }
}
