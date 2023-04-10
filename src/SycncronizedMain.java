public class SycncronizedMain {
    public static void main(String[] args) {
            Account accountObject = new Account();
            Thread t1 = new Thread(new DEPOSIT(accountObject,100));
            Thread t2 = new Thread(new WITHDRAW(accountObject,50));
            Thread t3 = new Thread(new ENQUIRE(accountObject));
        t3.start();
        t1.start();
            t2.start();
            // DO some other operation
        } // end main()
    }

class Account {   // the 'monitor'
    int balance=0;
    // if 'synchronized' is removed, the outcome is unpredictable
    public synchronized void deposit(int deposit_amount ) {
        // METHOD BODY :
        balance += deposit_amount;
        System.out.println("DEPOSIT: " + deposit_amount +" THREAD NUM: "+Thread.currentThread().getId()+  " OF BALANCE: "+ balance);
    }

    public synchronized void withdraw(int withdraw_amount ) {
        // METHOD BODY:
        if(balance<=0 || (balance>0 && balance<withdraw_amount) ){
            System.out.println("CANT WITHDRAW");
        }else {
            balance -= withdraw_amount;
            System.out.println("WITHDRAW: " + withdraw_amount  +" THREAD NUM: "+Thread.currentThread().getId() + " OF BALANCE: " + balance);
        }

    }
    public synchronized void enquire( ) {
        // METHOD BODY:
        System.out.println("BALANCE: "+ balance  +" THREAD NUM: "+Thread.currentThread().getId());

    }
}

class DEPOSIT implements Runnable {
    Account account;
    int amount;

    public DEPOSIT(Account s, int amou) {
        account = s;
        amount = amou;
    }

    public void run() {
        account.deposit(amount);
    }
} // end class MyThread

class WITHDRAW implements Runnable  {
    Account account;
    int amount;
    public WITHDRAW (Account s,int amou) {
        account = s;
        amount = amou;

    }
    public void run() { account.withdraw(amount); }
} // end class YourThread

class ENQUIRE implements Runnable  {
    Account account;
    int amount;
    public ENQUIRE (Account s)
    {
        account = s;
    }
    public void run() {account.enquire(); }
} // end class HerThread

