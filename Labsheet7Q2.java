public class Labsheet7Q2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Name");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        Labsheet7Q2 runnable = new Labsheet7Q2();
        Thread t = new Thread(runnable);
        t.start();
    }
}
