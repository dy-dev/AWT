package com.arcreane;

import org.w3c.dom.Text;
import java.awt.*;
public class Thomas extends  Frame{
    public Thomas(String s) {
        super(s);
        MenuBar myMenuBar = new MenuBar();
        Menu myMenu = new Menu("Language");
        MenuItem menuItem = new MenuItem("Java");
        Label myLabel = new Label("Texte");
        TextField myTextField = new TextField();
        Panel myPanel = new Panel();
        myPanel.add(myLabel);
        myPanel.add(myTextField);
        add(myPanel);
        myMenu.add(menuItem);
        myMenuBar.add(myMenu);
        setMenuBar(myMenuBar);
    }
    public static void main(String[] args) {
        Thomas myFrame = new Thomas("welcome");
        myFrame.setMinimumSize(new Dimension(200, 400));
        myFrame.pack();
        myFrame.setVisible(true);
    }
}