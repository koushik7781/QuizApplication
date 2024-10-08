package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    Score(String name , int score){
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);
        
        JLabel heading = new JLabel("Thankyou " + name + " for taking up the Quiz");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma",Font.PLAIN,28));
        add(lblscore);
        
            JButton ssubmit = new JButton("Play Again");
            ssubmit.setBounds(380,270,140,40);
            ssubmit.setFont(new Font("Tahoma",Font.PLAIN,22));
            ssubmit.setBackground(Color.BLACK);
            ssubmit.addActionListener(this);
            ssubmit.setForeground(Color.WHITE);
            add(ssubmit);
            
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    
    
    public static void main(String[] args){
        new Score("user",0);
    }
}
