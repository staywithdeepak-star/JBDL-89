//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World from thread - " + Thread.currentThread()); // thread name - main, group name - main, priority - 5

        Thread t1 = new Thread(new MyRunnable(), "my-thread");
        t1.setDaemon(true);
        t1.start();
         // Making a thread as background

        Thread t2 = new Thread(() -> {
            System.out.println("Hello World from thread - " + Thread.currentThread());
        });

//        Creating a single thread using lambda
//        Thread t3 = new Thread(() -> {
//            System.out.println("Hello World from thread - " + Thread.currentThread());
//        });

//        Another way of creating multiple threads using lambdas
//        Thread[] threads = new Thread[3];
//        for(Thread t : threads){
//            t = new Thread(() -> {
//                System.out.println("Hello World from thread - " + Thread.currentThread());
//            });
//            t.start();
//        }


        t2.start();


        System.out.println("Inside main function after creating thread - " + Thread.currentThread());
        // group name - main, priority - 5, thread name - ?? Thread-0 / main

        MyThread t = new MyThread();
        t.start();

        MyTheadOuter thread = new MyTheadOuter();
        thread.start();

        /**
         * Foreground and background threads

         * Foreground thread: Main thread created by JVM is always a foreground thread + we can also create some foreground threads
         * A thread which will keep the application running until the thread is running, i.e application cannot be closed until the foreground
         * threads are completely executed


         * Background threads: A thread which does not hamper the application running state i.e the application can be stopped even
         * if there are some background threads running
         *
         * Garbage collector in Java is an example of background thread which cleans the unused / unreferenced memory
         * via mark and sweep algorithm
         */

        /**
         * Whenever we run any Java application, JVM creates a thread with the name `main` and all the code that we
         * write runs inside the main thread
         */

        /**
         * 8 cores
         * T1 - T1000
         * Thread spends time in 2 things:
         * 1. Context switching:
         * 2. Execution:
         * Context switching time > execution time : Thrashing
         *
         * Executes: 10 ms in one cycle
         * Context switching : 1 microsecond in context switching
         *
         * T1: t0
         * T9: t1
         * T17:
         * T25:
         * ...
         * T1:
         * Starvation: When a thread waits for too long to execute as the core is occupied by another threads
         */
    }

    private static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("Inside run() method, current thread - " + Thread.currentThread());
            int sum = 0;
            for(int i = 1; i <= 100000; i++){
                sum += i;
            }

            System.out.println("sum = " + sum);
        }
    }

    private static class MyThread extends Thread {

        @Override
        public void run() {

        }
    }
}