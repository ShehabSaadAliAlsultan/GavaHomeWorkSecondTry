package LAB3;

import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        int MON   ,  DAY;
        String month = null;
        Scanner INPUT= new Scanner(System.in);
        System.out.println("month :");MON = INPUT.nextInt();
        System.out.println("days :");DAY = INPUT.nextInt();
        if (MON==1 || MON==2 || MON==3) month ="winter";
        else if (MON==4 || MON==5 || MON==6) month ="spring";
        else if (MON==7 || MON==8 || MON==9) month ="summer";
        else if (MON==10 || MON==11 || MON==12) month ="fall";
        if (MON%3 == 0 && DAY>=21)
            if (month.equals("winter")) month="spring";
            else if (month.equals("spring")) month="summer";
            else if (month.equals("summer")) month="fall";
            else month="fall";

        System.out.println(month);



    }
}
