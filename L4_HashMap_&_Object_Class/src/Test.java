public class Test {

    public static void main(String[] args) {
        System.out.println("Inside main...");
        A(10);
        System.out.println("Inside main after function call...");
    }

    public static void A(int num) {
        System.out.println("Inside A...");
        B(num * num);
        System.out.println("Inside A after function call...");
    }

    public static void B(int num) {
        System.out.println("Inside B...");
        C(num * num);
        System.out.println("Inside B after function call...");
    }
    public static void C(int num) {
        System.out.println("Inside C..." + " num  = " + num);
    }
}
