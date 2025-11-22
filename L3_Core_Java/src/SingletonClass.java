public class SingletonClass {

    private int a;

    public int getA() {
        return a;
    }

    private SingletonClass(){
        System.out.println("Inside SingletonClass constructor...");
        this.a = 10;
    }

    private static SingletonClass instance; // class level / static variable

    public static SingletonClass getInstance(){
        if(instance == null){
            System.out.println("Creating an instance of SingletonClass...");
            instance = new SingletonClass(); // how many times I will come to this line ?
        }

        return instance;
    }

    /**
     * A class is known as singleton if there can be only 1 object allowed for that class
     * @param args
     */

}
