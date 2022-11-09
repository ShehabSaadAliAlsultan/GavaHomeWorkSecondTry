package LAB_4;

import javax.swing.*;
import java.awt.*;

public class FrameViewer {
    public static void main(String[] args) {
        JFrame FRAME= new JFrame();
        FRAME.setSize(400, 400);
        /**********************************************************************/
        JLabel LABAL = new JLabel("Hello, shehab alsultan!");
        LABAL.setOpaque(true);
        LABAL.setBackground(Color.pink);
        /**********************************************************************/
        FRAME.add(LABAL);
        FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FRAME.setVisible(true);
        FRAME.setVisible(true);



    }
}
