import java.util.Scanner;

class VowelUtility {

	public static String isVowel(char c) {
		String alphabet = "Not a vowel";
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				{
					 alphabet = "Vowel";
				}
		return alphabet;
	}

}

class Vowel {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("Enter an alphabet:  ");
		char c= in.next().charAt(0);	
		String alphabet = VowelUtility.isVowel(c);
		System.out.println(alphabet);
	}

}