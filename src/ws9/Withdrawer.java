package ws9;

public class Withdrawer implements Runnable{
    Account account;

    Withdrawer(Account account)
    {
        this.account = account;
        System.out.println(this.account.hashCode());
    }

    @Override
    public void run() {
            System.out.println(this.account.getBalance());
            this.account.setBalanceSet(false);
    }
}
