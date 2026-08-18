import javax.swing.*;

public class VillanuevaMay7RegistrationForm {
    private JPanel panel1;
    private JButton saveButton;
    private JButton updateButton;
    private JButton searchButton;
    private JButton deleteButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextArea registrationFormTextArea;
    private JTextArea studentNameTextArea;
    private JTextArea studentIDTextArea;
    private JTextArea phoneTextArea;

    public static void main(String[] args) {
        JFrame frame = new JFrame("VillanuevaMay7RegistrationForm");
        frame.setContentPane(new VillanuevaMay7RegistrationForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
