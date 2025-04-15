import javax.swing.*;

public class LoginPage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First UI");
        JLabel label = new JLabel("Hello, Java UI!", SwingConstants.CENTER);
        frame.add(label);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
