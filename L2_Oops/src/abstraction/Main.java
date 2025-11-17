package abstraction;

public class Main {

    /**
     * In java, we cannot inherit(extends) multiple classes but we can implement multiple interfaces from a class
     * In java, we can inherit (extends) multiple interfaces from an interface
     */

    public static void main(String[] args) {
//        USCalculator calculator = new USCalculator();
//        System.out.println(calculator.add(1, 2)); // 3

//        System.out.println(calculator.subtract(10, 20)); // -10
//        System.out.println(calculator.multiply(2, 3)); // 6
//        System.out.println(calculator.divide(3, 0)); // Arithmetic exception
//        System.out.println(calculator.power(2, 10));

//        EnglishCalculator calculator = new EnglishCalculator();
//        System.out.println(calculator.add(1, 2)); // 3
//
//        System.out.println(calculator.subtract(10, 20)); // 10
//        System.out.println(calculator.multiply(2, 3)); // 6
//        System.out.println(calculator.divide(3, 0)); // -1
//        System.out.println(calculator.power(2, 10));

        Calculator calculator = new Calculator() {
            @Override
            public int add(int a, int b) {
                System.out.println("Inside annoymous inner class");
                return a + b + 2;
            }

            @Override
            public int subtract(int a, int b) {
                return 0;
            }

            @Override
            public int multiply(int a, int b) {
                return 0;
            }

            @Override
            public int divide(int a, int b) {
                return 0;
            }

            @Override
            public void run() {

            }
        };

        System.out.println(calculator.add(10, 20));

//        Vehicle vehicle = new Vehicle() {
//            @Override
//            public void calculateLifeExpectency() {
//                System.out.println("Inside vehicle implementation class");
//            }
//        };
//        vehicle.calculateLifeExpectency();
//        vehicle.calculateMileage();


//
//        Vehicle vehicle = new Car();
//        vehicle.calculateMileage();
//        vehicle.calculateLifeExpectency();


        Car car = new Car();
        car.calculateMileage();
//        car.calculateLifeExpectency();


        USCalculator calci = new USCalculator();
        calci.test();

        System.out.println(calci.getCount());    // writing this is not desirable, though it works but this function will the same value for all the objects
        System.out.println(USCalculator.getCount());

//        USCalculator.test(); Not possible

        /**
         * I am writing on a Whiteboard which is accessible to all of you.
         * Yourself - analogous to an object
         * My whiteboard - analogous to static function
         * Your own whiteboard - analogous to non-static / member function
         */
    }
}
