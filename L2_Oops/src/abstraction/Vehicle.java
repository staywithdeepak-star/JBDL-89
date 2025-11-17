package abstraction;

public abstract class Vehicle {

    // In a non abstract class you cannot define an abstract function, but vice versa is not true which means
    // you can define a non abstract function in an abstract class

    /**
     * You cannot instantiate objects of an abstract class because, if someone calls the abstract function of
     * this class, it would be a dead end since there would not be any body of it
     */

//    public void calculateMileage(); Not possible

    public void calculateMileage(){
        System.out.println("Inside calculateMileage of Vehicle");
    }

//    protected abstract void test();

    public abstract void calculateLifeExpectency();

}
