package DesignPatterns.FactoryPattern;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        double num1=sc.nextDouble();
        System.out.println("enter second number:");
        double num2=sc.nextDouble();

        CalculateFactory factory = new CalculateFactory();
        Calculate obj1 =factory.getCalculation("divide");
        Calculate obj2 =factory.getCalculation("add");
        Calculate obj3 =factory.getCalculation("substract");

        //Divide obj = new Divide(); vechea metoda de creare.
        obj1.calculate(num1,num2);
        obj2.calculate(num1,num2);
        obj3.calculate(num1,num2);
    }
}
