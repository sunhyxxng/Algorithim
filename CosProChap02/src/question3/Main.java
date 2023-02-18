package question3;

public class Main {
    public int getDivisor(int number) {
		int result = 1;
		while (number > 0) {
			result *= 10;
			number--;
		}
        return result;
    }

    public int getDigit(int number) {
        int digit = (int) (Math.log10(number) + 1); // ������ �ٸ� ���
        /**
         *  int digit = 0;
         *  while (number > 0) {
         *  	digit++;
         *  	number /= 10;
         *  }
         */
        return digit;
    }

	public int getDigitSum(int number) {
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}
	
    public int pageCountToWinner(int lastPage) {
        int nextPage = lastPage;

        while (true) {
            nextPage++; // 1. �Խñ� ��ȣ�� 1 ������Ű��
            int length = getDigit(nextPage); // �ڸ����� ���մϴ�.
            if (length % 2 != 0) continue; // 2. ���� �ڸ����� ¦���� �ƴ϶�� 1�� ���ư��ϴ�.

			// 3. ���� ���� �ڸ����� ¦����� ������ �����մϴ�.
			int divisor = getDivisor(length / 2);
			// 3-1. �� �ڸ��� ������ �� �ڸ��� ������ �и��մϴ�.
			int front = nextPage / divisor;
			int back = nextPage % divisor;

			// 3-2. �� �ڸ��� ������ �ڸ��� �հ� �� �ڸ��� ������ �ڸ��� ���� ���մϴ�.
			int frontSum = getDigitSum(front);
			int backSum = getDigitSum(back);

			// 3-3. ������ ���� ���� ���� ������ 4�� ����, ���� ������ 1�� ���ư��ϴ�.
			if (frontSum == backSum) {
				break;
			}
			
        }
        return nextPage - lastPage; // 3���� ���� ������ - ó�� �Ű������� �־��� ������
    }

    public static void main(String[] args) {
    	Main sol = new Main();
        int num1 = 1;
        int ret1 = sol.pageCountToWinner(num1);

        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");

        int num2 = 235386;
        int ret2 = sol.pageCountToWinner(num2);

        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
    }

}
