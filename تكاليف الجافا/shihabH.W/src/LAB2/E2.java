package LAB2;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double Pi=3.14, HALF;

        System.out.println("enter the half of the qutr :");
        HALF= in.nextDouble();

        System.out.println("the Area is :" + (Pi * HALF* HALF));

        System.out.println("the Parameter is :" + (Pi  * ( 2 * HALF)));
    }
}
