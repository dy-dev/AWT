package com.arcreane;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Listener implements WindowListener, ActionListener {
    Button b1;
    Button b2;
    Button b3;

    public Listener(Button b1, Button b2, Button b3) {
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(((Button)e.getSource()) == b1)
            System.out.println("la personne est d'accord");
        else if(((Button)e.getSource()) == b2)
            System.out.println("la personne a changé d'avis");
        else if(((Button)e.getSource()) == b3)
            System.out.println("la personne veut partir");
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
