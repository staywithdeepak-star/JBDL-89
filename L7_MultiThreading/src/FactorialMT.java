import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class FactorialMT {

    /**
     * numbers - 100
     * cores - 10
     *
     * Threads - 100 for 100 numbers.
     *
     * 1-10 => cpu at Time T1, rest 90 would be in waiting state
     * 11-20 => cpu at Time T2, rest ... would
     *
     * @param args
     */

    /**
     * Abstraction layer which manages the task assigned to a thread
     *
     * Threads - 10
     * Tasks - 100
     *
     */

    // ABC              DEF         XYZ
    //

    /**
     * 1. Correctness -
     * 2. Performance -
     * @param args
     */

    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();

        List<Integer> numbers = Arrays.asList(10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 55000);
//        List<Integer> numbers = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 12, 11);

        MyThread[] threads = new MyThread[numbers.size()];
        for(int i = 0; i < threads.length; i++) {
            threads[i] = new MyThread(numbers.get(i));
            threads[i].start();

        }

        for(int i = 0; i < threads.length; i++) {
            threads[i].join(); // is a blocking call
            System.out.println("number = " + threads[i].number + ", output =  " + threads[i].result + ", inside thread = " + Thread.currentThread());
        }

        long end = System.currentTimeMillis();

        System.out.println("time taken = " + (end - start));

    }

    private static class MyThread extends Thread {

        private int number;
        private BigInteger result;

        MyThread(int number){
            this.number = number;
            this.result = BigInteger.ONE;
        }

        @Override
        public void run() {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            factorial(this.number);
        }

        public void factorial(int n) {
            System.out.println("Inside factorial method: n = " + n + ", thread - " + Thread.currentThread());
            this.result = BigInteger.valueOf(1);
            for(int i = 1; i <= n; i++){
                result = result.multiply(BigInteger.valueOf(i));
            }
        }
    }
}
