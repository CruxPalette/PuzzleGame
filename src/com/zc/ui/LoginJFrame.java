package com.zc.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    // All codes about login are written here
    public LoginJFrame() {
        // Set width and height
        this.setSize(488, 430);
        // Set title for frame
        this.setTitle("Puzzle Game Login");
        // Set as Top
        this.setAlwaysOnTop(true);
        // Set the frame in the middle
        this.setLocationRelativeTo(null);
        // Set default close mode
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Make this frame visible
        this.setVisible(true);
    }
}
