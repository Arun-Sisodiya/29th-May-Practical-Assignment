// 1. Write a program to demonstrate method overloading with 3 different parameters.

class overLoading {
    public int sum(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

    public float sub(float n1, float n2) {
        float sum = n1 - n2;
        return sum;
    }

    public double sum(double n1, double n2, double n3) {
        double sum = n1 + n2 + n3;
        return sum;
    }
}

public class Solution_1 {

    public static void main(String[] args) {
        overLoading obj = new overLoading();

        System.out.println("\n");

        int sum = obj.sum(70, 6);
        System.out.println("The sum of two integers: " + sum);

        float sub = obj.sub((float) 7.9, (float) 6.5);
        System.out.println("The difference between the floats is : " + sub);

        double sum2 = obj.sum(66.6, 78.5, 88.5);
        System.out.println("Sum of three numbers :" + sum2);

        System.out.println("\n");
    }
}