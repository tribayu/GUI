import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton closeButton;
    private JLabel welcom;
    private JPanel mainPanel;

    public GUI() {
        setContentPane(mainPanel);
        setTitle("TM01-22090079-MuhammadTriBayuSutiono-2E");
        setSize(350,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        GUI myGUI = new GUI();
    }
}
