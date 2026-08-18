import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VillanuevaCalculator {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;

    private JPanel VillanuevaCalculator;
    private JTextField textDisplay;
    private JButton btnNegative;
    private JButton btnDivide;
    private JButton btn2;
    private JButton btn3;
    private JButton btn5;
    private JButton btn8;
    private JButton btnPoint;
    private JButton btnPlus;
    private JButton btn6;
    private JButton btn9;
    private JButton btnClear;
    private JButton btnMinus;
    private JButton btnTimes;
    private JButton btn1;
    private JButton btn4;
    private JButton btn7;
    private JButton btn0;
    private JButton btnEquals;

    private void getOperator(String btnText) {
        math_operator = btnText.charAt(0);
        total1 = Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
    }

    public VillanuevaCalculator() {
        btn1.addActionListener(e -> appendText(btn1.getText()));
        btn2.addActionListener(e -> appendText(btn2.getText()));
        btn3.addActionListener(e -> appendText(btn3.getText()));
        btn4.addActionListener(e -> appendText(btn4.getText()));
        btn5.addActionListener(e -> appendText(btn5.getText()));
        btn6.addActionListener(e -> appendText(btn6.getText()));
        btn7.addActionListener(e -> appendText(btn7.getText()));
        btn8.addActionListener(e -> appendText(btn8.getText()));
        btn9.addActionListener(e -> appendText(btn9.getText()));
        btn0.addActionListener(e -> appendText(btn0.getText()));

        btnPoint.addActionListener(e -> {
            if (textDisplay.getText().equals("")) {
                textDisplay.setText("0.");
            } else if (!textDisplay.getText().contains(".")) {
                String btnPointText = textDisplay.getText() + btnPoint.getText();
                textDisplay.setText(btnPointText);
            }
        });

        btnClear.addActionListener(e -> {
            total2 = 0;
            textDisplay.setText("");
        });

        btnPlus.addActionListener(e -> getOperator(btnPlus.getText()));
        btnMinus.addActionListener(e -> getOperator(btnMinus.getText()));
        btnTimes.addActionListener(e -> getOperator(btnTimes.getText()));
        btnDivide.addActionListener(e -> getOperator(btnDivide.getText()));

        btnNegative.addActionListener(e -> {
            String text = textDisplay.getText();
            if (!text.isEmpty() && text.charAt(0) == '-') {
                textDisplay.setText(text.substring(1));
            } else {
                textDisplay.setText("-" + text);
            }
        });

        btnEquals.addActionListener(e -> {
            switch (math_operator) {
                case '+':
                    total2 = total1 + Double.parseDouble(textDisplay.getText());
                    break;
                case '-':
                    total2 = total1 - Double.parseDouble(textDisplay.getText());
                    break;
                case '*':
                    total2 = total1 * Double.parseDouble(textDisplay.getText());
                    break;
                case '/':
                    total2 = total1 / Double.parseDouble(textDisplay.getText());
                    break;
            }
            textDisplay.setText(Double.toString(total2));
            total1 = 0;
        });
    }

    private void appendText(String buttonText) {
        String currentText = textDisplay.getText();
        textDisplay.setText(currentText + buttonText);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator by Maria Angel Noelle Villanueva");
        frame.setContentPane(new VillanuevaCalculator().VillanuevaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}