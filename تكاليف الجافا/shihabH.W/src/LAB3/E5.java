package LAB3;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {

        Scanner GO=new Scanner(System.in);
        System.out.println("enter the number 1 :");
        int F= GO.nextInt();
        System.out.println("enter the number 2  :");
                int S = GO.nextInt();
        System.out.println("enter the number 3  :") ;
       int T = GO.nextInt();
        if (F==T && S==T) System.out.println("all the same");
        else System.out.println("all different");


    }
}
