package LAB3;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {

        Scanner INPUT = new Scanner(System.in);
        String MON;
        System.out.println("Enter The Month :");
        MON=INPUT.next();
        if (MON.equals("january")) System.out.println("The Number Of Dates is :" + 31);


        else if (MON.equals("february")) System.out.println("the number of dates is :" + 30);


        else if  (MON.equals("march")) System.out.println("the number of dates is :" + 31);

        else if (MON.equals("aril")) System.out.println("the number of dates is :" + 30);

        else if (MON.equals("may")) System.out.println("the number of dates is :" + 31);


        else if (MON.equals("june")) System.out.println("the number of dates is :" + 30);


       else if (MON.equals("july")) System.out.println("the number of dates is :" + 31);


        else if (MON.equals("august")) System.out.println("the number of dates is :" + 30);


        else if (MON.equals("september")) System.out.println("the number of dates is :" + 31);


        else if (MON.equals("october")) System.out.println("the number of dates is :" + 30);


         else if (MON.equals("november")) System.out.println("the number of dates is :" + 31);


        else if (MON.equals("december")) System.out.println("the number of dates is :" + 30);


    }
}
