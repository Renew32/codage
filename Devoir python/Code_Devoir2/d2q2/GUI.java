
/**********************Q2-Devoir2 ITI1521....*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GUI extends JFrame implements ActionListener {
  Calculator cal;
  JTextField input;

  GUI(Calculator p) {
    String title = "Calculatrice";
    setTitle(title);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    input = new JTextField(25);
    input.setEditable(false);
    add(input, BorderLayout.NORTH);

    JPanel buttonsPanel = new JPanel();
    buttonsPanel.setLayout(new GridLayout(4, 5));

    buttonsPanel.add(new JButton("0"));
    buttonsPanel.add(new JButton("1"));
    buttonsPanel.add(new JButton("2"));
    buttonsPanel.add(new JButton("3"));
    buttonsPanel.add(new JButton("C"));
    buttonsPanel.add(new JButton("4"));
    buttonsPanel.add(new JButton("5"));
    buttonsPanel.add(new JButton("6"));
    buttonsPanel.add(new JButton("7"));
    buttonsPanel.add(new JButton("!"));
    buttonsPanel.add(new JButton("8"));
    buttonsPanel.add(new JButton("9"));
    buttonsPanel.add(new JButton("+"));
    buttonsPanel.add(new JButton("-"));
    buttonsPanel.add(new JButton("*"));
    buttonsPanel.add(new JButton("^"));
    buttonsPanel.add(new JButton("sqrt"));
    buttonsPanel.add(new JButton("ln"));
    buttonsPanel.add(new JButton("="));
    buttonsPanel.add(new JButton("/"));

    add(buttonsPanel, BorderLayout.CENTER);

  }
  // VOTRE CODE VIENT ICI

  public void actionPerformed(ActionEvent e) {
    // VOTRE CODE VIENT ICI

    String str = e.getActionCommand();
    if (str == "+") {
      cal.add();
    }
    if (str == "^") {
      cal.pow();
    }
    if (str == "-") {
      cal.subtract();
    }
    if (str == "*") {
      cal.multiply();
    }
    if (str == "!") {
      cal.factorial();
    }
    if (str == "sqrt") {
      cal.rootSquare();
    }
    if (str == "ln") {
      cal.nepLog();
    }
    if (str == "/") {
      cal.divide();
    }

    if (str == "1") {
      input.setText(input.getText() + str);
    }
    if (str == "0") {
      input.setText(input.getText() + str);
    }
    if (str == "2") {
      input.setText(input.getText() + str);
    }
    if (str == "3") {
      input.setText(input.getText() + str);
    }
    if (str == "4") {
      input.setText(input.getText() + str);
    }
    if (str == "5") {
      input.setText(input.getText() + str);
    }
    if (str == "6") {
      input.setText(input.getText() + str);
    }
    if (str == "7") {
      input.setText(input.getText() + str);
    }
    if (str == "8") {
      input.setText(input.getText() + str);
    }
    if (str == "9") {
      input.setText(input.getText() + str);
    }

    input.setText(input.getText() + str);
  }

  public static void main(String arg[]) {
    GUI gui;
    gui = new GUI(new Calculator());
    gui.setVisible(true);
  }
}