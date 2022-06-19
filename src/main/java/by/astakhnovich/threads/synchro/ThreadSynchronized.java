package by.astakhnovich.threads.synchro;

public class ThreadSynchronized {
    static int i = 0;

    public static void main(String[] args) {
        Runnable runnable1 = () -> {
            for (int i = 0; i<100; i++){
                System.out.println("th 1 = " + incr());
            }
        };

        Runnable runnable2 = () -> {
            for (int i = 0; i<100; i++){
                System.out.println("th 2 = " + incr());
            }
        };

        Thread th1 = new Thread(runnable1);
        Thread th2 = new Thread(runnable2);
        th1.start();
        th2.start();
    }

    static int incr(){
        return i++;
    }
}