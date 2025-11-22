package secondary;

import primary.Car;
import primary.Vehicle;

public class Test {

    public static void main(String[] args) {

        /**
         * Access Modifier of the parent is inherited as it is to the child class
         * Public function of a parent class comes as a public function in the child class if you don't override or
           if you override without changing the access modifier
         * Change the access modifier of an overridden function in the child class, there can be two possibilities:
         *  1. You can give stronger access (making it less restrictive) in the child class
         *     Ex: protected function in the parent --> public function in the child class
         *  2. You can give weaker access (Making it more restrictive) in the child class
         *     Ex: public function in the parent --> protected function in the child class
         */

        /**
         * When vehicle was protected, and car was public (Parent was protected and child was public)
         */

        Vehicle o1 = new Vehicle();
//        o1.calculateSpeed(); // o1's calculateSpeed is protected hence not accessible outside of the package

        Vehicle o2 = new Car();
        o2.calculateFuel();
//        o2.calculateSpeed() // Vehicle was seen as protected

        Car o3 = new Car();
        o3.calculateSpeed();


        /**
         * Parent was public and child was protected
         */

        Vehicle v1 = new Vehicle();
        v1.calculateMileage();

        Vehicle v2 = new Car();
        v2.calculateMileage();

        Car v3 = new Car();
//        v3.calculateMileage();

    }
}
