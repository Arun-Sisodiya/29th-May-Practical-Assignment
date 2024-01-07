// 5. Write a Java program to print an entire array ?
import java.util.Scanner;

public class Solution_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of an array:");
        int n = scn.nextInt();

        System.out.println("Enter the elements of the array:");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }

        System.out.println("The elements of your array are:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}