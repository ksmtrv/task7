package ru.vsu.cs.gui;

import javax.swing.*;

public class Frame extends JFrame {

    private JPanel mainPanel;
    private JButton buttonPrintResultArray;
    private JTextField textReadField;
    private JTextField textResultField;

    public Frame() {
        super("Task 7");

        setContentPane(mainPanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        buttonPrintResultArray.addActionListener(new ListenerButtonResult(textReadField, textResultField));
    }
}