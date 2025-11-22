package primary;

public class Person {

    private String  firstName;
    private String lastName;
    private Integer id;
    private Integer age;


    /**
     * Constructor overloading - multiple constructors in the class with different signatures
     * Method overloading - multiple functions with the same and different signatures
     * @param firstName
     * @param lastName
     * @param id
     * @param age
     */
    public Person(String firstName, String lastName, Integer id, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }

    public Person(Integer id){
        this.id = id;
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
    }
}
