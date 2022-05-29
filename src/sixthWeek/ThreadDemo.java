package sixthWeek;

public class ThreadDemo implements Runnable {

    private static int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("这是线程1: " + count++);
        }
    }

    public static void main(String[] args) {

        // ThreadDemo thread = new ThreadDemo();
        // Thread thread = new ThreadDemo();
        Runnable runnable = new ThreadDemo();
        Thread thread = new Thread(runnable);
        thread.start();

        // while (thread.isAlive()) {
        //     System.out.println("main thread is waiting");
        // }

        for (int i = 0; i < 1000; i++) {
            System.out.println("这是主线程: " + count++);
        }
    }
}
