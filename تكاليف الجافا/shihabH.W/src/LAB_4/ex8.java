package LAB_4;
import javax.swing.*;

public class ex8 {
    public static void main(String[] args) {
        JFrame JR =new JFrame("My_Name" );

        JR.setSize(500,500);

        MyDraw AS=new MyDraw();
        /**********************************************************************/
        JR.add(AS);
        JR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JR.setVisible(true);
        /**********************************************************************/


    }
}
