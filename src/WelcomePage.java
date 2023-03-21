import javax.swing.*;
import java.awt.*;

public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel();

    WelcomePage(String userID) {

        welcomeLabel.setBounds(100,100,250,35);
        welcomeLabel.setFont(new Font( null, Font.PLAIN,25));
        welcomeLabel.setText("Buna ziua, " + userID + "!");

        frame.add(welcomeLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
