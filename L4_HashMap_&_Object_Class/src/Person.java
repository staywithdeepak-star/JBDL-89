import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Person {
//
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }

        Person person = (Person)o;
        if(!person.name.equals(this.name)) {
            return false;
        }

        if(person.id != this.id){
            return false;
        }

//        if(person.age != this.age){
//            return false;
//        }

        return true;
    }

    public int hashCode(){
        return Objects.hash(this.id, this.name);
    }

    @Override  // annotation
    public String toString() {
        return "Person - { id = " + this.id + ", name = " + this.name + ", age = " + this.age + " }";
    }

    private String name;
    private Integer id;
    private Integer age;

    public Person(String name, Integer id, Integer age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Person p1 = new Person("P1", 1, 10);
        Person p2 = new Person("P2", 2, 20);
        Person p3 = new Person("P1", 1, 30);

//        System.out.println(p1.name.hashCode() + " " + p3.name.hashCode());
//        System.out.println(p1.id.hashCode() + " " + p3.id.hashCode());

        System.out.println(p1.hashCode() + " " + p2.hashCode() + " " + p3.hashCode());
        System.out.println(p1.equals(p3));

        Map<Person, Boolean> map = new HashMap<Person, Boolean>();
        map.put(p1, true);
        map.put(p2, false);
        map.put(p3, false);
        System.out.println(map);
    }

    /**
     * Apply certain combinations of different hashcode and equals function, and then tried to answer few questions
     * on the basis of the input data and the logic of equals and hashcode function.
     *
     * Understand the logic of hashcode internal implementation:
        1. Selecting the bucket needed for storing or retrieving the data
           Selection of bucket is determined by the hashcode function on the key , not on the value
        2. If the buckets are different, no need to worry on the equality check
        3. If the buckets are same, then hashmap's logic checks if the already stored element's key is
           same as the key of the incoming element, if yes then both are same and the values are overriden
           instead of creating a new key value pair
        4. If the buckets are same but they are not equals, then it's a case of collision and a new element will be stored
           either thru chaining or probing.

       Conclusion: Equality check is determined by the overridden equals function
                   Bucket index is retrieved using the hashcode function
     */


}
