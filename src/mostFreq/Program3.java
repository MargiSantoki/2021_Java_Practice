package mostFreq;

/*3.	Write a program to find second max from array
i/p  : {5,1,2,7,6,3,4,9}
o/p : 7*/

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;

public class Program3 {
	
	  int secondMaxNum(Integer[] num){
		  TreeSet<Integer> set = new TreeSet<>(Arrays.asList(num));
		  ArrayList<Integer> list = new ArrayList<>(set);
		  return list.get(list.size()-2);
	  }
	 
	// raw logic
	/*int secondMaxNum(Integer[] num){
		int max = num[0];
		int temp=0;
		int count = 0;
		while(count < 1){
			for(int index=1; index<num.length ;index++){
				if(max < num[index] || max == num[index]){
					max = num[index];
					temp = index;
				}
			}
			num[temp] = 0;
			temp = 0;
			max = num[0];
			count++;
		}
		for(int index=1; index<num.length ;index++){
			if(max < num[index]){
				max = num[index];
			}
		}	
		return max;
	}*/

	public static void main(String[] args) {
		Program3 program3 = new Program3();
		Integer[] num = { 5, 1, 2, 7, 6, 3, 4, 9};
		System.out.println(program3.secondMaxNum(num));
	}
}
