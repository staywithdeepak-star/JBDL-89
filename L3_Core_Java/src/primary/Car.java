package primary;

public class Car extends Vehicle{

    public void calculateSpeed(){
        System.out.println("Inside calculateSpeed method of class primary.Car");
    }

//    protected void calculateMileage(){ // Not possible to assign weaker access as the parent has a stronger access of public
//        System.out.println("Inside calculateMileage method of primary.Car");
//    }

//    protected void calculateSpeed(){
//        System.out.println("Inside calculateSpeed method of class primary.Car");
//    }

    public void test(){
        System.out.println("Inside test method of primary.Car");
    }

    public static void main(String[] args) {
    }
}
