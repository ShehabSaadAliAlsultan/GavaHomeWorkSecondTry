package LAB3;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int X,R,E;

        System.out.println("enter as :");
        X=in.nextInt();
        System.out.println("enter R :");
        R=in.nextInt();
        System.out.println("enter v :");
        E =in.nextInt();
        if (X > R && X > E && R>E )System.out.println(X + "      " + R + "      " + R);
        else if (R >X && R>E && X>E) System.out.println(R + "       " + X + "     " + E);
        else if (E > X && E >R && X>R) System.out.println(E + "       " + X + "       " + R);

    }


}
