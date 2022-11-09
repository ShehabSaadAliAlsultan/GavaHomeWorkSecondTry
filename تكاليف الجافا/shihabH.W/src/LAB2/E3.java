package LAB2;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double LO  ,   WI;
        System.out.println("enter LO:");  LO= in.nextDouble();
        System.out.println("enter r"); WI= in.nextDouble();
        System.out.println("the area is :" + (  LO  * WI ));
        System.out.println("the parameter is :" + ( 2 *( LO + WI )));
    }
}
