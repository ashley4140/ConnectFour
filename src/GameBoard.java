
import java.awt.*;
import javax.swing.*;

public abstract class GameBoard extends JLabel{

    public static void main(String args[]) {

        JFrame frame = new JFrame("Connect Four");
        JPanel panel = new JPanel();
        panel.setBackground(Color.green);
        panel.setLayout(new FlowLayout());



        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JButton button4 = new JButton();
        JButton button5 = new JButton();
        JButton button6 = new JButton();
        JButton button7 = new JButton();


        button1.setBackground(Color.white);
        button2.setBackground(Color.white);
        button3.setBackground(Color.white);
        button4.setBackground(Color.white);
        button5.setBackground(Color.white);
        button6.setBackground(Color.white);
        button7.setBackground(Color.white);

        button1.setText("Column 1");
        button2.setText("Column 2");
        button3.setText("Column 3");
        button4.setText("Column 4");
        button5.setText("Column 5");
        button6.setText("Column 6");
        button7.setText("Column 7");


        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);

        JLabel label1 = new JLabel();
        label1.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label1);

        JLabel label2 = new JLabel();
        label2.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label2);

        JLabel label3 = new JLabel();
        label3.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label3);

        JLabel label4 = new JLabel();
        label4.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label4);

        JLabel label5 = new JLabel();
        label5.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label5);

        JLabel label6 = new JLabel();
        label6.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label6);

        JLabel label7 = new JLabel();
        label7.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label7);

        JLabel label8 = new JLabel();
        label8.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label8);

        JLabel label9 = new JLabel();
        label9.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label9);

        JLabel label10 = new JLabel();
        label10.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label10);

        JLabel label11 = new JLabel();
        label11.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label11);

        JLabel label12 = new JLabel();
        label12.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label12);

        JLabel label13 = new JLabel();
        label13.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label13);

        JLabel label14 = new JLabel();
        label14.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label14);

        JLabel label15 = new JLabel();
        label15.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label15);

        JLabel label16 = new JLabel();
        label16.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label16);

        JLabel label17 = new JLabel();
        label17.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label17);

        JLabel label18 = new JLabel();
        label18.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label18);

        JLabel label19 = new JLabel();
        label19.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label19);

        JLabel label20 = new JLabel();
        label20.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label20);

        JLabel label21 = new JLabel();
        label21.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label21);

        JLabel label22 = new JLabel();
        label22.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label22);

        JLabel label23 = new JLabel();
        label23.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label23);

        JLabel label24 = new JLabel();
        label24.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label24);

        JLabel label25 = new JLabel();
        label25.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label25);

        JLabel label26 = new JLabel();
        label26.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label26);

        JLabel label27 = new JLabel();
        label27.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label27);

        JLabel label28 = new JLabel();
        label28.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label28);

        JLabel label29 = new JLabel();
        label29.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label29);

        JLabel label30 = new JLabel();
        label30.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label30);

        JLabel label31 = new JLabel();
        label31.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label31);

        JLabel label32 = new JLabel();
        label32.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label32);

        JLabel label33 = new JLabel();
        label33.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label33);

        JLabel label34 = new JLabel();
        label34.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label34);

        JLabel label35 = new JLabel();
        label35.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label35);

        JLabel label36 = new JLabel();
        label36.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label36);

        JLabel label37 = new JLabel();
        label37.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label37);

        JLabel label38 = new JLabel();
        label38.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label38);

        JLabel label39 = new JLabel();
        label39.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label39);

        JLabel label40 = new JLabel();
        label40.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label40);

        JLabel label41 = new JLabel();
        label41.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label41);

        JLabel label42 = new JLabel();
        label42.setIcon(new ImageIcon("boardpiece1.jpg"));
        panel.add(label42);

        frame.add(panel);
        frame.setSize(760, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }



}
