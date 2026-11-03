class CustomThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " count: " + i);
        }
    }
}

public class Labsheet7Q4 {
    public static void main(String[] args) {
        CustomThread t1 = new CustomThread();
        CustomThread t2 = new CustomThread();
        t1.start();
        t2.start();
    }
}
