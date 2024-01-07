// 3. Write a Java program to calculate the sum of all elements in an integer array ?
import java.util.Scanner;

public class Solution_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter number of elements : ");
        int n = input.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = input.nextInt();
            sum += arr[i];

            System.out.println("The sum of all entered elements is " + sum);
        }
        System.out.println();
    }
}
