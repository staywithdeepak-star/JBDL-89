package secondary;

public class Main {

    /**
     * final key can be used at 3 places
     * 1. variables - variables which cannot be resigned are known as final variables.
                      Final variables can be assigned only at 2 places,
                      1. During declaration
                      2. Inside the constructor
     * 2. functions - final functions are those which cannot be overridden in the child classes
     * 3. classes - final classes are those which have all the functions as final (by default)
     */

    final int a = 10;
    int b = 20;

//    final String str;

    static final int c = 40;

    Main(){
//        this.a = 20;
        this.b = 30;
//        this.str = "Hello";

    }

    public static void main(String[] args) {
        Main m = new Main();
//        m.a = 30;
        m.b = 50;
//        m.str = "Hello";

    }
}
