class BankAccount11 {
    private int balance = 2000;

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
            }
            balance -= amount;
        }
    }

    public int getBalance() {
        return balance;
    }
}

class AccountTask11 implements Runnable {
    private BankAccount11 account;

    public AccountTask11(BankAccount11 account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            account.withdraw(1);
        }
    }
}

public class Labsheet7Q11 {
    public static void main(String[] args) throws InterruptedException {
        BankAccount11 account = new BankAccount11();
        Thread t1 = new Thread(new AccountTask11(account));
        Thread t2 = new Thread(new AccountTask11(account));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final balance: " + account.getBalance());
    }
}
