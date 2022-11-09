package LAB5;


public class Accounter_3 {
    public Accounter_3(double intiBalance)
    { BALANCE=intiBalance;}
    private double BALANCE;{BALANCE=0 ;}
    public void deposit(double amount) {BALANCE=BALANCE+=amount;}
    public double getBalance() { return BALANCE;}
    public void  withraw(double amount) {BALANCE=BALANCE-=amount;}



}

