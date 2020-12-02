package ru.vsu.cs.gui;

import ru.vsu.cs.logic.AmountCloseNumbers;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerButtonResult implements ActionListener {

    JTextField textReadField;
    JTextField textResultField;

    public ListenerButtonResult(JTextField textReadField, JTextField textResultField) {
        this.textReadField = textReadField;
        this.textResultField = textResultField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String readFieldText = textReadField.getText();
        int[] readArr = ArrayUtil.toIntArray(readFieldText);
        int res = AmountCloseNumbers.getAmountCloseNumbers(readArr);
        textResultField.setText(Integer.toString(res));
    }
}