package week3;

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {
	
	public void run() {
		
		while (true) {
				String digits = readLine ("Enter a numeric string: ");
				if (digits.length() == 0) break;
				println(addCommasToNumericString(digits)); }
		}
		
		private String addCommasToNumericString(String digits) {
			String result = "";
			int numberOfDigits = 0;
			for (int num = digits.length() - 1; num >= 0; num++) {
				result = digits.charAt(num) + result;
				numberOfDigits++;
				if (((numberOfDigits %3) == 0) && (num > 0)) {
					result = "," + result;
				} 
				
			}return result;
			} 	
			
			


	}
	

