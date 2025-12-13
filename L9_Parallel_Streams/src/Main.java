import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Calculate the sum of squares of even numbers
         * numbers : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
         * 2^2 + 4^2 + 6^2 + 8^2 + 10^2
         * 220
         */

        /**
         * Question : Trying to find the first occurrence of a character in a file of let's say million words.  'a'
         * Solution: Sequential stream would be a better option
         */

        /**
         * Question: Check if the character 'a' is present in a file of million words. findAny()
         * Solution: Parallel stream is the best option
         */



//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numbers = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            numbers.add(i);
        }
//        long start = System.currentTimeMillis();
//        System.out.println(calculateSum(numbers));
//        long end  =  System.currentTimeMillis();
//        System.out.println("Time taken by the program to execute " + (end - start));

//        System.out.println(findFirstMultiple(numbers));

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(1);
        set.add(6);
        set.add(5);
        set.add(4);
        set.add(3);
        set.add(7);
        set.add(2);
        set.add(8);
        set.add(9);

//        System.out.println(findFirstMultipleUsingSet(set));

        // Given a list of numbers, return a list of all even numbers
        System.out.println(getEvenNumbers(numbers) + " " + getEvenNumbers2(numbers));
    }

    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .parallel()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

    }

    public static List<Integer> getEvenNumbers2(List<Integer> numbers) {

        // Do not use thread unsafe data structures in parallel streams
//        List<Integer> evenNumbers = new ArrayList<>();
//        HashMap<Integer, Boolean> evenNumbersMap = new HashMap<>();
//
//        numbers.stream()
//                .parallel()
//                .filter(n -> n % 2 == 0)
//                .forEach(x -> evenNumbersMap.put(x, true));

        List<Integer> evenNumbers = new ArrayList<>();
        Hashtable<Integer, Boolean> evenNumbersMap = new Hashtable<>();

        numbers.stream()
                .parallel()
                .filter(n -> n % 2 == 0)
                .forEach(x -> evenNumbersMap.put(x, true)); // t1 --> 6, t2 --> 2 in the same map


        return evenNumbers;

    }

    public static Integer calculateSum(List<Integer> nums){
        return nums.stream()
                .parallel()
                .filter(x -> {
                    System.out.println("Inside filter, x = " + x + " thread - " + Thread.currentThread());
                    return x % 2 == 0;
                })
                .map(x -> {
                    System.out.println("Inside map, x = " + x + " thread - " + Thread.currentThread());
                    return x * x;
                })
//                .reduce(0, Integer::sum);
                .reduce(0, (a, b) -> {
                    System.out.println("Inside reduce, a = " + a + " , b = " + b + " thread - " + Thread.currentThread());
                    return a + b;
                });
    }

    public static Optional<Integer> findFirstMultiple(List<Integer> numbers){
        return numbers
                .stream()
                .parallel()
                .filter(x -> {
                    System.out.println("Inside filter, x = " + x + " thread - " + Thread.currentThread());
                    return x % 5 == 0;
                })
                .findFirst(); // for sequential streams, it works similar to findAny i,e short circuiting terminal operation, but in case of parallel streams, it waits for all the threads to execute until an element which should be the answer appears and then after that it become similar to findAny
    }

    public static Optional<Integer> findFirstMultipleUsingSet(Set<Integer> numbers){

        return numbers
                .stream()
//                .parallel()
                .filter(x -> {
                    System.out.println("Inside filter, x = " + x + " thread - " + Thread.currentThread());
                    return x % 5 == 0;
                })
                .findFirst(); // for sequential streams, it works similar to findAny i,e short circuiting terminal operation, but in case of parallel streams, it waits for all the threads to execute until an element which should be the answer appears and then after that it become similar to findAny
    }

    public static Optional<Integer> findAnyMultiple(List<Integer> numbers){
        return numbers
                .stream()
                .parallel()
                .filter(x -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Inside filter, x = " + x + " thread - " + Thread.currentThread());
                    return x % 3 == 0;
                })
                .findAny(); // Be it a parallel or sequential stream, this function will break as soon as it finds any multiple of 3
    }

    /**
     * Output of a stream depends on multiple factors:
     * 1. parallel or sequential stream --  findAny
     * 2. the type of terminal function -- findFirst
     * 3. the nature of the source data structure --
     *
     * Note: Parallel streams are always suggested as they parallelize / do multiple computation in different threads so it is going to be fast
     * Wrong assumption
     */

}