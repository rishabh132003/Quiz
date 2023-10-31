

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login2 extends JFrame {
    Login2() {
        getContentPane().setBackground(Color.WHITE);

        JLayeredPane layeredPane = getLayeredPane();

        ImageIcon i1 = new ImageIcon("Artboard 1oopsproj.png");
        JLabel image = new JLabel(i1);

        JLabel enterName = new JLabel("Enter Your Name");
        enterName.setFont(new Font("Gabarito", Font.PLAIN, 20));
        enterName.setBounds(582, 368, 300, 25);

        JTextField textField;
        textField = new JTextField("",20);
        textField.setBounds(580, 400, 300, 40);
        textField.setBackground(new Color(196, 148, 192));
        //textField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 4));
        textField.setFont(new Font("Gabarito", Font.PLAIN, 30));
        textField.setForeground(Color.BLACK);

        // Create a JButton for "Create Quiz"
        JButton givequiz = new JButton("Give Quiz");
        givequiz.setBounds(660, 470, 120, 45);
        givequiz.setBackground(new Color(196, 148, 192));
        givequiz.setFont(new Font("Gabarito", Font.PLAIN, 15));
        givequiz.setForeground(Color.BLACK);

        JButton closeWindowButton = new JButton("Close");
        closeWindowButton.setBounds(1250, 700, 120, 45);
        closeWindowButton.setBackground(new Color(196, 148, 192));
        closeWindowButton.setFont(new Font("Gabarito", Font.PLAIN, 15));
        closeWindowButton.setForeground(Color.BLACK);

        // Set the bounds of the image label
        image.setBounds(0, -150, 1500, 1080);

        // Add the image, "Create Quiz" button, and "Give Quiz" button to the layered pane
        layeredPane.add(image, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(givequiz, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(closeWindowButton, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(textField, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(enterName, JLayeredPane.PALETTE_LAYER);

        // Add action listeners for the buttons
        givequiz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle "Create Quiz" button action here
                //JOptionPane.showMessageDialog(null, "Create Quiz button clicked");
                new Quiz(textField.getText());
            }
        });

        closeWindowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle "Create Quiz" button action here
                //JOptionPane.showMessageDialog(null, "Create Quiz button clicked");
                setVisible(false);
            }
        });


        setSize(1920, 1080);
        setLocation(0, 0);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login2();
    }
}
