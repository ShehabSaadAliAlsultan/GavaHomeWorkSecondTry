package LAB5;

public  abstract   class Account {
    private  double BALANCE;
    private double numberDeposit;
    private double numberWithdrawals;

    private double interest_rate;  protected  double srrvicce_charges;


    public double getBalance()
    {
        return BALANCE;
    }
    public void setBalance(double balance)
    {
        this.BALANCE = balance;
    }
    public double getNumber_deposit()
    {
        return numberDeposit;
    }

    public double getNumber_withdrawals() {

        return numberWithdrawals;

    }
    public double getInterest_rate(){
        return  interest_rate;
    }
    void withdraw(double amount){
        this.BALANCE -= amount;this.numberWithdrawals++;
    }
    public Account(double balance , double apr){
        this.BALANCE = balance;this.interest_rate=apr;
    }
    private  void depoist(double amount){
        this.BALANCE += amount;this.numberDeposit++;
    }
    public  void  calcInterest(){
        double monthlyInterest = (interest_rate /12 );
        monthlyInterest = BALANCE * monthlyInterest;this.BALANCE += monthlyInterest;
    }


    public  void monthlyprocess(){
        this.BALANCE -= srrvicce_charges;
        calcInterest();
        this.numberDeposit = 0;
        this .numberWithdrawals = 0;
        this.srrvicce_charges = 0;
    }



    protected void deposit(double amount) {
    }
}
