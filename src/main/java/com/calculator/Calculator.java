package com.calculator;

public class Calculator {
    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int sub(int num1, int num2){
        return num1 - num2;
    }

    public int mul(int num1, int num2){
        return num1 * num2;
    }

    public int div(int num1, int num2){
        return num1 / num2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 4));
    }
}
