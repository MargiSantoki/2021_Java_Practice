package Assignments.CodingTest;

import java.util.Arrays;

public class CodingTest_3_1 {
	int[] getCount(int[] input, int num){
		int[] output = new int[input.length-1];
		int outputIndex=0;
		for(int index=0; index<input.length; index++){
			if(input[index]==num){
				index++;
				output[outputIndex] = input[index];
			}
			else{
				output[outputIndex] = input[index];
			}
			outputIndex++;
		}
		return output;
	}
	public static void main(String[] args){	
		CodingTest_3_1 test = new CodingTest_3_1();
		int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		System.out.println(Arrays.toString(test.getCount(input,14)));
	}
}
