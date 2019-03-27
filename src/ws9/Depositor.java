package ws9;

import java.util.Scanner;

public class Depositor implements Runnable {

    Account account;

    public Depositor(Account account)
    {
        this.account = account;
    }
    @Override
    public void run() {

        while (!account.isBalanceSet())
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Set balance: ");
            System.out.print(" > ");
            account.setBalance(in.nextDouble());
        }

    }
}
