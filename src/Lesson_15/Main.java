package Lesson_15;

public class Main {
    public static void main(String[] args) {
        try {
            BufferLock.ThreadWork();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
//        Threads.ThreadJoin();
    }
}
