package Service;

import Entity.Account;

public class WithdrawThread implements Runnable {
    private AccountService accountService;

    public WithdrawThread(AccountService accountService) {
        this.accountService = accountService;
    }
    @Override
    public void run() {
        accountService.withdrawal();
    }
}
