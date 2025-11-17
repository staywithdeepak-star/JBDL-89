package abstraction;

import java.util.concurrent.Callable;

public interface Calculator extends MyRun, MyRun2{

    int add(int a, int b);
    int subtract(int a, int b);
    int multiply(int a, int b);
    int divide(int a, int b);

    default int power(int a, int b){
        Double ans = Math.pow(a,b);
        return ans.intValue();
    }

    @Override
    default void test() {   // default function is completely separate of the default scope. Do not mix it
//        MyRun.super.test();
        MyRun2.super.test();
    }
}
