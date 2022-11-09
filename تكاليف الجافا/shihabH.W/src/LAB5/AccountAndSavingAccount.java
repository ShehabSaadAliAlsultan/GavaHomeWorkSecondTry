package LAB5;

public class AccountAndSavingAccount {


    public static void main(String[] args) {Account savingsAccount= new SavingsAccount(1000,2.1);
        System.out.println("Balance : $ " + savingsAccount.getBalance() + "\n Interest :  $ " + savingsAccount .getInterest_rate()

        +"\n # Deposit : " + savingsAccount.getNumber_deposit() + "\n Withdrawals:" + savingsAccount.getNumber_withdrawals()  );


    }
}
