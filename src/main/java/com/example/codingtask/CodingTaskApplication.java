package com.example.codingtask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.InputMismatchException;
import java.util.Scanner;

@SpringBootApplication
public class CodingTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingTaskApplication.class, args);
	try {
		Scanner scanner = new Scanner(System.in);

		// Read X and Y
		print("X");
		int X = scanner.nextInt();
		print("Y");
		int Y = scanner.nextInt();

		// Create an array of size X and initialize it with zeros
		int[] list = new int[X];

		// Read and perform Y operations
		for (int y = 0; y < Y; y++) {
			print("i");
			int i = scanner.nextInt();
			print("j");
			int j = scanner.nextInt();
			print("k");
			int k = scanner.nextInt();

			// Update the array based on the operation
			for (int index = i - 1; index <= j - 1; index++) {
				list[index] += k;
			}

		}

		int max = getMax(list);

		// Print the maximum value
		System.out.println(max);

		scanner.close();
	}catch (InputMismatchException e){
		System.out.println("The value no supportable.");
	}
	}

	/**
	 * introduce x values.
	 * @param variable string
	 */
	private static void print(String variable) {
		System.out.println("Introduce value "+variable+": ");
	}

	/**
	 * Find the maximum value in the list.
	 * @param list contain values generated.
	 * @return max value.
	 */
	private static int getMax(int[] list) {
		int max = list[0];
		for (int value : list) {
			if (value > max) {
				max = value;
			}
		}
		return max;
	}


}
