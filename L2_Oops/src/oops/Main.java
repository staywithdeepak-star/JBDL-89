package oops;

import java.util.*;

public class Main {

    /**
     * Oops - Object oriented programming
     * 1. Data hiding: Whenever we are writing java applications, we should always hide the internal
     *    specification and only allow the functionalities to be access to the outside world.
     *    This is exhibited by private access modifier in front of member variables
     * 2. Encapsulation: Binding the properties and the functionalities of an entity together.
     *    This is exhibited by classes and objects in Java
     * 3. Abstraction: Instead of making the implementation of a functionality visible to the outside world, we can create a layer of abstraction
     *    and only display the relevant information.
     *    This is exhibited through abstract classes and interfaces


     *    Before Java 8, abstract classes were used when people need to write default functionalities in the abstract classes
     *    and interfaces were used when a certain is already inheriting from some other class.

     *    With the invention of interface level default functions in Java 8, abstract classes have almost become useless
     * 4. Polymorphism ->
     */

    /**
     * Access modifiers
     * 1. private : accessible within the same class where they are defined
     * 2. default / no access modifier: accessible within all the classes of the same package
     * 3. protected: accessible within the same package (all the classes in the same package) + any child class of a different package
     * 4. public: accessible throughout the entire project, no restriction at all
     */


    /**
     *
     */

    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
////        vehicle.mileage = "15km/litre"; // not accessible
////        vehicle.setMileage("15km/litre");
////
////        System.out.println(vehicle.getMileage());
//
////        vehicle.setWheels(-4);
//        vehicle.wheels = -4;
//
//        System.out.println(vehicle.wheels); // ? 0 / -4 / null
//
//        // s is a variable which is pointing to / referencing the value of a string type stored at a certain location in the memory
//        // b is a variable which is pointing to / referencing the value of a vehicle type stored ....
//
//        String s = "abc";
//        Vehicle b = new Vehicle();
//        Vehicle c = new Vehicle();
//
//        c.mileage = "4km/l"; // private not accessible outside the class
//        c.model = Model.SEDAN;
//        c.wheels = 30;
//        c.color = "red";

        // Home - analogous to an object
        // Address of your home is analogous to address of the memory location where that object is being stored / located
        // Your name is analogous to the variable using which we are accessing that stored object

//        HashMap<String, Movie> map = new HashMap<>();
//        Movie m1 = new Movie("name": "ABC", "releaseDate": "14-09-2023", "duration": 180, "creator": "Jim");
//        map.put("abc", )


        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers.size());

    }
}
