
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {
    
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;
    
    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    
    String name;
    
    Quiz(String name) {
        this.name = name;
        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        
        qno = new JLabel();
        qno.setBounds(100, 250, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);
        
        question = new JLabel();
        question.setBounds(150, 250, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);
        
        questions[0][0] = "What is the national currency of India?";
        questions[0][1] = "Rupee";
        questions[0][2] = "Taka";
        questions[0][3] = "Rupiah";
        questions[0][4] = "Baht";

        questions[1][0] = "Who was the first Prime Minister of India?";
        questions[1][1] = "Jawaharlal Nehru";
        questions[1][2] = "Indira Gandhi";
        questions[1][3] = "Sardar Patel";
        questions[1][4] = "Rajendra Prasad";

        questions[2][0] = "Which river is often referred to as the \"Ganga of the South\"?";
        questions[2][1] = "Yamuna";
        questions[2][2] = "Brahmaputra";
        questions[2][3] = "Godavari";
        questions[2][4] = "Narmada";

        questions[3][0] = "Which famous monument is located in Agra, India, and is one of the Seven Wonders of the World?";
        questions[3][1] = "Red Fort";
        questions[3][2] = "Qutub Minar";
        questions[3][3] = "Hawa Mahal";
        questions[3][4] = "Taj Mahal";

        questions[4][0] = "Who is known as the \"Father of the Indian Constitution\"?";
        questions[4][1] = "Mahatma Gandhi";
        questions[4][2] = "Jawaharlal Nehru";
        questions[4][3] = "B. R. Ambedkar";
        questions[4][4] = "Sardar Patel";

        questions[5][0] = "In which year did India gain independence from British colonial rule?";
        questions[5][1] = "1945";
        questions[5][2] = "1947";
        questions[5][3] = "1952";
        questions[5][4] = "1943";

        questions[6][0] = "What is the national emblem of India?";
        questions[6][1] = "Lotus";
        questions[6][2] = "Peacock";
        questions[6][3] = "Ashoka Chakra";
        questions[6][4] = "Lion Capital of Ashoka";

        questions[7][0] = "Who is often referred to as the \"Missile Man of India\"?";
        questions[7][1] = "Indira Gandhi";
        questions[7][2] = "Atal Bihari Vajpayee";
        questions[7][3] = "Dr. A. P. J. Abdul Kalam";
        questions[7][4] = "Rajiv Gandhi";

        questions[8][0] = "Which state in India is famous for its backwaters and houseboat tourism?";
        questions[8][1] = "Kerala";
        questions[8][2] = "Goa";
        questions[8][3] = "Rajasthan";
        questions[8][4] = "Tamil Nadu";

        questions[9][0] = "What is the largest state in India by area?";
        questions[9][1] = "Maharashtra";
        questions[9][2] = "Rajasthan";
        questions[9][3] = "Madhya Pradesh";
        questions[9][4] = "Uttar Pradesh";
        
        answers[0][1] = "Rupee";
        answers[1][1] = "Jawaharlal Nehru";
        answers[2][1] = "Godavari";
        answers[3][1] = "Taj Mahal";
        answers[4][1] = "B. R. Ambedkar";
        answers[5][1] = "1947";
        answers[6][1] = "Lion Capital of Ashoka";
        answers[7][1] = "Dr. A. P. J. Abdul Kalam";
        answers[8][1] = "Kerala";
        answers[9][1] = "Rajasthan";
        
        opt1 = new JRadioButton();
        opt1.setBounds(170, 320, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(170, 360, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(170, 400, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(170, 440, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(1100, 550, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.addActionListener(this);
        add(next);
        
        
        submit = new JButton("Submit");
        submit.setBounds(1100, 710, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);


        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score(name, score);
        }
    }
    
    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        groupoptions.clearSelection();
    }
    
    public static void main(String[] args) {
        new Quiz("User");
    }
}