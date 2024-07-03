package Service;

import Entity.Account;

public class AccountService {
    private Account account;
    private double amount;

    public AccountService() {
        ;
    }

    public AccountService(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public Account withdrawal() {
        if (account.getBalance() > this.amount) {
            account.setBalance(account.getBalance() - this.amount);
        }
        else {
            System.out.println("Insufficient Balance");
        }
        return account;
    }

    public Account deposit() {
        account.setBalance(account.getBalance() + this.amount);
        return account;
    }

    public String toString(String separator) {
        StringBuilder builder = new StringBuilder(separator);
        return builder
                .append(account.getId())
                .append(separator)
                .append(account.getBalance())
                .toString();
    }
}
