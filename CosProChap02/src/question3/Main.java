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
        int digit = (int) (Math.log10(number) + 1); // 문제와 다른 방법
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
            nextPage++; // 1. 게시글 번호를 1 증가시키고
            int length = getDigit(nextPage); // 자릿수를 구합니다.
            if (length % 2 != 0) continue; // 2. 만약 자릿수가 짝수가 아니라면 1로 돌아갑니다.

			// 3. 만약 구한 자릿수가 짝수라면 다음을 수행합니다.
			int divisor = getDivisor(length / 2);
			// 3-1. 앞 자릿수 절번과 뒷 자릿수 절반을 분리합니다.
			int front = nextPage / divisor;
			int back = nextPage % divisor;

			// 3-2. 앞 자릿수 절반의 자릿수 합과 뒷 자릿수 절반의 자릿수 합을 구합니다.
			int frontSum = getDigitSum(front);
			int backSum = getDigitSum(back);

			// 3-3. 위에서 구한 합이 서로 같으면 4로 가고, 같지 않으면 1로 돌아갑니다.
			if (frontSum == backSum) {
				break;
			}
			
        }
        return nextPage - lastPage; // 3에서 구한 페이지 - 처음 매개변수로 주어진 페이지
    }

    public static void main(String[] args) {
    	Main sol = new Main();
        int num1 = 1;
        int ret1 = sol.pageCountToWinner(num1);

        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int num2 = 235386;
        int ret2 = sol.pageCountToWinner(num2);

        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }

}
