package Employee.Account;

import java.util.List;

public class Admin {
    public static double computeUpdatedBalanceSum(List<Employee> list) {
        //implement
        double updatedSum=0;
        for(Employee employee:list){
            for(Account account:employee.accountList){
                updatedSum+=account.computeUpdatedBalance();
            }
        }

        return updatedSum;
    }
}
