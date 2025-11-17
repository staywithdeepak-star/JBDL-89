package abstraction;

public class EnglishCalculator extends Thread implements Calculator{

    public static void main(String[] args) {
        EnglishCalculator englishCalculator = new EnglishCalculator();
        englishCalculator.add(40, 60);
    }

    public void calculateMileage(){
        System.out.println("Calculating mileage inside calculator");
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return Math.abs(a - b);
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        if(b == 0){
            return -1;
        }
        return a / b;
    }

//    @Override
//    public int power(int a, int b) {
//        Double ans = Math.pow(a,b) + 1.0;
//        return ans.intValue();
//    }

    @Override
    public void run() {

    }
}
