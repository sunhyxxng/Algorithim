package question5;

public class Main {
	public int solution(int[] array) {
		int answer = 0;
		int tempLength = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[i - 1]) {
				tempLength++;
			} else {
				answer = Math.max(answer, tempLength);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main sol = new Main();
        int[] arr = {3, 1, 2, 4, 5, 1, 2, 2, 3, 4};
        int ret = sol.solution(arr);

        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}

}
