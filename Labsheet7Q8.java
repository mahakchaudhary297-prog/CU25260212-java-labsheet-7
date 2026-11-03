class PriorityThread extends Thread {
    public void run() {
        System.out.println(getName() + " running with priority " + getPriority());
    }
}

public class Labsheet7Q8 {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println("t1 priority before start: " + t1.getPriority());
        System.out.println("t2 priority before start: " + t2.getPriority());
        t1.start();
        t2.start();
    }
}
