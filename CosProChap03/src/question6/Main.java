package question6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public int getPrimeNumberWays(int n) {
		int answer = 0;
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		for (int i = 3; i <= n; i += 2) { // 소수는 3 이상의 홀수 중에 있음
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (0 == i % j) { // i를 i보다 작은 j로 나누었을때 나머지가 0이면 소수가 아니므로 break! 
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primes.add(i);
			}
		}
		
		// primes의 모든 원소에 대해 순차적으로 합계를 구해 n과 일치하면 answer++
		int primeLength = primes.size();
		for (int i = 0; i < primeLength - 2; i++) {
			for (int j = i + 1; j < primeLength - 1; j++) {
				for (int k = j + 1; k < primeLength; k++) {
					if (n == primes.get(i) + primes.get(j) + primes.get(k)) {
						answer++;
					}
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Main sol = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(n + "을 서로 다른 세 소수의 합으로 나타낼 수 있는 방법은 " + sol.getPrimeNumberWays(n) + "입니다.");

	}

}
