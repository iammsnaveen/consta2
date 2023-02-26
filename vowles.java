package com.contest3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class vowelcount {

	public static void main(String[] args) {

		Integer[][] arr2D = { { 0, 3 }, { 2, 4 } };

		System.out.println(solve("sealar", arr2D));

		System.out.println("");

	}

	public static int[] solve(String A, Integer[][] Q) {
		int n = A.length();

		Character arr[] = { 'a', 'e', 'i', 'o', 'u' };

		Set<Character> vowels = new HashSet<>(Arrays.asList(arr));

		int[] vowels_count = new int[n];
		
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			if (vowels.contains(A.charAt(i))) {
				count++;

			}
			vowels_count[i] = count;
		}

		int[] ans = new int[2];

		for (int i = 0; i < Q.length; i++) {
			int startIndex = Q[i][0];

			int endIndex = Q[i][1];
			if (Q[i][0] == 0) {
				ans[i] = vowels_count[endIndex];

			} else {
				ans[i] = vowels_count[endIndex] - vowels_count[startIndex - 1];
			}
		}

		return ans;

	}
}
