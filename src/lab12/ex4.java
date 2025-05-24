package lab12;

public class ex4 {
    private static final Object lock = new Object();
    private static int currentThread = 1;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            final int threadNumber = i + 1;
            Thread thread = new Thread(() -> {
                synchronized (lock) {
                    while (currentThread != threadNumber) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    System.out.println("Поток " + threadNumber + ": " + Thread.currentThread().getName());
                    currentThread++;
                    lock.notifyAll();
                }
            });
            thread.setName("Thread-" + threadNumber);
            thread.start();
        }
    }
}
