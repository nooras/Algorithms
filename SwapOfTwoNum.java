import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class swapUtility {
	public static String swapNumbers(int n1, int n2) {
		String swap = "No swap to be performed";
	   	n1 = n1 ^ n2;
	    n2 = n1 ^ n2;
	    n1 = n1 ^ n2;
	    swap = n1+ "," +n2;
	    return swap;
	}
}



class SwapOfTwoNum {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		String inputString = in.nextLine();
		List<String> inputData = Arrays.stream(inputString.split(",")).collect(Collectors.toList());
		int n1= Integer.parseInt(inputData.get(0));
		int n2 = Integer.parseInt(inputData.get(1));
		String swap =swapUtility.swapNumbers(n1,n2);
		System.out.println(swap);
	}

}

//22,55
//55,22