import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    private JButton nextBtn;
    private JPanel GeneralJPanel;
    private JPanel headerPanel;
    private JLabel appName;
    private JPanel bodyPanel;
    private JLabel chooseAlgoLabel;
    private JComboBox algorithmsCombo;
    private JPanel nextBtnPanel;
    private JLabel home;
    private JLabel about;
    private JLabel help;
    private JToolBar toolBar;

    public GUI() {
        Container container=getContentPane();


        container.add(GeneralJPanel);
        setSize(500,500);

    }


    public static void main(String[] args) {
        GUI gui=new GUI();
        gui.show();

    }
}

