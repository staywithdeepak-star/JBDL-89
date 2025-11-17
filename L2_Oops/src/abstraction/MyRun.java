package abstraction;

public interface MyRun {

    void run();

    default void test(){
        System.out.println("test inside MyRun");
    }
}
