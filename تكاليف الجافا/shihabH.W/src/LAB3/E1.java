package LAB3;

public class E1 {
    public static void main(String[] args) {
        int RE = 1 ,CV= -1;
        if (RE < -CV ){System.out.print(RE);}
        else {System.out.print(CV);}
        RE = 1;
        CV = -1;
        if (-RE >= CV) { System.out.print(RE); }
        else { System.out.print(CV); }
        double Z = 0  , X = 1;
        if (Math.abs(Z - X) < 1)
        { System.out.print(Z); }
        else { System.out.print(X); }
        Z = Math.sqrt(2);
        X = 2;
        if (Z * Z == X)
        { System.out.print(Z); }
        else { System.out.print(X); }

    }
}
