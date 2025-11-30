import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Person implements Comparable<Person> {

    private int  id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person(1, "Jack", 20);
        people[1] = new Person(2, "Jill", 19);
        people[2] = new Person(3, "Jane", 19);

        Arrays.sort(people);

        for(Person p : people) {
            System.out.println(p);
        }
    }

    @Override
    public String toString() {
        return this.getName();
    }


    @Override
    public int compareTo(Person o) {
        System.out.println("Inside compare function: p1 - " + this + " p2 - " + o);

        if(this.getAge() != o.getAge()) {
            return this.getAge() - o.getAge();  // < 0 that means o1 is younger than o2
        }

        return this.getName().compareTo(o.getName());
    }
}
