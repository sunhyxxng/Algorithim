package question8;

import java.util.*;

class Main {
	// 한 줄 변경
	public int[] solution(int N, int[] votes) {
		int voteCounter[] = new int[11];
		for (int i = 0; i < votes.length; i++) {
			voteCounter[votes[i]] += 1;
		}
		int maxVal = 0;
		int cnt = 0;
		for (int i = 1; i <= N; i++) {
			if (maxVal < voteCounter[i]) {
				maxVal = voteCounter[i];
				cnt = 1;
			} else if (maxVal == voteCounter[i]) {
				cnt += 1;
			}
		}
		int answer[] = new int[cnt];
		for (int i = 1, idx = 0; i <= N; i++) {
			if (voteCounter[i] == maxVal) {
				answer[idx] = i; //  voteCounter[i] => i 
				idx += 1;
			}
		}
		Arrays.sort(answer);
		return answer;
	}

	public static void main(String[] args) {
		Main sol = new Main();
		int N1 = 5;
		int[] votes1 = { 1, 5, 4, 3, 2, 5, 2, 5, 5, 4 };
		int[] ret1 = sol.solution(N1, votes1);

		System.out.println("solution 함수의 반환 값은 " + Arrays.toString(ret1) + " 입니다.");

		int N2 = 4;
		int[] votes2 = { 1, 3, 2, 3, 2 };
		int[] ret2 = sol.solution(N2, votes2);

		System.out.println("solution 함수의 반환 값은 " + Arrays.toString(ret2) + " 입니다.");
	}
}