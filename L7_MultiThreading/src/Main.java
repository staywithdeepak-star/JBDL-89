public class Main {
    public static void main(String[] args) {

        System.out.println("Inside main function, thread - " + Thread.currentThread());
        MyThread myThread = new MyThread();
        myThread.start();

        MyThread2 myThread2 = new MyThread2();
        Thread thread = new Thread(myThread2);
        thread.start();

        // Ques: Can we start a thread which is already started ?

    }

    private static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("Inside thread - " + currentThread());
        }
    }

    private static class MyThread2 implements Runnable {

        @Override
        public void run() {
            System.out.println("Inside thread - " + Thread.currentThread());
        }
    }
}