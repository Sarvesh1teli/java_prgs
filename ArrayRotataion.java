package com.imp.prg;

import java.util.Arrays;

public class ArrayRotataion {
	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int k = 2;
		System.out.println("Rotate given array " + Arrays.toString(input) + " by 2 places to the left.");
		int arr1[] = rotateLeft(input, input.length, k);
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		int[] input1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("\nRotate given array " + Arrays.toString(input1) + " by 2 places to the right.");
		int arr2[] = rotateRight(input1, input1.length, k);

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

	private static int[] rotateLeft(int[] input, int length, int numOfRotations) {
		for (int i = 0; i < numOfRotations; i++) {

			// take out the first element
			int temp = input[0];
			for (int j = 0; j < length - 1; j++) {
				// shift array elements towards left by 1 place
				input[j] = input[j + 1];
			}
			input[length - 1] = temp;
		}
		return input;
	}

	private static int[] rotateRight(int[] input, int length, int numOfRotations) {
		for (int i = 0; i < numOfRotations; i++) {
			// take out the last element
			int temp = input[length - 1];
			for (int j = length - 1; j > 0; j--) { // shift array elements towards right by one place
				input[j] = input[j - 1];
			}
			input[0] = temp;
		}
		return input;
	}

}

/*
Rotate given array [1, 2, 3, 4, 5, 6, 7, 8] by 2 places to the left.
3 4 5 6 7 8 1 2 
Rotate given array [1, 2, 3, 4, 5, 6, 7, 8] by 2 places to the right.
7 8 1 2 3 4 5 6 
*/
