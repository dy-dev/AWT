package com.arcreane.awt;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public static void main(String[] args) {
	// write your code here

        MainWindow windows = new MainWindow();
        windows.setDefaultCloseOperation(EXIT_ON_CLOSE);
        windows.setSize(new Dimension(600,600));
        BorderLayout bl = (BorderLayout) windows.getLayout();

        JToolBar menuBar = new JToolBar();
        menuBar.add(new JButton("First"));
        menuBar.add(new JButton("second"));
        menuBar.add(new JButton("Third"));
        windows.add(menuBar, BorderLayout.NORTH);
         windows.add(new JButton("Bottom"), BorderLayout.SOUTH);

        Container c = windows.getContentPane();
        c.add(new JButton("My Button"));
        windows.setVisible(true);
    }
}
