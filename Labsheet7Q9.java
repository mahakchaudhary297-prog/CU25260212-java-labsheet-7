class PriorityWorker extends Thread {
    public PriorityWorker(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public void run() {
        System.out.println(getName() + " with priority " + getPriority() + " finished.");
    }
}

public class Labsheet7Q9 {
    public static void main(String[] args) {
        PriorityWorker t1 = new PriorityWorker("Thread-1", 1);
        PriorityWorker t2 = new PriorityWorker("Thread-3", 3);
        PriorityWorker t3 = new PriorityWorker("Thread-5", 5);
        PriorityWorker t4 = new PriorityWorker("Thread-8", 8);
        PriorityWorker t5 = new PriorityWorker("Thread-10", 10);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
