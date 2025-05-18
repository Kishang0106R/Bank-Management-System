package bank.management.system;
import java.awt.*;

import javax.swing.*;;
public class Login extends JFrame {
    Login(){
        setTitle("ATUOMATED TELLER MACHINE");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/istockphoto-849792602-612x612.jpg"));
        Image i2 = i1.getImage(). getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        add(label);
        setSize(800, 400);
        setVisible(true);
        setLocation(350, 200);
    }
    public static void main(String[] args) {
        new Login();
    }
}
