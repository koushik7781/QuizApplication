package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
     JButton rules,Back;
     JLabel heading , name;
     JTextField tname;
    
    Login(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);
        
        
        //JLabel is used to write text on the frame which we created. 
        
        heading = new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        
        
        
        name = new JLabel("Enter your name : ");
        name.setBounds(625,150,300,60);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,25));
        name.setForeground(Color.BLACK);
        add(name);
        
                tname = new JTextField();
                tname.setBounds(850,170,250,30);
                tname.setFont(new Font("Times new Roman",Font.CENTER_BASELINE,25));
                add(tname);
        
        rules = new JButton("Rules");
        rules.setBounds(925,270,100,25);
        rules.setFont(new Font("Mongolian Baiti",Font.PLAIN,20));
        rules.setForeground(Color.WHITE);
        rules.setBackground(Color.BLACK);
        rules.addActionListener(this);
        add(rules);
        
        
        
        Back = new JButton("Back");
        Back.setBounds(800,270,100,25);
        Back.setFont(new Font("Mongolian Baiti",Font.PLAIN,20));
        Back.setForeground(Color.WHITE);
        Back.setBackground(Color.BLACK);
        Back.addActionListener(this);
        add(Back);
        
        
        setSize(1200,500); 
        setLocation(200,150); //By default The frame will start to orginate from the origin
        setVisible(true);   //By default The frame will be Set false or not visible
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            String name = tname.getText();
            setVisible(false);
            new Rules(name);
        } else if(ae.getSource() ==  Back){
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
       new Login();    //Anonymous object
    }
}
