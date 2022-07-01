class sUtility {
	public static String sumOfComplexNumbers(double r1,double i1,double r2,double i2){
        String complexSum = "NA";
		double realSum = r1+ r2  ;
		double imgSum = i1+ i2  ;
		complexSum = realSum+" + "+ imgSum;
        return complexSum;
   }
	
}


class SumOfTwoComplexNumber {
	public static void main(String[] args) {
		  String complexSum =sUtility.sumOfComplexNumbers(4.4,2,3,7.6);
	       System.out.println("Sum of 2 complex numbers: "+complexSum+"i");
	}
	
}


//Sum of 2 complex numbers: 7.4 + 9.6i
