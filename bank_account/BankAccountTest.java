public class BankAccountTest {
    public static void main (String[] args) {
        BankAccount acct1 = new BankAccount();
        acct1.deposit("check",100);
        acct1.deposit("saving",200);
                    // acct1.withdraw("savding",100);

        try{
            acct1.withdraw("saving",300);
        }
        catch(Exception e) {
            System.out.println(e);
            if(e.getMessage().contains("Insufficient")) acct1.displayBalances();
        }
    }
}