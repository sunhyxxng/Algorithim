package question3;

public class Main {
	class Pair {
		public int firstNumber;
		public int secondNumber;
	}
	
	public int calculate(int numberA, int numberB, char expression) {
		int result = 0;;
		switch (expression) {
		case '+' :
			result = numberA + numberB;
			break;
		case '-' :
			result = numberA - numberB;
			break;
		case '*' :
			result = numberA * numberB;
			break;
		}
		return result;
	}

	public int findExpressionIndex(String str) {
		for (int i = 0; i < str.length(); i++) {
			char e = str.charAt(i);
			if ('+' == e || '-' == e || '*' == e) 
				return i;
		}
		return -1;
	}
	
	public Pair changeToPair(String str, int index) {
		Pair pair = new Pair();
		pair.firstNumber = Integer.parseInt(str.substring(0, index));
		pair.secondNumber = Integer.parseInt(str.substring(index + 1));
		return pair;
	}
	
	public int solution(String expression) {
		int expressionIndex = findExpressionIndex(expression);
		Pair numbers = changeToPair(expression, expressionIndex);
		int result = calculate(numbers.firstNumber, numbers.secondNumber, expression.charAt(expressionIndex));
		
		return result;
	}
	
	public static void main(String[] args) {
		Main sol = new Main();
		String expression = "123+12";
		int result = sol.solution(expression);
		System.out.println("해당 문자열의 계산기 값은 " + result);
	}

}
