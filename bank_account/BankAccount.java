import java.util.ArrayList;

public class BankAccount {
    private double checkBalance;
    private double savingBalance;
    private Long acctID;

    private static int totalAccts;
    private static double totalBalance;
    private static ArrayList<Long> allAccts=new ArrayList<Long>();

    private static long randomNumGenerator() {
        long randomNum = (long)(0000000000L+Math.random()*(10000000000L));

        for(int i=0; i<allAccts.size(); i++) {
            if(randomNum==allAccts.get(i)) {
                randomNum = (long)(0000000000L+Math.random()*(10000000000L));
                i=-1;
            }
        }
        return randomNum;
    }

    public BankAccount() {
        totalAccts++;
        this.acctID = randomNumGenerator();
        allAccts.add(this.acctID);
    }

    public double getCheckBalance() {
        return this.checkBalance;
    }

    public double getSavingBalance() {
        return this.savingBalance;
    }

    public void deposit(String acct, double amt) {
        if(amt <= 0) {
            System.out.print("Enter amount greater than 0");
        }
        if((acct.toLowerCase()).contains("check")) {
            this.checkBalance += amt;
            totalBalance += this.checkBalance;
        }
        else if((acct.toLowerCase()).contains("saving")) {
            this.savingBalance += amt;
            totalBalance += this.savingBalance;
        }
        else {
            System.out.println("Error: Enter checking or saving");
        }
    }

    public void withdraw(String acct, double amt) throws Exception {
        if(amt <= 0) {
            throw new Exception("Enter amount greater than 0");
        }
        else if(!(acct.toLowerCase()).contains("check") && !(acct.toLowerCase()).contains("saving")) {
            throw new Exception("Enter checking or saving");
        }

        if((acct.toLowerCase()).contains("check") && (this.checkBalance >= amt)) {
            this.checkBalance -= amt;
            totalBalance -= this.checkBalance;
        }
        else if((acct.toLowerCase()).contains("saving") && (this.savingBalance >= amt)) {
            this.savingBalance -= amt;
            totalBalance -= this.savingBalance;
        }
        else {
            throw new Exception("Insufficient fund\n\nCURRENT BALANCE");
        }
    }

    public void displayBalances() {
        System.out.println("ID: " + this.acctID);
        System.out.printf("Checking Account: $%.2f\n",this.getCheckBalance());
        System.out.printf("Saving Account: $%.2f\n", this.getSavingBalance());
        System.out.printf("Total Balance: $%.2f\n", totalBalance);
    }
}