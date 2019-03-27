package ws9;

public class Account {

    private double balance;
    private boolean balanceSet = false; //default

    public  Account(double balance) {
        this.balance = balance;
    }

    public boolean isBalanceSet() {
        return balanceSet;
    }

    public void setBalanceSet(boolean balanceSet) {
        this.balanceSet = balanceSet;
    }

    public synchronized double getBalance()
    {
        while (!isBalanceSet())
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setBalanceSet(false);
        notify();
        return balance;
    }

    public synchronized void setBalance(double balance)
    {
//        while (isBalanceSet())
//        {
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        this.balance = balance;
        this.setBalanceSet(true);
        notify();
    }
}