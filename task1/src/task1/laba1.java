package task1;

import java.util.Scanner;

public class laba1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x:");

        double x = sc.nextDouble();
        System.out.println("Enter y:");
        double y = sc.nextDouble();
        Calculation calculator = new Calculation(x, y);
        double result = calculator.calculate();
        System.out.print("Your result is ");
        System.out.format("%f%n", result);
    }
}