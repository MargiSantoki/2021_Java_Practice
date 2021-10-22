package techno.technocredits1.oops;

import java.io.FileNotFoundException;
import techno.technocredits1.exception.AgeNotValidException;

import java.io.IOException;


public class A {

	void m1() throws AgeNotValidException{
		System.out.println("Hi");
		throw new AgeNotValidException("Age is not valid");
	}
	
	public static void main(String[] args) {
		try {
			new A().m1();
		}
		catch(AgeNotValidException e) {
			System.out.println(e.toString());
		}
	}
}
