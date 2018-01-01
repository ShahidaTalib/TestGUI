import javax.swing.*;
import java.awt.*;

class shahida extends JFrame
{
    public shahida()
    {
        setSize(300, 300);
        Container cp = getContentPane();
        JPanel panel = new JPanel();
        panel.add(new JButton("Yellow"));
        panel.add(new JButton("Red"));
        panel.add(new JButton("Blue"));
        cp.add(panel, "South");
    }


    public static void main(String[] str) {
        shahida ob = new shahida();
        ob.show();
    }
}

