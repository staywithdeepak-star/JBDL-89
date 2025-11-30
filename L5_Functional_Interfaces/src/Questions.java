import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Questions {

    /**
     * Q1. Given a list of numbers, you need to find the sum of squares of even numbers.
     * numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
     *  2^2 + 4^2 + 6^2 + 8^2 + 10^2
     *  4 + 16 + 36 + 64 + 100
     *  220
     *
     *  Q2. Given a list of cities, return the unique cities in Upper case
     *  cities: ["Delhi", "Noida", "Gurugram", "Noida", "Bangalore", "Noida", "Delhi","Hyderabad"]
     *  result: ["DELHI", "NOIDA", "GURUGRAM", "BANGALORE", "HYDERABAD"]
     */

    /**
     * All streams need to have exactly 1 terminal stage / function, and there can be
     * any number of intermediate functions
     *
     * For streams to execute there needs to be 1 terminal function defined, otherwise they won't
     * execute at all
     */

    /**
     * Identity for addition ? 0
     * Identity for subtraction ? 0
     * Identity for multiplication ? 1
     * Identity for division ? 1
     * Identity for power ? 1
     *
     *  E OP I = E
     *  E + 0 = E ()
     *  E - ? = E
     *  E * 1 = E
     *  E / 1 = E
     *  E ^ 1 = E
     *
     * @param args
     */

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            numbers.add(i);
        }

//        List<String> cities = Arrays.asList("Delhi", "Noida", "Gurugram", "Noida", "Bangalore", "Noida", "Delhi","Hyderabad");
//
//        System.out.println(capitalizeUniqueCities(cities));
//        System.out.println(capitalizeUniqueCitiesUsingStream(cities));

//        int result = sumOfSquares(numbers);
        int result2 = sumOfSquaresUsingStream(numbers);
//        System.out.println(result2);
    }

    // Declarative coding style
    public static Integer sumOfSquaresUsingStream(List<Integer> numbers){
        return numbers.stream()
                .filter((i) -> {
                    System.out.println("Inside filter: i = " + i);
                    return i % 2 == 0;
                })
                .map((x) -> {
                    System.out.println("Inside map: x = " + x);
                    return x * x;
                }).reduce(0, (x, y) -> {
                    System.out.println("Inside reduce: x = " + x + ", y = " + y);
                    return x + y;
                });
    }

    // 221 or 225 ?



//    public static Integer sumOfSquaresUsingStreamV1(List<Integer> numbers){
//
//        Stream<Integer> stream = numbers.stream();
//
//        stream = stream.filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer % 2 == 0;
//            }
//        });
//
//        stream = stream.map(new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer integer) {
//                return integer * integer;
//            }
//        });
//
//        int result = stream.reduce(0, new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer integer, Integer integer2) {
//                return integer + integer2;
//            }
//        });
//
//        return result;
//
//    }

    // Imperative
    public static Integer sumOfSquares(List<Integer> numbers){

        int sum = 0;
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 == 0){
                int square = numbers.get(i)*numbers.get(i);
                // int square = Math.pow(number.get(i), 2)
                sum += square;
            }
        }

        return sum;
    }

//    public static List<String> capitalizeUniqueCities(List<String> cities){
//
//        List<String> uniqueCities = new ArrayList<>();
//        Set<String> uniqueCitiesSet = new HashSet<>();
//
//        for(String city : cities){
//            if(!uniqueCitiesSet.contains(city)){
//                uniqueCitiesSet.add(city);
//                uniqueCities.add(city.toUpperCase());
//            }
//        }
//
//        return uniqueCities;
//    }

    public static List<String> capitalizeUniqueCities(List<String> cities){

        List<String> citiesToCapitalize = new ArrayList<>();

        for(String city : cities){
            citiesToCapitalize.add(city.toUpperCase());
        }

        Set<String> uniqueCities = new HashSet<>(citiesToCapitalize);
        return new ArrayList<>(uniqueCities);
    }

    public static List<String> capitalizeUniqueCitiesUsingStream(List<String> cities){
        List<String> citiesToReturn = cities.stream()
                .distinct()
                .map(c -> c.toUpperCase())
                .collect(Collectors.toList());

//        List<String> citiesToReturn = cities.stream()
//                .map(c -> c.toUpperCase())
//                .distinct()
//                .collect(Collectors.toList());

        return citiesToReturn;
    }
}
