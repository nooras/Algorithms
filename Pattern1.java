import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Pattern1Utility {
	public static void displayTriangle(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(i+j<=num) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
	}
}

class Pattern1 {
    public static void main(String[] arr){
    	Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		List<Integer> numbers = Arrays.stream(inputString.split(","))
		        .map(Integer::parseInt)
		        .collect(Collectors.toList());
		Pattern1Utility.displayTriangle(numbers.get(0));
		in.close();
    }
}