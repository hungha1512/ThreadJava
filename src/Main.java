import Entity.Account;
import Service.AccountService;
import Service.DepositThread;
import Service.WithdrawThread;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("1", 100);
        double amount = 15;
        AccountService accountService = new AccountService(account, amount);
        WithdrawThread wd = new WithdrawThread(accountService);
        amount = 5;
        accountService = new AccountService(account, amount);
        DepositThread dp = new DepositThread(accountService);
        Thread t1 = new Thread(wd);
        Thread t2 = new Thread(dp);
        try {
            t1.start();
//      Thong bao cho t2 thuc hien vi t1 da xong roi
            t1.join();
            t2.start();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(account.toString());
    }
}