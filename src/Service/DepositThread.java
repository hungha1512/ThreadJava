package Service;

import Entity.Account;

public class DepositThread extends AccountService implements Runnable {
    private AccountService accountService;

    public DepositThread(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public void run() {
        accountService.deposit();
    }
}
