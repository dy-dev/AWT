package com.arcreane.awt;

import java.awt.*;

public class Main extends Frame {
    public Main(String s) throws HeadlessException {
        super(s);
        setSize(new Dimension(300,300));
        Button b = new Button("Hello World");
        b.setMinimumSize(new Dimension(100,35));
        add(b, BorderLayout.NORTH);
        Button bcenter = new Button("Je suis au centre");
        add(bcenter, BorderLayout.CENTER);
        Button bEast = new Button("Je suis à l'est");
        add(bEast, BorderLayout.EAST);
        Button bwest = new Button("Je suis à l'ouset");
        add(bwest, BorderLayout.WEST );
        //pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        // write your code here
        Main m = new Main("Welcome to Webstart!!!!");
    }
}
