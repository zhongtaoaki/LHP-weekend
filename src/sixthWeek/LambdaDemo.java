package sixthWeek;

public class LambdaDemo {

    public static void main(String[] args) {

        // Runnable runnable = new Runnable() {
        // public void run() {
        // System.out.println("这是一个新的线程在运行");
        // }
        // };

        // Thread thread = new Thread(runnable);
        Thread thread = new Thread(new Runnable() {
            public void run() {
                System.out.println("这是一个新的线程在运行");
            }
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("这是一个新的线程在运行");
        });

        Thread thread3 = new Thread(() -> System.out.println("这是一个新的线程在运行"));

        thread.start();

        System.out.println(new Student());

    }
}

// class RunnableInstance implements Runnable{

// @Override
// public void run() {
// System.out.println("这是一个新的线程在运行");
// }
// }

class Student {

}