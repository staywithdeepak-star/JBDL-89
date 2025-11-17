package abstraction;

public interface MyRun2 {

    void run();

    default void test() {
        System.out.println("test inside MyRun2");
    }
}
