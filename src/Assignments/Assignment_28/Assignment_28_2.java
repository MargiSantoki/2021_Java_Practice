package Assignments.Assignment_28;

public class Assignment_28_2 {
	
	//nth highest number from array
	int getNumber(int[] input, int num) {
		int max = input[0];
		int temp = 0;
		int secondMax = input[0];
		int outerIndex=0;
		while(outerIndex<num-1) {
			max=input[0];
			for(int index=1; index<input.length; index++) {
				if(max < input[index]) {
					max = input[index];
					temp = index;
				}
			}
			input[temp]=0;
			outerIndex++;
		}
		for(int index=1; index<input.length; index++) {
			if(secondMax<input[index])
				secondMax=input[index];
		}
		return secondMax;
	}
		
	public static void main(String[] args) {
		Assignment_28_2 assignment_28_2 = new Assignment_28_2();
		int[] arr = {10,23,2,11,55,43,99};
		int nth = 3;
		System.out.println(nth + " highest number: " + assignment_28_2.getNumber(arr,3));
	}
}
