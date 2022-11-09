package LAB3;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter any Number :");
        long NUMBER = in.nextLong();
        if (NUMBER<0) {NUMBER=NUMBER * -1;}
        int RR;if (NUMBER>999999999) {RR =10;}
        else if (NUMBER>99999999) {RR = 9;}
        else if (NUMBER > 9999999) {RR = 8;}
        else if (NUMBER>999999) {RR=7;}
        else if (NUMBER>99999) {RR=6;}
        else if (NUMBER>9999) {RR=5;}
        else if (NUMBER>999) {RR=4;}
        else if (NUMBER>99) {RR=3;}
        else if (NUMBER>9) {RR=2;}
        else {RR=1;}
        System.out.println(   "The number " + NUMBER+ "  has " +   RR   + "   Bit   "      );






    }
}
