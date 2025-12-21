package org.example.calci;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Calculator {
    public static void main(String[] args) {

    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return Math.abs(a - b);
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int pow(int a, int b) {
        return (int)Math.pow(a, b);
    }
}