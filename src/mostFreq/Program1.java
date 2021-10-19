package mostFreq;

import java.util.ArrayList;
import java.util.Arrays;

/*1.	Write a program that finds duplicate characters in strings
i/p  : technocredits
o/p : tec*/

public class Program1 {

	ArrayList<String> getDuplicate(String input) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList(input.split("")));
		ArrayList<String> list1 = new ArrayList<>();
		for(String str : list) {
			if(!list1.contains(str) && (list.indexOf(str)!=list.lastIndexOf(str))) {
				list1.add(str);
			}
		}
		return list1;
	}
	
	//raw logic
	/*String getDuplicate(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			if(input.indexOf(input.charAt(index)) != input.lastIndexOf(input.charAt(index))) {
				if(index==input.indexOf(input.charAt(index)))
					output += input.charAt(index);
			}
		}
		return output;
	}*/

	public static void main(String[] args) {
		Program1 program1 = new Program1();
		String str = "technocredits";
		System.out.println("Duplicate: " + program1.getDuplicate(str));
	}
}
