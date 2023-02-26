package question3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public int[] bishopPosition(String bishop) {
		String[] splitXY = bishop.split("");
		int x = 8 - Integer.parseInt(splitXY[1]);
		int y = 0;
		switch (splitXY[0]) {
		case "A":
			y = 0;
			break;
		case "B":
			y = 1;
			break;
		case "C":
			y = 2;
			break;
		case "D":
			y = 3;
			break;
		case "E":
			y = 4;
			break;
		case "F":
			y = 5;
			break;
		case "G":
			y = 6;
			break;
		case "H":
			y = 7;
			break;
		}
		int[] position = {x, y};
		return position;
	}

	public int runAwayFromBishops(String[] bishops) {
		int[][] chessBoard = new int[8][8];
		for (String bishop : bishops) {
			int[] position = bishopPosition(bishop);
			System.out.println(bishop+ "의 위치는 " + position[0] + ", " + position[1]);
			int x = position[0];
			int y = position[1];
			chessBoard[x][y] = 1;
			
			int dir = 0;
			int tmpX = x;
			int tmpY = y;
			while (dir < 4) {
				x = tmpX; y = tmpY;
				while (0 == dir && x > 0 && y > 0) chessBoard[--x][--y] = 1;
				while (1 == dir && x > 0 && y < 7) chessBoard[--x][++y] = 1;
				while (2 == dir && x < 7 && y > 0) chessBoard[++x][--y] = 1;
				while (3 == dir && x < 7 && y < 7) chessBoard[++x][++y] = 1;
				dir++;
			}
		}

		int count = chessBoard.length * chessBoard[0].length;
		for (int i = 0; i < chessBoard.length; i++) {
			for (int j = 0; j < chessBoard[i].length; j++) {
				if (1 == chessBoard[i][j]) {
					count--;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		Main sol = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		ArrayList<String> bishopList = new ArrayList<String>();
		while (st.hasMoreTokens()) {
			bishopList.add(st.nextToken());
		}	
		
		String[] bishops = bishopList.toArray(new String[bishopList.size()]);
		
		System.out.println(sol.runAwayFromBishops(bishops));
	}

}
