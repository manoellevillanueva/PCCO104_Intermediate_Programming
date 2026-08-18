import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class VillanuevaCrud {
    private JPanel Main;
    private JTextField txtName;
    private JTextField txtEmail;
    private JTextField txtstudentid;
    private JButton saveButton;
    private JTable table1;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton searchButton;
    private JTextField txtid;
    private JScrollPane table_1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Maria Angel Noelle Villanueva");
        frame.setContentPane(new VillanuevaCrud().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private Connection con;
    private PreparedStatement pst;

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/villanueva_mariaangelnoelle_db", "root", "");
            System.out.println("Success");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database Connection Failed");
            ex.printStackTrace();
        }
    }

    void table_load() {
        try {
            pst = con.prepareStatement("SELECT * FROM users");
            ResultSet rs = pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public VillanuevaCrud() {
        connect();
        table_load();

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtName.getText();
                String email = txtEmail.getText();
                String student_id = txtstudentid.getText();

                try {
                    pst = con.prepareStatement("INSERT INTO users(username, email, student_id) VALUES(?, ?, ?)");
                    pst.setString(1, username);
                    pst.setString(2, email);
                    pst.setString(3, student_id);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Added!");
                    table_load();
                    txtName.setText("");
                    txtEmail.setText("");
                    txtstudentid.setText("");
                    txtName.requestFocus();
                    pst.close();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String empid = txtid.getText();

                try {
                    pst = con.prepareStatement("SELECT username, email, student_id FROM users WHERE id = ?");
                    pst.setString(1, empid);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        txtName.setText(rs.getString(1));
                        txtEmail.setText(rs.getString(2));
                        txtstudentid.setText(rs.getString(3));
                    } else {
                        txtName.setText("");
                        txtEmail.setText("");
                        txtstudentid.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Student");
                    }
                    pst.close();
                    rs.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtName.getText();
                String email = txtEmail.getText();
                String student_id = txtstudentid.getText();
                String empid = txtid.getText();

                try {
                    pst = con.prepareStatement("UPDATE users SET username = ?, email = ?, student_id = ? WHERE id = ?");
                    pst.setString(1, username);
                    pst.setString(2, email);
                    pst.setString(3, student_id);
                    pst.setString(4, empid);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Updated!");
                    table_load();
                    txtName.setText("");
                    txtEmail.setText("");
                    txtstudentid.setText("");
                    txtName.requestFocus();
                    pst.close();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String empid = txtid.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM users WHERE id = ?");
                    pst.setString(1, empid);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted!");
                    table_load();
                    txtName.setText("");
                    txtEmail.setText("");
                    txtstudentid.setText("");
                    txtName.requestFocus();
                    pst.close();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }
}