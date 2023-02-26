package question2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public boolean isExist(ArrayList<String> palindromesList, String s) {
		for (String palindromeItem : palindromesList) {
			if (s.equals(palindromeItem)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isPart(String s) {
		int length = s.length();
		for (int i = 0; i < length / 2; i++) {
			if (s.charAt(i) != s.charAt(length - i - 1)) 
				return false;
		}
		return true;
	}
	
	public String findKth(ArrayList<String> palindromes, int k) {
		Collections.sort(palindromes);
		if (palindromes.size() < k) {
			return "NULL";
		} else {
			return palindromes.get(k-1);
		}
	}
	
	public String kthPalindromes(String s, int k) {
		ArrayList<String> palindromes = new ArrayList<String>();
		int length = s.length();
		for (int startIndex = 0; startIndex < length; startIndex++) {
			for (int count = 1; count < length - startIndex + 1; count++) {
				String subString = s.substring(startIndex, startIndex + count);
				if (isPart(subString)) {
					if (false == isExist(palindromes, subString)) {
						palindromes.add(subString);
					}
				}
			}
		}
		String answer = findKth(palindromes, k);
		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main sol = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string = br.readLine();
		int k = Integer.parseInt(br.readLine());
		
		System.out.println(string + "의  " + k +"번 째 palindrome은 " + sol.kthPalindromes(string, k) + "입니다.");

	}

}
