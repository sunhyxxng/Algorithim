package question8;

import java.util.Arrays;

public class Main {
	public int[] getNewArray(int[] originArray) {
		int left = 0;
		int right = originArray.length - 1;
		int index = 0;
		int[] newArray = new int[originArray.length];
		
		while (left <= right) {
			if (0 == index % 2) {
				newArray[index] = originArray[left];
				left += 1;
			} else {
				newArray[index] = originArray[right];
				right -= 1;
			}
			index++;
		}
		
		return newArray;
	}
	
	public static void main(String[] args) {
		Main sol = new Main();
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] ret = sol.getNewArray(arr);

        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
	}

}
