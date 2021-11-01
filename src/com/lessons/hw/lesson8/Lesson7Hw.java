package com.lessons.hw.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lesson7Hw extends JFrame {

        private static int counter;
        private static int step;
        private static JLabel counterValueView;

        public static void main(String[] args) {
            JFrame mainFrame = initFrame();
            counter = 0;
            step = 1;

            Font font = new Font("Arial", Font.BOLD, 32);

            createCounterView(mainFrame, font);
            createButtons(mainFrame, font);

            mainFrame.setVisible(true);
        }

        private static void createButtons(JFrame mainFrame, Font font) {
            createTextField(mainFrame);

            JButton decrementButton = new JButton("<");
            decrementButton.setFont(font);
            mainFrame.add(decrementButton, BorderLayout.LINE_START);

            JButton incrementButton = new JButton(">");
            incrementButton.setFont(font);
            mainFrame.add(incrementButton, BorderLayout.LINE_END);

            JButton resetButton = new JButton("Reset");
            resetButton.setFont(font);
            mainFrame.add(resetButton, BorderLayout.PAGE_END);

            decrementButton.addActionListener(e -> counterValueView.setText(String.valueOf(counter -= step)));
            incrementButton.addActionListener(e -> counterValueView.setText(String.valueOf(counter += step)));

            resetButton.addActionListener(e -> counterValueView.setText(String.valueOf(counter = 0)));

        }

        private static int readValue(JTextField textField) {
            return Integer.parseInt(textField.getText());
        }

        private static void createTextField(JFrame mainFrame) {
            JTextField stepValue = new JTextField();
            mainFrame.add(stepValue, BorderLayout.PAGE_START);
            stepValue.addActionListener(actionEvent -> {
                if (!stepValue.getText().equals("")) {
                    step = readValue(stepValue);
                    System.out.println(readValue(stepValue));
                }
            });
        }

        private static JFrame initFrame() {
            JFrame mainFrame = new JFrame();
            mainFrame.setTitle("Counter");
            mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            mainFrame.setBounds(300, 300, 400, 200);
            return mainFrame;
        }

        private static void createCounterView(JFrame mainFrame, Font font) {
            counterValueView = new JLabel(getCounterValueAsText());
            counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
            counterValueView.setFont(font);
            mainFrame.add(counterValueView, BorderLayout.CENTER);
        }

        private static String getCounterValueAsText() {
            return String.valueOf(counter);
        }
    }