package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double a, double b) throws IllegalArgumentException {
		if (b == 0.0) {
			throw new IllegalArgumentException();
		}
		double quotient = a / b;
		return quotient;
	}

	public String reverseString(String a) throws IllegalStateException {
		if (a.equals("")) {
			throw new IllegalStateException();
		}
		char[] reversed = new char[a.length()];
		for (int i = 0; i < reversed.length; i++) {
			reversed[i] = a.charAt(a.length() - i - 1);
		}
		String b="";
		for (int i = 0; i < reversed.length; i++) {
			b=b+reversed[i];
		}
		return b;
	}
}