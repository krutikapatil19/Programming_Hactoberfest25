import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ArrayReverser - A simple Java program that takes an array from the user,
 * reverses it, and displays both the original and reversed arrays.
 * 
 * Contributed for Hacktoberfest 2025 by Aneesha Kam.
 */
public class ArrayReverser {

    /**
     * Reverses the elements of the given array in place.
     * 
     * @param arr the array to be reversed
     */
    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * Prints the array with a custom message.
     * 
     * @param message the label to print before the array
     * @param arr     the array to display
     */
    public static void printArray(String message, int[] arr) {
        System.out.println(message + " " + Arrays.toString(arr));
    }

    /**
     * The main method - entry point of the program.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            if (size <= 0) {
                System.out.println("❌ Array size must be greater than 0.");
                return;
            }

            int[] array = new int[size];
            System.out.println("Enter " + size + " elements of the array:");

            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            // Display original and reversed arrays
            printArray("Original Array:", array);
            reverseArray(array);
            printArray("Reversed Array:", array);

        } catch (InputMismatchException e) {
            System.out.println("⚠️ Invalid input! Please enter only integers.");
        } finally {
            scanner.close();
        }
    }
}
