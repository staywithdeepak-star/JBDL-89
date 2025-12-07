import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class Factorial {

    public static BigInteger factorial(int number) {
        System.out.println("Inside factorial method: n = " + number + ", thread - " + Thread.currentThread());
        BigInteger result = BigInteger.valueOf(1);
        for(int i = 1; i <= number; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Inside main method: thread - " + Thread.currentThread());
        List<Integer> numbers = Arrays.asList(10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 55000);

        long start = System.currentTimeMillis();
        List<Callable<BigInteger>> tasks = new ArrayList<>();
        for(Integer number : numbers){
            Callable<BigInteger> task = () -> factorial(number);
            tasks.add(task);
        }

        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() - 2);

        List<Future<BigInteger>> futures = tasks
                .stream()
                .map(x -> executor.submit(x))
                .collect(Collectors.toList());

        for(Future future: futures){
            BigInteger result = (BigInteger) future.get(); // similar to thread.join()
//            System.out.println(result);
        }

        executor.shutdown();

        long end = System.currentTimeMillis();

        System.out.println("Total execution time: " + (end - start) + "ms");
    }
}
