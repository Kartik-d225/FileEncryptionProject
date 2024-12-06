package com.fileencryption.ui;

import javax.swing.*;

public class MainFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SignupFrame signupFrame = new SignupFrame();
            signupFrame.setVisible(true);
        });
    }
}