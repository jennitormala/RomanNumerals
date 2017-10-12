
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		int result = calculate(romanNum);
		return result;
	}

	private int getInteger(char romanNum) {
		switch (romanNum) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}

	private int calculate(String romanNum) {

		if (romanNum.length() == 1) {
			return getInteger(romanNum.charAt(0));
		} else {
			if (!checkForRepetition(romanNum)) {
				return 0;
			}
			int number = 0;
			int preceedingNum = 0;
			for (int i = romanNum.length() - 1; i >= 0; i--) {
				int temp = getInteger(romanNum.charAt(i));
				if (temp < preceedingNum) {
					number -= temp;
				} else {
					number += temp;
					preceedingNum = temp;
				}
			}
			return number;
		}
	}

	private int checkForDuplicates(String num, String romanNums) {

		char[] romanChars = romanNums.toCharArray();
		int duplicateCount = 0;

		for (int i = 0; i < romanNums.length(); i++) {
			if (num.charAt(0) == romanChars[i]) {
				duplicateCount += 1;
			}

		}
		return duplicateCount;
	}

	private boolean checkForRepetition(String romanNum) {

		if (romanNum.indexOf("IIII") > -1 || romanNum.indexOf("XXXX") > -1 
		|| romanNum.indexOf("CCCC") > -1 || romanNum.indexOf("MMMM") > -1) {
			return false;
		} else if (checkForDuplicates("V", romanNum) > 1) {
			return false;
		} else if (checkForDuplicates("L", romanNum) > 1) {
			return false;
		} else if (checkForDuplicates("D", romanNum) > 1) {
			return false;
		}

		return true;
	}

}
