package Lesson_15;

import java.util.concurrent.locks.ReentrantLock;

public class RunnableThread implements Runnable {

    BufferLock.CommonResource res;
    ReentrantLock locker;

    RunnableThread(BufferLock.CommonResource res, ReentrantLock lock) {
        this.res = res;
        locker = lock;
    }
    RunnableThread() {

    }

    @Override
    public void run() {
        locker.lock(); // устанавливаем блокировку
        try {
            res.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                Thread.sleep(100);
            }
        } catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        } finally {
            locker.unlock();
        }
    }
}
