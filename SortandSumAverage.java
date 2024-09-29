import java.util.Arrays;
import java.util.Scanner;

public class SortandSumAverage {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the size of the array
	        System.out.print("Nhap n: ");
	        int n = scanner.nextInt();
	        double[] array = new double[n];

	        // Input array elements
	        System.out.println("Nhap " + n + " so:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextDouble();
	        }

	        // Sort the array
	        Arrays.sort(array);

	        // Calculate sum and average
	        double sum = 0;
	        for (double num : array) {
	            sum += num;
	        }
	        double average = sum / n;

	        // Display the sorted array, sum, and average
	        System.out.println("Day da sap xep: " + Arrays.toString(array));
	        System.out.printf("Tong: %.2f%n", sum);
	        System.out.printf("Trung binh: %.2f%n", average);

	        scanner.close();
	    }
}
