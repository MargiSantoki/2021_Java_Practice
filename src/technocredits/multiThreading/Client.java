package multiThreading;

public class Client {
	public static void main(String[] args) {
		Employee1 emp1 = new Employee1();
		Employee2 emp2 = new Employee2();
		emp1.start();
		emp2.start();
	}
}
