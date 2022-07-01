import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class CoinChangeUtility {
	public static String findCoinsNeeded(int onesAvailable, int fivesAvailable, int amountNeeded) {
		//set the initial value of return as NP
		String returnValue = "NP";
		// Find out the maximum number of $5 coins that is needed 
		int fivesNeeded = amountNeeded / 5;
		// if required number of $5 coins are not available, use the available $coins
		if (fivesNeeded >= fivesAvailable) {
			fivesNeeded = fivesAvailable;
		}
		//Find out the remaining number of $1 coin needed
		int onesNeeded = amountNeeded - (fivesNeeded * 5);
		// if required number of $1 coins are not available , use the available number
		// and construct the return string
		if (onesNeeded <= onesAvailable) {
			returnValue = onesNeeded+" and "+ fivesNeeded;
		}
		return returnValue;
	}
}

class CoinChange {

	public static void main(String[] args) {
		//Multi-line input
// 		Scanner in = new Scanner(System.in);
// 		int fivesAvailable = in.nextInt();
// 		int onesAvailable = in.nextInt();
// 		int amountNeeded = in.nextInt();
// 		String returnValue = CoinUtility.findCoinsNeeded(onesAvailable, fivesAvailable, amountNeeded);
// 		System.out.println(returnValue);
		
		//Single line input
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		List<String> inputData = Arrays.stream(inputString.split(",")).collect(Collectors.toList());
		int fivesAvailable = Integer.parseInt(inputData.get(0));
		int onesAvailable =Integer.parseInt(inputData.get(1));
		int amountNeeded = Integer.parseInt(inputData.get(2));
		String returnValue = CoinChangeUtility.findCoinsNeeded(onesAvailable, fivesAvailable, amountNeeded);
		System.out.println(returnValue);
	}
}

