package com.zc.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    // All codes about main frame are written here
    public GameJFrame(){
        // Initialize the game frame
        init();

        // Initialize the menu
        initJMenuBar();

        // Make this frame visible
        this.setVisible(true);
    }

    private void initJMenuBar() {
        // Initialize the menu
        // Create an entire menu(JMenuBar)
        JMenuBar jMenuBar = new JMenuBar();

        // Create two objects of two options (function, about us)
        JMenu functionJMenu = new JMenu("Function");
        JMenu aboutJMenu = new JMenu("About");

        // Create the items under options
        JMenuItem replayItem = new JMenuItem("Replay");
        JMenuItem reLoginItem = new JMenuItem("ReLogin");
        JMenuItem closeItem = new JMenuItem("Close");

        JMenuItem accountItem = new JMenuItem("QR Code");

        // Add items into the options
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        // Add two options into JMenuBar
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        // Set Menu for main frame
        this.setJMenuBar(jMenuBar);
    }

    private void init() {
        // Set width and height
        this.setSize(603,680);
        // Set title for frame
        this.setTitle("Puzzle Game 1.0");
        // Set as Top
        this.setAlwaysOnTop(true);
        // Set the frame in the middle
        this.setLocationRelativeTo(null);
        // Set default close mode
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
