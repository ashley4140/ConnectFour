import javax.swing.*;
import java.awt.*;

public class StartScreen {

    public static void main(String args[]) {

        JFrame frame = new JFrame("Connect Four");
        JPanel panel = new JPanel();
        panel.setBackground(Color.green);
        panel.setLayout(new FlowLayout());

        JLabel front = new JLabel();
        front.setIcon(new ImageIcon("Front Screen2.jpg"));
        panel.add(front);

        frame.add(panel);
        frame.setSize(760, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
