package com.arcreane.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoButtonActionListener extends Frame implements ActionListener {
    Button myButton1;
    Button myButton2;

    public DemoButtonActionListener(String title) throws HeadlessException {
        super(title);
        Panel p = new Panel(new GridLayout(2, 1));
        add(p);
        myButton1 = new Button("Click me!!");
        myButton2 = new Button("No Click me!!");
        p.add(myButton1);
        p.add(myButton2);
        pack();
        setVisible(true);

        myButton1.addActionListener(new MyActionListener("JE suis le premier action Listener"));
        myButton1.addActionListener(new MyActionListener("moi le deuxieme"));
        myButton1.addActionListener(new MyActionListener("encore un Listener"));
        myButton1.addActionListener(new MyActionListener("un dernier pour la route"));
        myButton1.addActionListener(this);
        myButton2.addActionListener(this);
    }

    public static void main(String[] args) {
        DemoButtonActionListener db = new DemoButtonActionListener("Ma demo de listener");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton1)
            myButton2.setLabel("perdu");
        else if (e.getSource() == myButton2)
            myButton1.setLabel("perdu");
    }

    private class MyActionListener implements ActionListener {
        private final String myString;

        public MyActionListener(String s) {
            myString = s;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(myString);
        }
    }
}
