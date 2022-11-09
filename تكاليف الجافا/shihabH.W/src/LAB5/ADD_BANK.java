package LAB5;

public class ADD_BANK {

    private double BALANCE;{BALANCE=0 ;}
    public void addlnteresr(double Rate)
    {
        BALANCE += (BALANCE/Rate);
    }
    public void deposit(double amount) {BALANCE=BALANCE+=amount;}

    public void  withraw(double amount) {BALANCE=BALANCE-=amount; }
    public double getBalance() { return BALANCE;}
    public ADD_BANK(double intiBalance) { BALANCE=intiBalance;}




}
