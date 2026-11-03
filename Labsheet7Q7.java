public class Labsheet7Q7 extends Thread {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 10000; i++) {
            sum += i;
        }
        System.out.println("Calculation completed. Sum: " + sum);
    }

    public static void main(String[] args) {
        Labsheet7Q7 t = new Labsheet7Q7();
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
        }
        System.out.println("Task finished in main thread.");
    }
}
