package question7_1;

import java.util.Arrays;


// ������ �����ִ� ��ĺ��� �����ϰ� Ǯ�̰� ������ �� ���Ƽ� ¥ �� ����
public class Main {
	public int[] mergeArray(int[] array1, int[] array2) {
		int[] merged = new int[array1.length + array2.length];
		
		for (int i = 0; i < array1.length; i++) {
			merged[i] = array1[i];
		}
		
		for (int i = 0; i < array2.length; i++) {
			merged[array1.length + i] = array2[i];
		}
		
		java.util.Arrays.sort(merged);
		return merged;
	}

	public static void main(String[] args) {
		Main sol = new Main();
		int[] arrA = {-2, 3, 5, 9};
        int[] arrB = {0, 1, 5};
        int[] ret = sol.mergeArray(arrA, arrB);
        
        System.out.println("mergeArray �޼ҵ��� ��ȯ ���� " + Arrays.toString(ret) + " �Դϴ�.");

	}

}
