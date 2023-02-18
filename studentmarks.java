package com.subarray;

import java.util.Arrays;

public class StudentMArks {

	public static void main(String[] args) {
		String[] A = { "Naveen98", "Teju78", "Riya100", "NTR9", "NtRiya100","MSNK000" };
		String[] B = solve(A);
		System.out.println(Arrays.toString(B));
	}

	public static class Pair {
		String name;
		int num;

		public Pair(String name, int num) {
			this.name = name;
			this.num = num;
		}
	}

	public static void makePair(Pair[] arr, int idx, String str) {

		int indx = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				indx = i;
				break;
			}

		}

		String name = str.substring(0, indx);
		String num = str.substring(indx, str.length());

		int n = Integer.parseInt(num);
		arr[idx] = new Pair(name, n);
	}

	public static String[] solve(String[] A) {

		int n = A.length;
		Pair[] pairArr = new Pair[n];

		for (int i = 0; i < n; i++) {

			String str = A[i];

			makePair(pairArr, i, str);
		}

		String[] result = new String[n];
		boolean[] vis = new boolean[n];
		for (int i = 0; i < n; i++) {

			int max = 0;
			int maxIndex = 0;

			for (int j = 0; j < n; j++) {
				if (vis[j] == false && pairArr[j].num > max) {
					maxIndex = j;
					max = pairArr[j].num;
				}
			}
			result[i] = pairArr[maxIndex].name + pairArr[maxIndex].num;
			vis[maxIndex] = true;

		}
		return result;
	}
}
