package com.arcreane;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyLayout extends Frame {

    String textOk = "Ok";

    public MyLayout(String s) throws HeadlessException {
        super(s);
        GridLayout g = new GridLayout(6, 1);
        g.setHgap(10);
        setLayout(g);

        setBackground(Color.lightGray);
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("Languages");
        menuBar.add(menu);
        MenuItem menuItem = new MenuItem("Java");
        menu.add(menuItem);
        setMenuBar(menuBar);

        Label label = new Label("TextField");
        TextField tf = new TextField("Hello");
        insertElements(label, tf);

        Label lchoice = new Label("Choices");
        Choice c = new Choice();
        c.add("Solaris");
        c.add("Linux");
        c.add("Windows");
        insertElements(lchoice, c);

        Label lList = new Label("List");
        List list = new List();
        list.add("Solaris");
        list.add("Linux");
        list.add("Windows");
        insertElements(lList, list);

        Checkbox c1 = new Checkbox("Solaris");
        Checkbox c2 = new Checkbox("Linux");
        Checkbox c3 = new Checkbox("Windows");

        Panel p = insertElements(c1, c2);
        p.add(c3);

        CheckboxGroup cg = new CheckboxGroup();
        Checkbox r1 = new Checkbox("Solaris", cg, true);
        Checkbox r2 = new Checkbox("Linux", cg, true);
        Checkbox r3 = new Checkbox("Windows", cg, true);

        Panel pradio = insertElements(r1, r2);
        pradio.add(r3);

        Button b1 = new Button(textOk);
        Button b2 = new Button("Annuler");
        Button b3 = new Button("Quitter");
        Listener l = new Listener(b1, b2, b3);

        menuItem.addActionListener(l);


        addWindowListener(new WindowListener() {
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
        });


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        b2.addActionListener(l);
        b3.addActionListener(l);
        Panel pButton = insertElements(b1, b2);
        pButton.add(b3);

        setMinimumSize(new Dimension(200, 200));
        pack();
        setVisible(true);
    }

    private Panel insertElements(Component c1, Component c2) {
        Panel p = new Panel();
        p.setLayout(new FlowLayout(FlowLayout.LEFT));

        p.add(c1);
        p.add(c2);
        add(p);
        return p;
    }

    public static void main(String[] args) {
        // write your code here
        MyLayout m = new MyLayout("Welcome to Webstart!!!!");

    }


}
