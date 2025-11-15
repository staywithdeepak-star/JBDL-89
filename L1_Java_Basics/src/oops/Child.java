package oops;

public class Child extends Parent {

    public void A(){
        System.out.println("Inside A of class Child");
    }

    public void C(){
        System.out.println("Inside C of class Child");
    }


    public static void main(String[] args) {
        Child o1 = new Child(); // Creating an instance of Child from the reference of Child
        Parent o2 = new Parent(); // Creating an instance of Parent from the reference of Parent
        Parent o3 = new Child(); // Creating an instance of Child from the reference of Parent
//        Child o4 = new Parent(); // Creating an instance of Parent from reference of Child

        o1.A(); // Child's function
        o2.A(); // Parent's function
        o3.A(); // Child's function

        // Function is always called of the class which is being instantiated, referencing only helps in restriction
        // of those functions which are present in the child class but not present in parent and we are using the reference of Parent

        o3.C();
        o1.C();



//        child.B(); This is not desirable as B() is a private function in CLass parent
    }
}
