import java.util.*;

public class DS {

    public static void A(){
        System.out.println("Inside A");
    }

    /**
     * Interface: Contract that contains several functions declarations. It doesn't have any definitions
     * It is the responsibility of the implementing class to define the functions present in the parent interface
     */

    /**
     * Map<String, Integer> map = new HashMap<>();
     * creating a reference of map and an instance of HashMap
     * reference                =   Instance

     * HashMap<String, Integer> map = new HashMap<>();
     * creating a reference and instance of hashmap
     *
     */

    public static Map<String, Integer> countOccurrences(List<String> strings){

        Map<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for(int i = 0; i < strings.size(); i++){
            if(map.containsKey(strings.get(i))){
                map.put(strings.get(i), map.get(strings.get(i)) + 1); // Insertion, Retrieval and Deletion in HashMap is O(1) on an average
            }else{
                map.put(strings.get(i), 1);
            }
        }
        return map;
    }

    public static Set<String> distinctCities(List<String> cities){

        Set<String> citiesSet = new HashSet<>();
        for(int i = 0; i < cities.size(); i++){
            citiesSet.add(cities.get(i)); // Insertion, Retrieval and Deletion in HashSet is O(1) on an average
        }

        return citiesSet;
    }

    public static void main(String[] args) {
        /**
         *
         Q1. Given a list of strings, you need to print the frequency of every string in the list
         List :  ["city", "state", "cities", "city", "India", "India", "India"]
         city - 2, cities : 1, state : 1, India : 3
         */

        /**
         * Q2. Given a list of cities, return all the distinct cities
         * List: ["Jaipur", "Bangalore", "Delhi", "Jaipur", "Nagpur", "Bangalore", "Chennai"]
         * {"Jaipur", "Bangalore", "Delhi", "Nagpur", "Chennai"}
         */


//        List<String> strings = Arrays.asList("city", "state", "cities", "city", "India", "India", "India");
//        Map<String, Integer> result = countOccurrences(strings);
//        System.out.println(result);

        List<String> cities = Arrays.asList("Jaipur", "Bangalore", "Delhi", "Jaipur", "Nagpur", "Bangalore", "Chennai");
        System.out.println("Distinct cities: " + distinctCities(cities));
    }
}
