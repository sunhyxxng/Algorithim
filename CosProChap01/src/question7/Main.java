package question7;

import java.util.Arrays;

public class Main {
	public int[] mergeArray(int[] arrA, int[] arrB) {
		int arrAIndex = 0, arrBIndex = 0;
		int arrALength = arrA.length;
		int arrBLength = arrB.length;
		int[] newArray = new int[arrALength + arrBLength];
		int index = 0;
		
		while (arrAIndex < arrALength && arrBIndex < arrBLength) {
			if (arrA[arrAIndex] < arrB[arrBIndex]) {
				newArray[index++] = arrA[arrAIndex++];
			} else {
				newArray[index++] = arrB[arrBIndex++];
			}
		}
		
		while (arrAIndex < arrALength) {
			newArray[index++] = arrA[arrAIndex++];
		}
		while (arrBIndex < arrBLength) {
			newArray[index++] = arrB[arrBIndex++];
		}
		return newArray;
	}

	public static void main(String[] args) {
		// 빈칸 채우기에 나와있는 함수 
		Main sol = new Main();
		int[] arrA = {-2, 3, 5, 9};
        int[] arrB = {0, 1, 5};
        int[] ret = sol.mergeArray(arrA, arrB);
        
        System.out.println("mergeArray 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");

	}

}
