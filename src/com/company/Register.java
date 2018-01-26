package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JPanel implements ActionListener{
    JLabel userL = new JLabel("Choose a Username: ");
    JTextField userTF = new JTextField();
    JLabel passL = new JLabel("Password");
    JPasswordField passTF = new JPasswordField();
    JLabel passLC = new JLabel("Confirm Password");
    JPasswordField passC = new JPasswordField();
    JButton register= new JButton("Register");
    JButton back = new JButton("Back");

    public Register(){
        JPanel loginP = new JPanel();
        loginP.setLayout(new GridLayout(3, 2));
        loginP.add(userL);
        loginP.add(userTF);
        loginP.add(passL);
        loginP.add(passC);
        loginP.add(register);
        loginP.add(back);
        register.addActionListener(this);
        back.addActionListener(this);
        add(loginP);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == back){
            Login login = (Login) getParent();
            login.cl.show(login, "login");
        }
    }

}
