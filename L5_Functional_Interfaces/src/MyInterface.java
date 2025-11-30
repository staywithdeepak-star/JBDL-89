//@FunctionalInterface
public interface MyInterface {

    int increment(Object obj);

//    void subtract(int a, int b); Not possible since in a functional interface only 1 abstract non-overriding function is allowed

    boolean equals(Object obj);

    default void test(){
        System.out.println("Inside test method");
    }

//    int subtract(int a, int b);
}
