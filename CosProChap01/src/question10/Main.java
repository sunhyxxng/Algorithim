package question10;

public class Main {

	public int maxProfit(int[] stockPrices) {
		int inf = 1000000001;
		int tmp = inf;
		int answer = -inf;
		for (int price : stockPrices) {
			if (tmp != inf) {
				answer = Math.max(answer, price - tmp);
			}
			tmp = Math.min(tmp, price);
		}
		return answer;
	}
	public static void main(String[] args) {
		Main sol = new Main();
        int[] prices1 = {1, 2, 3};
        int ret1 = sol.maxProfit(prices1);
        
        System.out.println("prices1�� �ִ� ������ " + ret1 + " �Դϴ�.");

        int[] prices2 = {3, 1};
        int ret2 = sol.maxProfit(prices2);
        
        System.out.println("prices2�� �ִ� ������ " + ret2 + " �Դϴ�.");
	}
}
