package Employee.Account;

import java.time.chrono.AbstractChronology;

public class CheckingAccount implements Account{
    private double balance;
    private double monthlyFee;
    private String accID;
    CheckingAccount(String accID,double fee,double startBalance){
        this.balance=startBalance;
        this.monthlyFee=fee;
        this.accID=accID;
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
        return balance-monthlyFee;
    }
}
