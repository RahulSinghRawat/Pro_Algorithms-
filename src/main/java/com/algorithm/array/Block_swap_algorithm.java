package com.algorithm.array;

// Array rotation algorithm   time complexity O(n)
public class Block_swap_algorithm {
	public static void main(String[] args) {
       int arr[] = {1,2,3,4,5};
       for (int i : arr) {
		System.out.print(i+" ");
	}
       System.out.println();
       leftRotate(arr, 2, arr.length);
       System.out.println("Post rotation :");
       for (int i : arr) {
   		System.out.print(i+" ");
   	}
	}

	public static void swap(int arr[], int fi, int si, int d) {
		int i, temp;
		for (i = 0; i < d; i++) {
			temp = arr[fi + i];
			arr[fi + i] = arr[si + i];
			arr[si + i] = temp;
		}
	}

	// Java code for above implementation
	static void leftRotate(int arr[], int d, int n) {
		int i, j;
		if (d == 0 || d == n)
			return;
		i = d;
		j = n - d;
		while (i != j) {
			if (i < j) /* A is shorter */
			{
				swap(arr, d - i, d + j - i, i);
				j -= i;
			} else /* B is shorter */
			{
				swap(arr, d - i, d, j);
				i -= j;
			}
			// printArray(arr, 7);
		}
		/* Finally, block swap A and B */
		swap(arr, d - i, d, i);
	}

}
