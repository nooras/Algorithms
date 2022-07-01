import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class MultipleOfNumUtility {

	public static String isMultiple(int n, int m) {
		String result = "Not a multiple" ;
		if (n%m == 0)
		{
			result = "Is a multiple";
		}
		return result;
	}

}

class MultipleOfNum {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in); 
		String inputString = in.nextLine();
        List<Integer> numbers = Arrays.stream(inputString.split(",")).map(Integer::parseInt).collect(Collectors.toList());
		String result = MultipleOfNumUtility.isMultiple(numbers.get(0),numbers.get(1));
		System.out.println(result);
	}

}
