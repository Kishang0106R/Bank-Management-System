package bank.management.system;
import javax.swing.*;
import java.awt.*;

public class transaction extends JFrame {

    transaction() {
        setTitle("Transaction");
        setLayout(null);
        setSize(900, 900);
        setLocation(300, 0);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/transaction.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0, 0, 900, 900);
        add(label);

        setVisible(true);

    }

    public static void main(String[] args) {
        new transaction();
    }
}

