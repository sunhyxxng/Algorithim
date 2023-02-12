package question6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		Main sol = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String currentPosition = br.readLine();
		int result = sol.possibleMoveCount(currentPosition);
		System.out.println(currentPosition + "이 이동가능한 위치의 수는 " + result);
	}

	public int possibleMoveCount(String currentPos) {
		int count = 0;
		/*
		 * 이동 가능한 좌표 
		 * (x-1,y+2), (x-2,y+1), (x-2,y-1), (x-1,y-2), 
		 * (x+1,y-2), (x+2,y-1), (x+2,y+1), (x+1,y+2)
		 */
		
		int x = currentPos.charAt(0) - 'A';
		int y = currentPos.charAt(1) - '1';
		
		int[][] moveArray = {{-1, 2}, {-2, 1}, {-2, -1}, {-1, -2} , {1, -2}, {2, -1}, {2, 1}, {1, 2}};
		
		for (int i = 0; i < moveArray.length; i++) {
			if (x + moveArray[i][0] > -1 && x + moveArray[i][0] < 8
					&& y + moveArray[i][1] > -1 && y + moveArray[i][1] < 8) {
				count++;
			}
		}
		return count;
	}
}
