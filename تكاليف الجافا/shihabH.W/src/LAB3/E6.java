package LAB3;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int SD,X,ZR;
        System.out.println("enter SD :");SD=in.nextInt();
        System.out.println("enter X :");X=in.nextInt();
        System.out.println("enter zR :");ZR =in.nextInt();
        if (SD == X || SD==ZR) System.out.println("all the same");
        else if (SD != X || SD!= ZR) {System.out.println("al not the same");
        }
    }
}
