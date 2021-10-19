package mostFreq;

/*2.	Write a program that find max number from array
i/p  : {5,1,2,7,6,3,4,9}
o/p : 9*/

import java.util.Arrays;
import java.util.TreeSet;
import java.util.ArrayList;

public class Program2 {

	int maxNum(Integer[] num) {
		TreeSet<Integer> set = new TreeSet<>(Arrays.asList(num));
		ArrayList<Integer> list = new ArrayList<>(set);
		return list.get(list.size() - 1);
	}

	// raw logic

	/*int maxNum(Integer[] num) {
		int max = num[0];
		for (int index = 1; index < num.length; index++) {
			if (max < num[index] && max != num[index])
				max = num[index];
		}
		return max;
	}*/

	public static void main(String[] args) {
		Program2 program2 = new Program2();
		Integer[] num = { 5, 1, 2, 7, 6, 3, 4, 9 };
		System.out.println(program2.maxNum(num));
	}
}
