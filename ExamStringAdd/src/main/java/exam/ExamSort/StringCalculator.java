package exam.ExamSort;

public class StringCalculator {
	public static int add(final String numbers) {
		int returnValue = 0;
		String[] numbersArray = numbers.split(",|\n");
		for (String number : numbersArray) {
			if (!number.trim().isEmpty()) {
				int curInt = Integer.parseInt(number.trim());
				if (curInt >= 1000) {
					continue;
				}
				if (curInt < 0) {
					throw new IllegalArgumentException("Negative Numbers are not allowed.");
				}
				returnValue += curInt;
			}
		}
		return returnValue;
	}
}
