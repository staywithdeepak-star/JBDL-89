package abstraction;

import java.util.Random;

/**
 * Class --> Class (extends)
 * Interface --> Interface (extends)
 * Class --> Interface (implements)
 * Interface --> Class (Not possible)
 */

public class USCalculator implements Calculator{

    static int getCount(){
        return new Random().nextInt(10)+1;
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }

    @Override
    public void run() {

    }
}
