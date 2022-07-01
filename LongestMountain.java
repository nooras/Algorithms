
import java.util.Arrays;
import java.util.Scanner;

class LongestMountainUtility {
    public static int findMountainSubArray(int[]heights,int N){
        int longestMountainSubArray = 0;
        int base = 0;

        while(base < N){
            int hillPointIndex = base;
            //if the current base is the left most point. Possible mountain scenario
            if ((hillPointIndex+1 < N) && (heights[hillPointIndex] < heights[hillPointIndex+1])){
                //adjust the hill point to the potential highest peak
                while((hillPointIndex+1 < N) && (heights[hillPointIndex] < heights[hillPointIndex+1])){
                    hillPointIndex += 1;
                }
                //further points are shorted than peak
                if((hillPointIndex+1 < N) && heights[hillPointIndex] > heights[hillPointIndex+1]){
                    //move to the lowest hill point
                    while((hillPointIndex+1 < N) && (heights[hillPointIndex] > heights[hillPointIndex+1])){
                        hillPointIndex += 1;
                    }
                    
                    longestMountainSubArray = Math.max(longestMountainSubArray,hillPointIndex-base+1);
                }

            }

            base = Math.max(hillPointIndex,base+1);
        }

        return longestMountainSubArray;
    }
}
class LongestMountain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        int[] heights = Arrays.stream(inputString.split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println(LongestMountainUtility.findMountainSubArray(heights,heights.length));
    }
}