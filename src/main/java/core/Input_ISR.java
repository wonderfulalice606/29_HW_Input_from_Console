package core;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Input_ISR {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your First Name: ");
		String first_name = br.readLine();
		System.out.println("Enter your Last Name: ");
		String last_name = br.readLine();
		System.out.println("Your Full Name is: " + first_name + " " + last_name);
		br.close();

	}

}
