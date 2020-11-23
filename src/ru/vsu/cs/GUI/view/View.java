package ru.vsu.cs.GUI.view;

import ru.vsu.cs.GUI.controller.ControllerButtonResult;

import javax.swing.*;

public class View extends JFrame {

    private JPanel mainPanel;
    private JButton buttonPrintResultArray;
    private JTextField textReadField;
    private JTextField textResultField;

    public View() {
        super("Tack 7");

        setContentPane(mainPanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        buttonPrintResultArray.addActionListener(new ControllerButtonResult(textReadField, textResultField));
    }
}
