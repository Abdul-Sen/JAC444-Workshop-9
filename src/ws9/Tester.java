package ws9;

public class Tester {
    public static void main(String[] args)
    {
        System.out.println("Testing");
        Account myAccount = new Account(0);

       Depositor d  = new Depositor(myAccount);
       Withdrawer w = new Withdrawer(myAccount);

        Thread t1 = new Thread(d);
        t1.start();
        Thread t2 = new Thread(w);
        t2.start();
    }
}