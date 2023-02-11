package question5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Main sol = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int number = Integer.parseInt(br.readLine());
			int result = solution(makeMatirx(number));
			System.out.println("입력 받은 " + number + "의 소용돌이 수 대각선 수의 합은 " + result);
		} catch (NumberFormatException | IOException e) {
			System.out.println("숫자 형식이 아니거나 입력하지 않았습니다.");
			e.printStackTrace();
		}
	}
	
	public static int[][] makeMatirx(int number) {
		int[][] matrix = new int[number][number];
		int endNumber = number * number;
		int startNumber = 1;
		int i = 0; 
		int j = 0;
		int direction = 0; // 0 : -> / 1 : 아래  , 2 : <- , 3 : 위 
		while (startNumber <= endNumber) {
			matrix[i][j] = startNumber;
			if (0 == direction 
					&& (j == number - 1 || (j < number - 1 && matrix[i][j+1] != 0))) {
				direction = 1;
			} else if (1 == direction 
					&& (i == number -1 || (i < number - 1 && matrix[i+1][j] != 0))) {
				direction = 2;
			} else if (2 == direction 
					&& (j == 0 || (j > 0 && matrix[i][j-1] != 0))) {
				direction = 3;
			} else if (3 == direction 
					&& (i == 0 || (i > 0 && matrix[i-1][j] != 0))) {
				direction = 0;
			}
			switch (direction) {
			case 0:
				j++; break;
			case 1:
				i++; break;
			case 2: 
				j--; break;
			case 3: 
				i--; break;
			default:
				break;
			}
			startNumber++;
		}
		
		System.out.println(Arrays.deepToString(matrix));
		return matrix;
	}
	
	public static int solution(int[][] matrix) {
		int total = 0;
		for (int i = 0; i < matrix.length; i++) {
			total += matrix[i][i];
		}
		return total;
	}

}
