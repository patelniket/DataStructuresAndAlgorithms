package me.niketpatel.algorithms;

import java.util.Arrays;

public class CountingSort {
	public void sort(Integer[] data) {
		int[] temp = new int[11];

		for (int i = 0; i < data.length; i++) { // populate the temp array
			temp[data[i]] = temp[data[i]] + 1;
		}

		int curr = 0;

		for (int i = 0; i < temp.length; i++) { // k iterations
			for (int j = 0; j < temp[i]; j++) { // n/k iterations for each (avg)
				data[curr] = i;
				curr++;
			}
		}
	}

	public static void main(String[] args) {
		CountingSort sorter = new CountingSort();
		Integer[] data = new Integer[] { 3, 10, 2, 4, 2, 6, 9, 5, 7, 2, 8, 10, 3, 9 };
		sorter.sort(data);
		System.out.println(Arrays.deepToString(data));
	}

}
