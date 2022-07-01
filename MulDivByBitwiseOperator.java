import java.util.Scanner;

class MulDivByBitwiseOperator {
    public static void main(String[] arr){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(bitwiseUtility.multiplyByTwo(number)+","+bitwiseUtility.divideByTwo(number));
    }
}

class bitwiseUtility {
    public static int multiplyByTwo(int number){
        int product = number << 1;
        return (product);
    }

    public static int divideByTwo(int number){
        int product = number >> 1;
        return (product);
    }
}

//10
//20,5
