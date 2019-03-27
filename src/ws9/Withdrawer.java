package ws9;

public class Withdrawer implements Runnable{
    Account account;

    Withdrawer(Account account)
    {
        this.account = account;
    }

    @Override
    public void run() {
        while (true)
        {
            System.out.print("Balance Consumed is: ");
            System.out.println(account.getBalance());
        }
    }
}
