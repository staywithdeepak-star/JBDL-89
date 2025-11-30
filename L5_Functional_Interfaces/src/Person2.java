import java.util.Arrays;
import java.util.Comparator;

public class Person2 {

    private int  id;
    private String name;
    private int age;

    public Person2(int id, String name, int age) {
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

    @Override
    public String toString() {
        return this.getName();
    }

    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person(1, "Jack", 20);
        people[1] = new Person(2, "Jill", 19);
        people[2] = new Person(3, "Jane", 19);

        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                System.out.println("Inside compare function: p1 - " + o1 + " p2 - " + o2);

                if(o1.getAge() != o2.getAge()) {
                    return o1.getAge() - o2.getAge();  // < 0 that means o1 is younger than o2
                }

                return o1.getName().compareTo(o2.getName());
            }
        });


        Comparator<Person> comp = (o1, o2) -> {
            if(o1.getAge() != o2.getAge()) {
                return o1.getAge() - o2.getAge();  // < 0 that means o1 is younger than o2
            }

            return o1.getName().compareTo(o2.getName());
        };
        Arrays.sort(people, comp);

        for (Person p : people) {
            System.out.println(p);
        }
    }
}
