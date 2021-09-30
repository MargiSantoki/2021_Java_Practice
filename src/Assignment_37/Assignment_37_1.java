package Assignment_37;

public class Assignment_37_1 {

	String getSecondLargestWord(String input) {
		String secLargestWord = "", word = "";
		String arr[] = input.split(" ");
		for(int index=0; index<arr.length; index++) {
			if(word.length()<arr[index].length() || word.length()==arr[index].length()) {
				word = arr[index];
				arr[index] = "";
			}
		}
		for(int index=0; index<arr.length; index++) {
			if(secLargestWord.length()<arr[index].length()) {
				secLargestWord = arr[index];
			}
		}
		return secLargestWord;
	}
	
	public static void main(String[] args) {
		Assignment_37_1 assignment_37_1 = new Assignment_37_1();
		//String str = "what is your name";
		String str = "welcome to our familya";
		System.out.println("Input String: " + str);
		System.out.println("Second Largest Word: " + assignment_37_1.getSecondLargestWord(str));
	}
}
