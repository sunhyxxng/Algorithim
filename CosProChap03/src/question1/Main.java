package question1;

import java.util.Arrays;

public class Main {
	int[] doubleArray(int[] array) {
		int length = array.length;
		int[] newArray = new int[length * 2];
		for (int i = 0; i < length; i++) {
			newArray[i] = array[i];
			newArray[i + length] = array[i];
		}

		return newArray;
	}

	boolean isSameItem(int[] first, int[] second) {
		int[] counter = new int[1001];
		for (int i = 0; i < first.length; i++) {
			counter[first[i]]++;
			counter[second[i]]--;
		}

		for (int i = 0; i < counter.length; i++) {
			if (0 != counter[i]) {
				return false;
			}
		}

		return true;
	}

	boolean isInclude(int[] first, int[] second) {
		int length = second.length;
		for (int i = 0; i < length; i++) {
			int j;
			for (j = 0; j < length; j++) {
				if (first[i + j] != second[j])
					break;
			}

			if (j == length) {
				return true;
			}
		}
		return false;
	}

	public boolean isRotateArray(int[] arrayA, int[] arrayB) {
		if (arrayA.length != arrayB.length) {
			return false;
		}

		if (isSameItem(arrayA, arrayB)) {
			int[] doubleArray = doubleArray(arrayA);
			if (isInclude(doubleArray, arrayB)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Main sol = new Main();
		int[] arrA1 = { 1, 2, 3, 4 };
		int[] arrB1 = { 3, 4, 1, 2 };
		boolean ret1 = sol.isRotateArray(arrA1, arrB1);

		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int[] arrA2 = { 1, 2, 3, 4 };
		int[] arrB2 = { 1, 4, 2, 3 };
		boolean ret2 = sol.isRotateArray(arrA2, arrB2);
		
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

	}

}
