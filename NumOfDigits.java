import java.util.Scanner;

class NumOfDigitsUtility {
    public static int countDigits(int number){
        int numberOfDigits = (int)Math.floor(Math.log10(number) + 1);
        return numberOfDigits;
//    	int temp = number;
//    	int count = 0;
//    	while(temp != 0) {
//    		temp = temp/10;
//    		count ++;
//    	}
//    	return count;
    }
}


class NumOfDigits {
    public static void main(String[] arr){
        Scanner in = new Scanner (System.in);
        int number = in.nextInt();
        System.out.println(NumOfDigitsUtility.countDigits(number));
    }
}

//1000
//4
