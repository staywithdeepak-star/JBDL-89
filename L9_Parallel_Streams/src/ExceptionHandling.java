import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionHandling {

    public static void main(String[] args) throws FileNotFoundException {

//        Integer b = null;
//        b.intValue(); // null pointer exception

//        FileInputStream fis = null;
//        try {
//            System.out.println("Inside try block...");
//            // Compiler says that fileInputStream constructor can throw filenotfound exception, so you please handle it at your end
//            fis = new FileInputStream("/Users/piyush/Downloads/L9_Parallel_Streams/src/abc.txt");
////            fis.read();
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        } finally {
//            int a = 1 / 0;
//            System.out.println("Inside finally block");
//        }

        System.out.println("Inside main function, exiting ...");
        try {
            A();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void A() throws FileNotFoundException {
//        try {
            B();
//        }catch (Exception e) {
//            e.printStackTrace();
//            throw e;
//        }
    }

    public static void B() throws FileNotFoundException {
//        try {
            C();
//        }catch (Exception e) {
//            e.printStackTrace();
//            throw e;
//
//        }
    }

    public static void C() throws FileNotFoundException {
//        try {
            FileInputStream fis = new FileInputStream("abc.txt");
//        }catch (FileNotFoundException e) {
//            e.printStackTrace();
//            throw e;
//        }
    }
}
