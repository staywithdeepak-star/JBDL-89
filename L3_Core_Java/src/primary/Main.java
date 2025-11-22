package primary;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    /**
     * Oops concepts:
     * 1. Data hiding
     * 2. Encapsulation
     * 3. Abstraction
     * 4. Polymorphism -  It is a concept with different meanings depending on the context
     *      Compile time polymorphism - phenomenon applied at the compile time allowing the compiler to decide which function to invoke
         *      Exhibited by similar functions, i.e functions having same name but different signature
         *      Signature - combination of number and type of arguments
         *      Function overloading
     *      Run time polymorphism - phenomenon applied during runtime allowing the JVM to decide which function to be called
         *      Exhibited by overriding functions, i.e functions with the same name and signature defined in the parent and child classes.
         *      And the JVM chooses whether parent's function needs to be called or the child class function needs to be called
     *
     * Country level pricing - 15 INR per km
     * State level pricing for Bangalore - 30 INR per km (Override country level pricing)
     * Delhi - 15 INR per km (No need to override the country level pricing)
     */

    public static void main(String[] args) {

        add(2, 5);
        add("10", "15");

        Person p = new Person(1);
        Person p2 = new Person("Rahul", "Kumar", 2, 20);


        Car o1 = new Car();
        Vehicle o2 = new Vehicle();
        Vehicle o3 = new Car();

//        primary.Car o4 = new primary.Vehicle();
    }

//    public static Integer add(int c, int d){
//        return c + d;
//    }

//    public static String add(int a, int b){
//        return String.valueOf(a + b);
//    }

//    public static Integer add(int c, int d){ // Not an example of compile time polymorphism, it's a duplicate function
//        return c + d;
//    }

    public static Integer add(int a, int b){
        return a + b;
    }

    public static Integer add(String a, String b){
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    public static Integer add (int a, int b, int c){
        return a + b + c;
    }

    public static Integer add(int a, String b){
        return a + Integer.parseInt(b);
    }
}
