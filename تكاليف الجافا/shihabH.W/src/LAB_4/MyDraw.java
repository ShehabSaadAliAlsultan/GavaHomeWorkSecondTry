package LAB_4;
import javax.swing.*;
import java.awt.*;

public class MyDraw extends JComponent {
    public void paintComponent(Graphics g) {
        Rectangle GTS = new Rectangle(100, 100, 100, 100);
        Graphics2D BOG = (Graphics2D) g;
        BOG.setColor(Color.RED);
        BOG.fill(GTS);
        BOG.getClipBounds(GTS);
        BOG.setColor(Color.red);
        BOG.drawString("ALI",125,144);
        BOG.setColor(Color.red);
        BOG.drawString("AHMED",120,155);
        BOG.setColor(Color.red);
        BOG.drawString("SALH",130,166);



    }

}