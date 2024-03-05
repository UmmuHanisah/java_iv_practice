package java_iv_practice;

// Write a function to reverse the following string
public class ReversingString {
	public static void main(String args[]) {

		String originalString = "abcd";
		String reversedString = "";
		//char oriCharAt;

		for (int i = 0; i < originalString.length(); i++) {
			reversedString = originalString.charAt(i) + reversedString;

			/* For debugging
			 * =============
			 * oriCharAt = originalString.charAt(i); System.out.println("Test inner " +
			 * oriCharAt); System.out.println("Test inner " + reversedString);
			 */
		}

		System.out.println(reversedString);
	}
}
