package LAB5;

public class TesetAddBank {
    public static void main(String[] args) {
        ADD_BANK moSaving = new ADD_BANK(1000);moSaving.deposit(5000);
        moSaving.withraw(1000);moSaving.addlnteresr(0.01);

        System.out.println( moSaving.getBalance());
        moSaving.withraw(5000);moSaving.withraw(1000);System.out.println(moSaving.getBalance() );
    }
}
