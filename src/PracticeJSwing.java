import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracticeJSwing extends JFrame {
    private JPanel panelMain;
    private JTextField txtName;
    private JButton btnClick;
    private JLabel txtTitle;
    private JLabel txtTitle2;

    public PracticeJSwing() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnClick, txtName.getText() + "\nYour message was repeated! Waow!!");
            }
        });
    }

    public static void main(String[] args) {
        PracticeJSwing pjs = new PracticeJSwing();
        pjs.setContentPane(pjs.panelMain);
        pjs.setTitle("I totally know what i'm doing");
        pjs.setSize(500, 100);
        pjs.setLocationRelativeTo(null);
        pjs.setVisible(true);
        pjs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pjs.getContentPane().setBackground(new Color(136, 127, 163));
        pjs.btnClick.setBackground(new Color(104, 95, 133));
        pjs.btnClick.setForeground(Color.white);
        pjs.txtTitle.setForeground(Color.white);
        pjs.txtTitle2.setForeground(Color.white);
    }
}
