// 4. Write a Java program to find the index of a specific element in an integer array ?
import java.util.Scanner;

public class Solution_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of an array:");
        int size = scn.nextInt();

        int[] array = new int[size];

        System.out.println("Enter number of elements of an array:");
        for (int i = 0; i < size; i++) {
            array[i] = scn.nextInt();
        }

        System.out.println("Enter the number to find index:");
        int element = scn.nextInt();

        int index = findIndex(array, element);

        if (index != -1) {
            System.out.println("The index of the number is: " + index);
        } else {
            System.out.println("SORRY! This number is not present in the array.");
        }
    }

    public static int findIndex(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}