package question4;

public class Main {
	public long solution(long number) {
		number++;
		String tmpNumber = String.valueOf(number);
		tmpNumber = tmpNumber.replaceAll("0", "1");
		long answer = Long.parseLong(tmpNumber);
		return answer;
	}

	public static void main(String[] args) {
		Main sol = new Main();
		long number = 9949999;
		long result = sol.solution(number);
		
		System.out.println("타임머신 로직 실행 후의 숫자는 " + result);
	}

}
