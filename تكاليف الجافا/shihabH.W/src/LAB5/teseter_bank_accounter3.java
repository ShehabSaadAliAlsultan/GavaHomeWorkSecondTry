package LAB5;

public class teseter_bank_accounter3 {
    public static void main(String[] args) {

        Accounter_3 ADD = new Accounter_3(0);
        ADD.deposit( 1000);
        /************************************************************************************/
        System.out.println(ADD.getBalance());
        /************************************************************************************/
        ADD.withraw(500);ADD.withraw(400);
        System.out.print(ADD.getBalance() );
        System.out.print("$");
    /************************************************************************************/
    }



}
