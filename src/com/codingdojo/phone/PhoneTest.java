package com.codingdojo.phone;

public class PhoneTest {
	public static void main(String[] args) {
		IPhone x = new IPhone("X", 83, "AT&T", "RINGGGGG");
		Galaxy s9 = new Galaxy("s9", 100, "Verizon", "BOOP  BOOP BOOP");
		
		x.displayInfo();
		System.out.println(x.ring());
		System.out.println(x.unlock());
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
	}
}
