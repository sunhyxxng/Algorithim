package question7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int getChange(int money) {
		int[] coin = {10, 50, 100, 500, 1000, 5000, 10000, 50000};
		int count = 0;
		int idx = coin.length - 1;
		while (money > 0) {
			count += (money / coin[idx]);
			money %= coin[idx];
			idx--;
		}
		
		return count;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int money = Integer.parseInt(br.readLine());
		int minimunCount = getChange(money);
		
		System.out.println(money + "원을 거슬러 주는 동전과 지폐 개수합의 최소값은 " + minimunCount + "입니다.");

	}

}
