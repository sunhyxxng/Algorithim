package question9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static boolean isSafe(String password) {
		boolean result = true;
		
		int length = password.length();
		for (int i = 0; i < length - 2; ++i) {
			int firstCheck = password.charAt(i + 1) - password.charAt(i);
			int secondCheck = password.charAt(i + 2) - password.charAt(i + 1);
			if (firstCheck == secondCheck && (1 == firstCheck || -1 == firstCheck))
				result = false;
		}
		
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String password = br.readLine();
		String result = isSafe(password) ? "safe" : "not safe";
		
		System.out.println(password + "는  " + result + "입니다.");

	}

}
