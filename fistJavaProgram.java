import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.lang.*;

public class fistJavaProgram {
	public static void main(String[] args) {
		System.out.println("Hello World");
		List<String> aList = new ArrayList<String>() {{add("m");}} ;
		List<String> lList = new LinkedList<String>() ;
		List<String> sList = new Stack<String>() ;
		List<String> vList = new Vector<String>() ;
		List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
		boolean a = aList.add("a");
		aList.add("b");
		System.out.println(listOfLists);
		lList.add("a");
		lList.add("b");
		System.out.println(lList);
		sList.add("a");
		sList.add("b");
		System.out.println(sList);
		vList.add("a");
		vList.add("b");
		System.out.println(vList);
	}
}
