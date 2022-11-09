package LAB_4;
import java.awt.*;

public class ex4 {
    public static void main(String[] args) {
        Rectangle CONTIN=new Rectangle(6,11,21,31);

        CONTIN.add(0,0);

        /************************************************************************/
        System.out.println("Actual location: "+CONTIN);
        System.out.println("Expected location: "+new Rectangle(0,0,20,30));




    }
}
