public class Labsheet7Q1 extends Thread {
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
        Labsheet7Q1 t = new Labsheet7Q1();
        t.start();
    }
}
