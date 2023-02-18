package question4;

public class Main {
	public int solution(int[] array, int K) {
		int answer = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				for (int k = j + 1; k < array.length; k++) {
					if (0 == ((i + j + k) % K)) answer++;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main sol = new Main();
        int[] arr = {1, 2, 3, 4, 5};
        int K = 3;
        int ret = sol.solution(arr, K);


        System.out.println("solution 메소드의 반환 값은 " + ret + "입니다.");

	}

}
