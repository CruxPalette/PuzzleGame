package com.zc.ui;

import javax.swing.*;
import java.util.Random;

public class GameJFrame extends JFrame {
    // All codes about main frame are written here
    // Create a 2D array
    int[][] data = new int[4][4];
    public GameJFrame(){
        // Initialize the game frame
        initJFrame();

        // Initialize the menu
        initJMenuBar();

        // Initialize the data number in a 2D array
        initData();

        // Initialize the pictures
        initImage();

        // Make this frame visible
        this.setVisible(true);
    }

    private void initData() {
        // Shuffle and insert the numbers to a 2D array
        // Init the temp array
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        // Switch the number in i and index(random)
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        // Group every 4 numbers
        for (int i = 0; i < tempArr.length; i++) {
            data[i / 4][i % 4] = tempArr[i];
        }

    }

    private void initImage() {
        // Outer loop, to put icons in a line
        for (int i = 0; i < 4; i++) {
            // Inner loop to put icons through columns
            for (int j = 0; j < 4; j++) {
                // Create a JLabel (container of all icons)
                JLabel jLabel = new JLabel(new ImageIcon("C:\\Users\\zc\\IdeaProjects\\PuzzleGame\\image\\animal\\animal3\\"+ data[i][j]+".jpg"));
                // Assign the location of the Image
                jLabel.setBounds(105 * j, 105 * i, 105, 105);
                // getContentPane -> acquire the invisible container
                this.getContentPane().add(jLabel);
            }

        }

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

    private void initJFrame() {
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
        // Cancel default layout(in the middle),
        // the icon follows x-y coordinator as you cancel this
        this.setLayout(null);

    }

}
