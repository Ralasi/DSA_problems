package Sorting;

//Java program to merge k sorted arrays of size n each.

import java.io.*;
import java.util.*;

class PROG3
{

	// This function takes an array of arrays as an argument
	// and
	// All arrays are assumed to be sorted. It merges them
	// together and prints the final sorted output.
	public static void mergeKArrays(int[][] arr, int a,int[] output)
						
	{
		int c = 0;

		// traverse the matrix
		for (int i = 0; i < a; i++) {
//			for (int j = 0; j < 4; j++)
//				output = arr[i][j];
		}

		// sort the array
		Arrays.sort(output);
	}

	// A utility function to print array elements
	public static void printArray(int[] arr, int size)
	{
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
	}

	// Driver program to test above functions
	public static void main(String[] args)
	{
		int[][] arr = { { 2, 6, 12, 34 },
						{ 1, 9, 20, 1000 },
						{ 23, 34, 90, 2000 } };
		int k = 4;
		int n = 3;
		int[] output = new int[n * k];

		mergeKArrays(arr, n, output);

		System.out.println("Merged array is ");
		printArray(output, n * k);
	}
}
