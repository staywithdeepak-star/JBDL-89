package collections;

import oops.Model;
import oops.Vehicle;

public class Main extends Vehicle{

    public void test(){
        this.color = "blue";
        this.wheels = 3;
//        this.mileage = "";
//        this.model = Model.SUV;
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
//        vehicle.model = Model.SEDAN;
        vehicle.wheels = 10;
    }
}
