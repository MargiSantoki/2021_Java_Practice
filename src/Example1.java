import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Techno");
		al.add("Chandni");
		al.add("Amruta");
		al.add("Parthav");
		al.add("Mayur");
		al.add("Amruta");
		al.add("Credits");
		al.add("Amruta");
		/*for(int index=0; index<al.size(); index++) {
			if(al.get(index).equals("Amruta"))
				al.remove(index);
		}*/
		while(al.contains("Amruta")) {
			al.remove("Amruta");
		}
		System.out.println(al);
	}
}
