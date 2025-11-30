//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * A functional interface is a type of an interface which has only 1 abstract (non overridden) function.
         */

        MyInterface obj = new MyInterface() {
            @Override
            public int increment(Object a) {
                System.out.println("a = " + a);
                return (int)a + 1;
            }
        };

//        System.out.println(obj.add(1, 2));

        // Lambda : Shorthand expression of creating objects of an interface without actually specifying the name of the
        // abstract function, just defining the function's body

        MyInterface obj2 = (x) -> {
            System.out.println("x = " + x);
            return ((int) x) + 1;
        };

        MyInterface obj3 = (x) -> {
            System.out.println("x = " + x);
            return (int) x + 2;
        };

        System.out.println(obj2.increment(1));
        System.out.println(obj3.increment(1));
    }
}