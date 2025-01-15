package com.zc.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    // All codes about register are written here
    public RegisterJFrame(){
        // Set width and height
        this.setSize(488,500);
        // Set title for frame
        this.setTitle("Puzzle Game Register");
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
