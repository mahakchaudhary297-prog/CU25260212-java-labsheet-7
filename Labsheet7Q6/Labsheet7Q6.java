public class Labsheet7Q6 extends Thread {
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) {
        Labsheet7Q6 t = new Labsheet7Q6();
        System.out.println("Before start: " + t.isAlive());
        t.start();
        System.out.println("While running: " + t.isAlive());
        try {
            t.join();
        } catch (InterruptedException e) {
        }
        System.out.println("After finish: " + t.isAlive());
    }
}
