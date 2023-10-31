
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLayeredPane layeredPane = getLayeredPane();

        ImageIcon i1 = new ImageIcon("Artboard 1oopsproj.png");
        JLabel image = new JLabel(i1);
        image.setBounds(0, -150, 1500, 1080);
        
        JLabel heading = new JLabel("Thankyou " + name );
        heading.setBounds(590, 400, 800, 45);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 40));
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(590, 450, 300, 45);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 40));
        add(lblscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(660, 550, 150, 60);
        submit.addActionListener(this);
        add(submit);

        layeredPane.add(image, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(heading, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(lblscore, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(submit, JLayeredPane.PALETTE_LAYER);

        setSize(1920, 1080);
        setLocation(0, 0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login2();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}