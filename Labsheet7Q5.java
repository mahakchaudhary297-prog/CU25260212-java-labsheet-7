class WorkerThread extends Thread {
    public WorkerThread(String name) {
        super(name);
    }

    public void run() {
        try {
            int sleepTime = (int) (Math.random() * 501);
            Thread.sleep(sleepTime);
            System.out.println(getName() + " slept for " + sleepTime + " ms and executed.");
        } catch (InterruptedException e) {
        }
    }
}

public class Labsheet7Q5 {
    public static void main(String[] args) {
        WorkerThread reader = new WorkerThread("Reader");
        WorkerThread writer = new WorkerThread("Writer");
        WorkerThread logger = new WorkerThread("Logger");
        reader.start();
        writer.start();
        logger.start();
    }
}
