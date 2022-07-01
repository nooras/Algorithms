import java.util.Arrays;
import java.util.Scanner;

class ContiguousArrayUtility {
    public static int maxPossibleSubArrayLength(char[] chars){
        int maxLength = 0;
        int count = 0;
        int[] tempArray = new int[2*chars.length+1];
        Arrays.fill(tempArray,-2);
        System.out.println(tempArray.toString());
        tempArray[chars.length] = -1;
        for(int i=0;i<chars.length;i++){
            count = count + (chars[i] == 'b' ? -1 : 1);
            if(tempArray[count+chars.length] >= -1){
                maxLength = Math.max(maxLength,i-tempArray[count+chars.length]);
            }else{
                tempArray[count+chars.length] = i;
                System.out.println(i);
            }
        }
        return maxLength;
    }
}


class ContiguousArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        char[] chars = inputString.toCharArray();
        System.out.println(ContiguousArrayUtility.maxPossibleSubArrayLength(chars));
    }
}