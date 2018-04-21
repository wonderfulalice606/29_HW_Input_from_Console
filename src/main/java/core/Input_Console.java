package core;

import java.io.Console;

public class Input_Console {
	public static void main(String[] args) {
		Console c = System.console();

		if (c == null) {
			System.err.println("Console is not available");
			System.exit(0);
		}

		// System.out.println("Enter your First Name: ");
		String first_name = c.readLine("Eneter your First Name: ");
		String last_name = c.readLine("Enter your Last Name: ");
		System.out.println("Your Full Name is: " + first_name + " " + last_name);
	}
}
