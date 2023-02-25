package question10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static String reduceZero(String s) {
		s += "*";
		String newString = "";
		for (int i = 0; i < s.length(); ++i) {
			if ('0' == s.charAt(i) && '0' != s.charAt(i+1)) {
				newString += "0";
			} else if ('1' == s.charAt(i)) {
				newString += "1";
			}
		}
		
		return newString;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string = br.readLine();
		System.out.println(string +"의 변환값은 " + reduceZero(string));
	}

}
