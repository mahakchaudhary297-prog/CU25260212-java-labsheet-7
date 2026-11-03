class BankAccount10 {
    private int balance = 2000;

    public void withdraw(int amount) {
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

class AccountTask10 implements Runnable {
    private BankAccount10 account;

    public AccountTask10(BankAccount10 account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            account.withdraw(1);
        }
    }
}

public class Labsheet7Q10 {
    public static void main(String[] args) throws InterruptedException {
        BankAccount10 account = new BankAccount10();
        Thread t1 = new Thread(new AccountTask10(account));
        Thread t2 = new Thread(new AccountTask10(account));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final balance: " + account.getBalance());
    }
}
