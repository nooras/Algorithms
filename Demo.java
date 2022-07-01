import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {
	private static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in); 
		String inputString = in.nextLine();
        List<Integer> numbers = Arrays.stream(inputString.split(",")).map(Integer::parseInt) .collect(Collectors.toList());
        String result = dUtility.findGrade(numbers.get(0),numbers.get(1)); 
        System.out.println(result);
//		List<Integer> list = new ArrayList<Integer>() ;
//		list.add(0);
//		list.add(0);
//		list.add(0);
//		System.out.println(list);
	}
}

class dUtility {

	public static String findGrade(float marksObtained, float totalMarks) {
		
		float x = (marksObtained/totalMarks)*100;
		System.out.println(x + " " + marksObtained + " " + totalMarks + " " + marksObtained/totalMarks);
		String grade = "NA";
		 if(x<25){
		      grade ="F";
		    }
		    else if((x>=25)&&(x<45)){
		      grade ="E";
		    }
		    else if((x>=45)&&(x<50)){
		      grade ="D";
		    }
		    else if((x>=50)&&(x<60)){
		      grade ="C";
		    }
		    else if((x>=60)&&(x<80)){
		      grade ="B";
		    }
		    else if((x>=80)&&(x<=100)){
		      grade ="A";
		    }
		    else{
		      grade ="Not correct marks";
		    }
		  
	return grade;
	}
}
