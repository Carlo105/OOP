import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private double num1, num2;

    public Calculator(){
    }

    public Calculator(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public setNum1 (double num1){
        this.num1 =  num1;
    }

    public setNum2(double num2){
        this.num2 = num2;
    }

    public double getNum1(){
        return num1;
    }

    public double getNum2(){
        return num2;
    }

    public add(double num1, double num2) {
        System.out.println("The result of the addition is: " + (num1 + num2));
    }

    public subtract(double num1, double num2) {
        System.out.println("The result of the subtraction is: " + (num1 - num2));
    }

    public multiply(double num1, double num2) {
        System.out.println("The result of the multiplication is: " + (num1 * num2));
    }

    public divide(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        System.out.println("The result of the division is: " + (num1 / num2));
    }
}