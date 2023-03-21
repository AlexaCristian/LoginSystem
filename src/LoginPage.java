import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton ressetButton = new JButton("Reset");
    JTextField userIdField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIdLabel = new JLabel("userID:");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel messsageLabel = new JLabel();

    HashMap<String, String> logininfo = new HashMap<String, String>();

    LoginPage(HashMap<String, String> loginInfoOriginal) {
        logininfo = loginInfoOriginal;

        userIdLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);

        frame.add(userIdLabel);
        frame.add(userPasswordLabel);
        frame.add(messsageLabel);
        frame.add(userIdField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(ressetButton);

        messsageLabel.setBounds(125, 250, 250, 35);
        messsageLabel.setFont(new Font(null, Font.ITALIC, 25));

        userIdField.setBounds(125, 100, 200, 25);
        userPasswordField.setBounds(125, 150, 200, 25);

        loginButton.setBounds(125, 200, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        ressetButton.setBounds(225, 200, 100, 25);
        ressetButton.setFocusable(false);
        ressetButton.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == ressetButton) {
            userIdField.setText("");
            userPasswordField.setText("");
        }

        if (e.getSource() == loginButton) {
            String userID = userIdField.getText();
            String password = String.valueOf(userPasswordField.getPassword()); //reda parola convertita intr-un string si o aloca intr-un string numit "password"

            if (logininfo.containsKey(userID)) { //verificam userID ul
                if (logininfo.get(userID).equals(password)) {
                    messsageLabel.setForeground(Color.green);
                    messsageLabel.setText("Te-ai logat cu succes");
                    frame.dispose();

                    WelcomePage welcomePage = new WelcomePage(userID);
                }
                else {
                    messsageLabel.setForeground(Color.red);
                    messsageLabel.setText("Parola gresita");
                }
            }
            else {
                messsageLabel.setForeground(Color.red);
                messsageLabel.setText("Utilizator gresit");
            }
        }

    }
}
