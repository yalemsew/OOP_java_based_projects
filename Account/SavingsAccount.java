package Employee.Account;

public class SavingsAccount implements Account {
    private double balance;

    private double interestRate;
    private String accID;
    SavingsAccount( String accID,double interestRate,double balance){
        this.balance=balance;
        this.interestRate=interestRate;
        this.accID = accID;
    }

    @Override
    public String getAccountID() {
        return accID;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double computeUpdatedBalance() {
        return balance+(interestRate*balance);
    }
}
