import java.util.Scanner;
import java.lang.System;

class FloydsTriangleUtility {
    public static void floydsTriangle(int r){
	   
    	int k = 1;
	    for(int i=1;i<=r;i++) {
	    	for(int j=1;j<=i; j++) {
	    		System.out.print(k + " ");
	    		k ++;
	    	}
	    	System.out.println();
	    }
	    
    	
	    System.out.println();
    }
}
class FloydsTriangle {
    private static Scanner in;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        int r =  in.nextInt();
        FloydsTriangleUtility.floydsTriangle(r);    
    }
}