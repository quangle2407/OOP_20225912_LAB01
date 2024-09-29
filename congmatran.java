package ex6_conghaimatran;
import java.util.Scanner;
public class congmatran {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Nhap so hang: ");
	        int rows = scanner.nextInt();
	        System.out.print("Nhap so cot: ");
	        int columns = scanner.nextInt();

	     
	        int[][] matrixA = new int[rows][columns];
	        int[][] matrixB = new int[rows][columns];
	        int[][] sumMatrix = new int[rows][columns];

	  
	        System.out.println("Nhap ma tran 1:");
	        inputMatrix(matrixA, scanner);

	 
	        System.out.println("Nhap ma tran 2");
	        inputMatrix(matrixB, scanner);

	    
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
	            }
	        }

	
	        System.out.println("Tong 2 ma tran:");
	        displayMatrix(sumMatrix);

	        scanner.close();
	    }

	    private static void inputMatrix(int[][] matrix, Scanner scanner) {
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                System.out.print("Element [" + i + "][" + j + "]: ");
	                matrix[i][j] = scanner.nextInt();
	            }
	        }
	    }

	    private static void displayMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int value : row) {
	                System.out.print(value + " ");
	            }
	            System.out.println();
	        }
	    }

	}

