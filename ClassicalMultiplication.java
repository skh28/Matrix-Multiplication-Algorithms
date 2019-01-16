//Scott Ha
//CS 3310

package Classic;
import java.util.Random;
import java.util.Scanner;

public class ClassicalMultiplication {
		
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the base of squared matrices:");
		int n = input.nextInt(); //size of matrices nxn
		int[][] firstMatrix = new int[n][n];
		int[][] secondMatrix = new int[n][n];
		int[][] finalMatrix = new int[n][n];
		Random r = new Random(); //random data input generator
		int Low = 1;
		int High = 10;
		System.out.println("Generating first Matrix..");
		for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
		firstMatrix[i][j] = r.nextInt(High-Low) + Low; //random nxn matrix generation
		}
		}
		System.out.println("Generating second Matrix..");
		for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
		secondMatrix[i][j] = r.nextInt(High-Low) + Low; //random nxn matrix generation
		}
		}
		
		System.out.println("***Multiplying the matrices***");
		long start = System.nanoTime();
		for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
		for (int k = 0; k < n; k++) {
		finalMatrix[i][j] = finalMatrix[i][j] + firstMatrix[i][k] * secondMatrix[k][j]; //matrix multiplication (Rows * Column)
		}
		}
		}
		long end = System.nanoTime();
		//Print function (rows by columns)
		System.out.println("Final Matrix is:");
		for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
		System.out.print(finalMatrix[i][j] + " ");
		}
		System.out.println();
		}
		System.out.printf("%s%d\n", "Time is: ", end-start, "nanoseconds");
		input.close();
		}
}
