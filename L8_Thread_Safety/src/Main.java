//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    /**
     * 1. Parallel streams - implementation
     * 2. Generics examples
     * 3. Exception handling
     */

    public static void main(String[] args) throws InterruptedException {

        BankAccount obj = new BankAccount("b1", 50000);
        BankAccount obj2 = new BankAccount("b2", 10000);

        MyThread t1 = new MyThread(obj, true, 500); // +500 in b1
        t1.start(); // this statement is slightly time taking ? why because it's going to create a new thread on the OS / Hardware

        MyThread t2 = new MyThread(obj, false, 1000); // -1000 in b1
        t2.start(); // this statement is slightly time taking ? why because it's going to create a new thread on the OS / Hardware

        MyThread t3 = new MyThread(obj, false, 300);
        t3.start();

        MyThread t4 = new MyThread(obj, true, 400);
        t4.start();

        MyThread t5 = new MyThread(obj2, true, 500);
        t5.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        System.out.println("Balance obj = " + obj.getBalance() + ", obj 2 = " + obj2.getBalance());
    }
}