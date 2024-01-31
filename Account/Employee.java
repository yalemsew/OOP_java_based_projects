package Employee.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
    private String name;
    List<Account> accountList=new ArrayList<>();
    Employee(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void addAccount(Account account){
        accountList.add(account);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(accountList, employee.accountList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, accountList);
    }
}
