package Assignment_25;

public class Assignment_25_1_1 {
	int getCount(String input){
		int count=0;
		String str = "";
		for(int index=0; index<input.length(); index++){
			if(Character.isDigit(input.charAt(index))){
				str += input.charAt(index);
			}
			else{
				if(!str.equals("")){
					count += Integer.parseInt(str);
					str = "";
				}
			}
		}
		return count;
	}
	public static void main(String[] args){	
		Assignment_25_1_1 test = new Assignment_25_1_1();
		String str = "te12ch33no3credit4s";
		System.out.println("Sum: " + test.getCount(str));
	}
}
