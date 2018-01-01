import javax.swing.*;
import java.awt.*;

public class About extends JFrame{
    private JPanel GeneralPanel;
    private JPanel headerPanel;
    private JLabel appName;
    private JToolBar toolbar;
    private JLabel homeLabel;
    private JLabel aboutLabel;
    private JLabel helpLabel;
    private JLabel algorithmName;
    private JLabel inputLabel;
    private JTextField inputTextField;
    private JPanel bodyPanel;
    private JLabel inputKeyLabel;
    private JTextField inputKeyTextField;
    private JButton keyInfoBtn;
    private JButton encryptBtn;
    private JLabel cipherLabel;
    private JTextField textField1;
    private JPanel bottomPanel;
    private JButton refreshBtn;
    private JButton doneBtn;

    public About(){
        Container container=getContentPane();

        container.add(GeneralPanel);
        setSize(500,400);
    }

    public static void main(String[] args) {
        About about=new About();
        about.show();
    }


}
