package com.fileencryption.ui;

import com.fileencryption.dao.UserDAO;
import com.fileencryption.model.User;
import com.fileencryption.service.EmailService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignupFrame extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton signupButton;

    public SignupFrame() {
        setTitle("Signup");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(10, 20, 80, 25);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(100, 20, 165, 25);
        add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(100, 50, 165, 25);
        add(passwordField);

        signupButton = new JButton("Signup");
        signupButton.setBounds(10, 80, 255, 25);
        add(signupButton);

        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                if (email.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No field should remain empty");
                    return;
                }
                String otp = String.valueOf(new Random().nextInt(999999));
                User user = new User();
                user.setEmail(email