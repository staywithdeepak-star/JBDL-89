import java.util.Random;
import java.util.concurrent.*;

public class ThrdPoolExecutor {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        /**
         * We have 1000 numbers for which we need to get the factorial of, but the #cores available to the JVM in my machine
         * is 10, so if I create 1000 threads manually, there will be a lot of frequent context switching which we can my
         * application's performance
         *
         * Better Alternative:
         * We can use an abstraction layer which creates threads as per our cores and then we can assign tasks to this
         * abstraction layer, and it will schedule the tasks in particular threads.
         *
         * ta1, ta2, ... ta1000
         * t1, t2, ....t10
         *
         * t1 --> ta1, ta3
         * t2 --> ta958, ta670
         */


        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() - 1);

        Callable<Integer> task = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("Inside thread - " +  Thread.currentThread());
                return new Random().nextInt();
            }
        };

        Future<Integer> result = service.submit(task);
        Integer randomNumber = result.get();

        System.out.println(randomNumber);

        service.shutdown();

    }
}
