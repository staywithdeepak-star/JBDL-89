import java.util.HashMap;

public class Main {

    {
        System.out.println("Inside non static block, a = " + this.a + ", b = " + this.b);
    }

    int a = 20;  // declaration and assignment of values
    Integer b = 40;

    Main(){
        System.out.println("Inside constructor, a = " + this.a + ", b = " + this.b);
    }

    // 5, 8, 12

    /**
     * A - both the print statements would be printed
     * B - non static block print statement would be printed
     * C - static block print statement would be printed
     * D - nothing would be printed
     * @param args
     */

    /**
     * Execution order at a class level:
     * 1. Static blocks are executed first (depending on their declaration order, if there are multiple blocks)
     * 2. Main function is executed
     *
     *
     * Execution order at an object level:
     * 1. Depending on the order of non static blocks and member variables assignment, these would be executed first
     * 2. Constructor logic is going to be executed afterwards
     */

    public static void main(String[] args) {

//        System.out.println("Inside main");
        Main obj = new Main();
    }

//    static {
//        System.out.println("Inside static block 2");
//    }
//
//    static {
//        System.out.println("Hello World from static block");
//    }
}
