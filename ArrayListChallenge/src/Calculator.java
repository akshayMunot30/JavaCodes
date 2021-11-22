import java.util.Scanner;

public class Calculator {

    private double num1;
    private double num2;

    public Calculator() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public void Add(double num1, double num2) {
        System.out.print("The result is: " + (num1 + num2));
    }

    public void Sub(double num1, double num2) {
        System.out.print("The result is: " + (num1 - num2));
    }

    public void Multiply(double num1, double num2) {
        System.out.print("The result is: " + (num1 * num2));
    }

    public void Divide(double num1, double num2) {
        System.out.print("The result is: " + (num1 / num2));
    }

    public void Rem(double num1, double num2) {
        System.out.print("The result is: " + (num1 % num2));
    }
}



