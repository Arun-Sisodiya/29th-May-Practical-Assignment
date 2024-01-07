// 2. Write a program to create an object of an class which contain a method and call that class method in main method.

import java.util.Scanner;

class method {

    public double div(double n1, double n2) {
        return (n1 / n2);
    }
}

public class Solution_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        method m = new method();

        System.out.println();

        System.out.print("Input dividend : ");
        double numerator = input.nextDouble();

        System.out.print("Input divisor : ");
        double denominator = input.nextDouble();

        double div = m.div(numerator, denominator);

        System.out.println("The Result is " + div);

        System.out.println();
    }
}
