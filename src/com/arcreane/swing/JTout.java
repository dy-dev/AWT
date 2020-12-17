package com.arcreane.swing;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.util.Arrays;
import java.util.Vector;

public class JTout extends JFrame {
    public static void main(String[] args) {
        JTout tout = new JTout();
    }

    public JTout(){
        super("Mon Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var mn = new JMenuBar();
        mn.add(new JMenu("Langages"));
        mn.add(new JMenu("Plaf"));
        getRootPane().setJMenuBar(mn);

        JPanel panneau = (JPanel) getContentPane();
        panneau.setLayout(new BoxLayout(panneau, BoxLayout.Y_AXIS));

        addTextFieldComponent(panneau);
        addComboxComponent(panneau);

        JPanel ListPanel = new JPanel();
        ListPanel.setLayout(new BoxLayout(ListPanel, BoxLayout.X_AXIS));
        ListPanel.add(new JLabel("List"));
        ListPanel.add(Box.createHorizontalStrut(5));
        ListPanel.add(new JList<String>(new Vector<String>(Arrays.asList(new String[]{"abc", "toto", "foo"}))));
        panneau.add(ListPanel);
        panneau.add(Box.createVerticalStrut(5));


        JPanel CheckBoxPanel = new JPanel();
        CheckBoxPanel.setLayout(new BoxLayout(CheckBoxPanel, BoxLayout.X_AXIS));
        CheckBoxPanel.setBorder(new TitledBorder("Check butons"));
        CheckBoxPanel.add(Box.createHorizontalStrut(5));
        CheckBoxPanel.add(new JCheckBox("Toto"));
        CheckBoxPanel.add(new JCheckBox("Titi"));
        CheckBoxPanel.add(new JCheckBox("Tata"));
        panneau.add(CheckBoxPanel);
        panneau.add(Box.createVerticalStrut(5));

        JPanel RadioButtonPanel = new JPanel();
        RadioButtonPanel.setLayout(new BoxLayout(RadioButtonPanel, BoxLayout.X_AXIS));
        RadioButtonPanel.setBorder(new TitledBorder("Radio butons"));
        RadioButtonPanel.add(Box.createHorizontalStrut(5));
        RadioButtonPanel.add(new JCheckBox("Toto"));
        RadioButtonPanel.add(new JCheckBox("Titi"));
        RadioButtonPanel.add(new JCheckBox("Tata"));
        panneau.add(RadioButtonPanel);
        panneau.add(Box.createVerticalStrut(5));


        JPanel ButtonPanel = new JPanel();
        ButtonPanel.setLayout(new BoxLayout(ButtonPanel, BoxLayout.X_AXIS));
        ButtonPanel.add(Box.createHorizontalStrut(5));
        ButtonPanel.add(new JButton("Toto"));
        ButtonPanel.add(new JButton("Titi"));
        ButtonPanel.add(new JButton("Tata"));
        panneau.add(ButtonPanel);
        panneau.add(Box.createVerticalStrut(5));




        pack();
        setVisible(true);
    }

    private void addComboxComponent(JPanel panneau) {
        //Combobox Management
        JPanel ComboPanel = new JPanel();
        ComboPanel.setLayout(new BoxLayout(ComboPanel, BoxLayout.X_AXIS));
        ComboPanel.add(new JLabel("Combobox"));
        ComboPanel.add(Box.createHorizontalStrut(5));
        ComboPanel.add(new JComboBox<String>(new Vector<String>(Arrays.asList(new String[]{"abc", "toto", "foo"}))));
        panneau.add(ComboPanel);
        panneau.add(Box.createVerticalStrut(5));
    }

    private void addTextFieldComponent(JPanel panneau) {
        //Textfields management
        JPanel TextfieldPanel = new JPanel();
        TextfieldPanel.setLayout(new BoxLayout(TextfieldPanel, BoxLayout.X_AXIS));
        TextfieldPanel.add(new JLabel("TextField"));
        TextfieldPanel.add(Box.createHorizontalStrut(5));
        TextfieldPanel.add(new JTextField(""));
        panneau.add(TextfieldPanel);
        panneau.add(Box.createVerticalStrut(5));
    }


}



