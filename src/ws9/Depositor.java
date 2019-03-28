package ws9;

import java.util.Scanner;

public class Depositor implements Runnable {

    Account account;

    public Depositor(Account account)
    {
        this.account = account;
        System.out.println(this.account.hashCode());
    }

    @Override
    public void run() {
        Scanner in = new Scanner(System.in);
        System.out.println("Set balance: ");
        System.out.print(" > ");
        account.setBalance(in.nextDouble());
        this.account.setBalanceSet(true);
    }

}
