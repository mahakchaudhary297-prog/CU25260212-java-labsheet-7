class BankAccount12 {
    private int balance = 2000;
    private final Object lock = new Object();

    public void withdraw(int amount) {
        synchronized (lock) {
            if (balance >= amount) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                }
                balance -= amount;
            }
        }
    }

    public int getBalance() {
        return balance;
    }
}

class AccountTask12 implements Runnable {
    private BankAccount12 account;

    public AccountTask12(BankAccount12 account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            account.withdraw(1);
        }
    }
}

public class Labsheet7Q12 {
    public static void main(String[] args) throws InterruptedException {
        BankAccount12 account = new BankAccount12();
        Thread t1 = new Thread(new AccountTask12(account));
        Thread t2 = new Thread(new AccountTask12(account));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final balance: " + account.getBalance());
    }
}
