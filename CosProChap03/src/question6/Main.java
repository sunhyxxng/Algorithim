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
		for (int i = 3; i <= n; i += 2) { // �Ҽ��� 3 �̻��� Ȧ�� �߿� ����
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (0 == i % j) { // i�� i���� ���� j�� ���������� �������� 0�̸� �Ҽ��� �ƴϹǷ� break! 
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primes.add(i);
			}
		}
		
		// primes�� ��� ���ҿ� ���� ���������� �հ踦 ���� n�� ��ġ�ϸ� answer++
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
		
		System.out.println(n + "�� ���� �ٸ� �� �Ҽ��� ������ ��Ÿ�� �� �ִ� ����� " + sol.getPrimeNumberWays(n) + "�Դϴ�.");

	}

}
