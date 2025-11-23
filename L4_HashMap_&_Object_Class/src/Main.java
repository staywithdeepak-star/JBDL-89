import java.util.*;

/**
 * In java every class inherently extends from Java.lang's object class
 */

public class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        HashMap<String, Boolean> citiesMap = new HashMap<>();
        citiesMap.put("Delhi", true); // inserted in the map
        citiesMap.put("Shimla", true);
        citiesMap.put("Delhi", false); // put is similar to upsert : update if present or else insert

        System.out.println(citiesMap);

//        String s1 = "Delhi";
//        String s2 = "Delhi";
//
//        Person p1 = new Person("Rahul", 1);
//        Person p2 = new Person("Rahul", 1);
//        Person p3 = new Person("Tahir", 1);
//
//        Person p4 = p1;
//
//        System.out.println(p1.hashCode());
//
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//
//        System.out.println(p1 == p2);  // false
//        System.out.println(p1.equals(p2));
//        System.out.println(p1.equals(p4));
//        System.out.println(p1.equals(p3));

//        String s1 = new String("Delhi");
//        String s2 = new String("Delhi");
//        String s3 = new String("India");
//
////        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));

//        Integer i1 = new Integer(1);
//        Integer i2 = new Integer(1);
//        System.out.println(i1 == i2);


//        Integer i1 = 1;
//        Integer i2 = 1;
//        System.out.println(i1 == i2);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        System.out.println(list);

        Integer[] array = {1, 2};
        System.out.println(array);

//        System.out.println(p1);

    }
}