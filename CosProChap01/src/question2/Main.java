package question2;

public class Main {
	private static String func_a(String str, int length) {
		String fillZero = "";
		int fillSize = str.length();
		for (int i = 0; i < fillSize; i++) {
			fillZero += "0";
		}
		return fillZero + str;
	}

	private static int solution(String binaryA, String binaryB) {
		int maxLength = Math.max(binaryA.length(), binaryB.length());
		if (maxLength > binaryA.length()) {
			binaryA = func_a(binaryB, maxLength);
		} else if (maxLength > binaryB.length()) {
			binaryB = func_a(binaryA, maxLength);
		}
		
		int hammingDistance = 0;
		for (int i = 0; i < maxLength; i++) {
			if (binaryA.charAt(i) != binaryB.charAt(i)) {
				hammingDistance++;
			}
		}
		return hammingDistance;
	}
	public static void main(String[] args) {
		String binaryA = "10010";
		String binaryB = "110";
		
		int result = solution(binaryA, binaryB);
		
		System.out.println("두 문자열의 해밍 거리는 " + result + "입니다.");
	}

}
