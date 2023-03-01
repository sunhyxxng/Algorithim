package question9;

public class Main {
	public int maxProfitSum(int[] revenue, int k) {
		int answer = 0;
		int n = revenue.length;
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += revenue[i];
		}
		answer = sum;

		for (int i = k; i < n; i++) {
			sum = sum - revenue[i - k] + revenue[i];
			if (answer < sum)
				answer = sum;
		}
		return sum;
	}

	public static void main(String[] args) {
		Main sol = new Main();
		int[] revenue1 = { 1, 1, 9, 3, 7, 6, 5, 10 };
		int k1 = 4;
		int ret1 = sol.maxProfitSum(revenue1, k1);

		System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");

		int[] revenue2 = { 1, 1, 5, 1, 1 };
		int k2 = 1;
		int ret2 = sol.maxProfitSum(revenue2, k2);
		System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
	}

}
