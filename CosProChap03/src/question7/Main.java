package question7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public int[] getKaprekarArray(int k) {
		int[] totalArray = new int[k];
		int count = 0;
		for (int i = 1; i <= k; i++) {
			long squareNumber = i * i;
			long divisor = 1;
			while (0 != squareNumber / divisor) {
				long frontNumber = squareNumber / divisor;
				long backNumber = squareNumber % divisor;
				divisor *= 10;
				if (0 != frontNumber && 0 != backNumber) {
					if (frontNumber + backNumber == i) {
						totalArray[count] = i;
						count++;
					}
				}
			}
		}
		
		int[] kaprekarArray = new int[count];
		for (int i = 0; i < count; i++) {
			kaprekarArray[i] = totalArray[i];
		}
		
		Arrays.sort(kaprekarArray);
		return kaprekarArray;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Main sol = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		System.out.println(k + "이하인 모든 카프리카 수는 " + Arrays.toString(sol.getKaprekarArray(k)));
	}

}
