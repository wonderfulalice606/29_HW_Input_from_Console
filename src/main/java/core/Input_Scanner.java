package core;

import java.util.Scanner;

public class Input_Scanner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your First Name: ");
		String first_name = s.nextLine();
		System.out.println("Enter your Last Name: ");
		String last_name = s.nextLine();
		System.out.println("Your Full Name is: " + first_name + " " + last_name);
		s.close();

	}

}
