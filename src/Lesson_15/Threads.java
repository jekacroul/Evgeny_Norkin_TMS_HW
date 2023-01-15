package Lesson_15;

public class Threads {
    public static void ThreadJoin() {
        RunnableThread runnableThread = new RunnableThread();
        Thread thread = new Thread(runnableThread);
        Thread thread1 = new Thread(runnableThread);
        Thread thread2 = new Thread(runnableThread);

        thread.start();
        try {
            thread1.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        thread1.start();
        try {
            thread2.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        thread2.start();
        boolean check = thread.isAlive();
        boolean check1 = thread1.isAlive();
        boolean check2 = thread2.isAlive();

        System.out.println("Thread 1: " + check);
        System.out.println("Thread 2: " + check1);
        System.out.println("Thread 3: " + check2);
    }
}
