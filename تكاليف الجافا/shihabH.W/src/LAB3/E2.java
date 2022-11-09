package LAB3;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("the number :");
        int number= in.nextInt();
        System.out.println(" the letter :");
        String letter= in.next();
        if(letter.equals("A") || letter.equals("B") || letter.equals("C") || letter.equals("G"))
        {if (number%2==0) System.out.println("Color is Black");
            else System.out.println("Color is Bhite");}
        else
        {if (number % 2 != 0) System.out.println("Color is Black");
            else System.out.println("Color is White");
        }
    }
}
