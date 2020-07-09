package unl.cse.recursion;

public class Palindrome {

	public static void main(String[] args) {

		String inputWord;

		if (args.length != 1) {

			System.out.println("Usage: isPalindrome word.");
			System.exit(1);

		}

		inputWord = args[0];

		/* Find out if it's a palindrome */
		boolean isPal = isPalindrome(inputWord, 0, (inputWord.length() - 1));

		if (isPal) {
			System.out.format("%s is a palindrome!\n", inputWord);
		} else {
			System.out.format("%s is not a palindrome.\n", inputWord);
		}
	}

	/**
	 * Determines if a provided word or phrase is a palindrome or not.
	 * 
	 * @param word       String reference for the word or phrase to be tested.
	 * @param leftIndex  The leftmost index of the word or phrase.
	 * @param rightIndex The rightmost index of the word or phrase.
	 * @return Boolean true if the word or phrase is a palindrome, false otherwise.
	 */
	private static boolean isPalindrome(String word, int leftIndex, int rightIndex) {

		// Implement this method to determine if the String passed in is a
		// palindrome or not.

		return false;

	}

}
