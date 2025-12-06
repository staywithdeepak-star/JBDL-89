import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class Factorial {

    /**
     * Q1. You are given a list of big numbers, you need to factorial of all the numbers
     *
     * numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
     * ans = [1, 2, 6, 24, 120, 720, 5040, 40320, ...  ]
     */

    /**
     * System.currentTimeMillis - represents the epoch time in milliseconds from Jan 1st 1970 (UTC)
     * @param args
     */

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        List<Integer> numbers = Arrays.asList(10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 55000);

        for(Integer number: numbers){
            BigInteger result = factorial(number);
//            System.out.println(result);
        }

        long end = System.currentTimeMillis();
        System.out.println("Time taken by program to execute - " + (end - start));
    }

    public static BigInteger factorial(int n) {
        System.out.println("Inside factorial method: n = " + n + ", thread - " + Thread.currentThread());
        BigInteger result = BigInteger.valueOf(1);
        for(int i = 1; i <= n; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
