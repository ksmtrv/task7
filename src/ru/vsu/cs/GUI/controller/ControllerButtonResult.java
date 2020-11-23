package ru.vsu.cs.GUI.controller;

import ru.vsu.cs.GUI.logic.Logic;
import ru.vsu.cs.GUI.utils.ArrayUtil;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerButtonResult implements ActionListener {

    JTextField textReadField;
    JTextField textResultField;

    public ControllerButtonResult(JTextField textReadField, JTextField textResultField) {
        this.textReadField = textReadField;
        this.textResultField = textResultField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String readFieldText = textReadField.getText();
        int[] readArr = ArrayUtil.toIntArray(readFieldText);
        int res = Logic.getAmountCloseNumbers(readArr);
        textResultField.setText(Integer.toString(res));
    }
}