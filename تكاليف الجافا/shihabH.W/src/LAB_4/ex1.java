package LAB_4;
import java.awt.*;

public class ex1 {
    public static void main(String[] args) {
        Rectangle number=new Rectangle(20,30);

        double DF=2* (number.getWidth()+number.getHeight());

        System.out.println(" the actual answer is: "+DF);


        System.out.println("THE Expected answer is: "+2*(30+20));
    }
}
