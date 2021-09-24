package multiThreading;

public class Employee1 extends Thread{
	public void run() {
		m1();
	}
	void m1() {
		for(int index=1; index<=100; index++) {
			System.out.println(index);
		}
	}
}
