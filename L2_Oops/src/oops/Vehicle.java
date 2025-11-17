package oops;

public class Vehicle {

    /**
     * int - 0
     * float / double - 0.0
     * string / any other non primitive data type - null
     * boolean - false
     */

    private String mileage;     // member variables exhibit the properties of the object created from this class
    Model model;
    public Integer wheels;
    protected String color;

    public void calculateMileage(){     // Member functions exhibits functionalities of a class
        // Basis some logic, you want to set the speed of the vehicle
    }

    public void setMileage(String mileage){
        this.mileage = mileage;

//        mileage = mileage;
    }

    public String getMileage() {
        return this.mileage;
    }

    public void setWheels(Integer wheels){
        if(wheels <= 0){
            System.out.println("Incorrect number of wheels given");
            return;
        }
        this.wheels = wheels;
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.wheels = 4;
        vehicle.model = Model.SEDAN;
        vehicle.mileage = "20km/l";
    }

    /**
     * class Video {
     *     name;
     *     releaseDate;
     *     duration;
     *     creator;
     * }
     *
     * movie1 - {"name": "ABC", "releaseDate": "14-09-2023", "duration": 180, "creator": "Jim"} - 028fa31
     * movie2 - {"name": "DEF", "releaseDate": "15-09-2023", "duration": 170, "creator": "John"}
     */
}
