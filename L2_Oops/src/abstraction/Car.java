package abstraction;

import java.util.Arrays;

public class Car extends Vehicle {

    @Override
    public void calculateLifeExpectency() {
        System.out.println("Inside calculateLifeExpectancy function of Car...");
    }
}
