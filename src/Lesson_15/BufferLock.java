package Lesson_15;

import java.util.concurrent.locks.ReentrantLock;

/*
Основное задание
1. Создать три потока Т1, Т2 и Т3
Реализовать выполнение поток в последовательности Т3 -> Т2 -> Т1
(используя метод join)

Дополнительное задание
2. Напишите многопоточный ограниченный буфер с использованием
ReentrantLock.

3. Напишите многопоточный ограниченный буфер с использованием
synchronized.
 */
public class BufferLock extends RunnableThread{
    BufferLock(CommonResource res, ReentrantLock lock) {
        super(res, lock);
    }

    public static void ThreadWork() throws InterruptedException {

        ReentrantLock reentrantLock = new ReentrantLock();
        CommonResource commonResource = new CommonResource();

        for (int i = 0; i < 6; i++) {
            Thread t = new Thread(new RunnableThread(commonResource, reentrantLock));
            t.setName("Thread "+ i);
            t.start();
        }
    }
    static class CommonResource{
        int x=0;
    }
}
