public class Labsheet7Q3 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Name: " + t.getName() + ", Priority: " + t.getPriority());
        t.setName("MainWorkerThread");
        System.out.println("New Name: " + t.getName() + ", Priority: " + t.getPriority());
    }
}
