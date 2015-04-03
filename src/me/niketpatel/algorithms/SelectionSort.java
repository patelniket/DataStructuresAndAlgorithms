package me.niketpatel.algorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] data = {7,3,6,8,2};
		sort(data);
		System.out.println(Arrays.toString(data));

	}
	
	public static void sort(int[] data) {
		for (int i = 0; i < data.length-1; i++) {
			int minIndex = 0;
			for (int j = i+1; j < data.length; j++) {
				if (data[j] < data[minIndex]) {
					minIndex = j;
				}
			}
			int tmp = data[minIndex];
			data[minIndex] = data[i];
			data[i] = tmp;
		}
	}

}
