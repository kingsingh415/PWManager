package src;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Authenticator {

	private String uIn;
	private String pIn;
	private ClientBST client;
	private UserBST user;

	public Authenticator() throws IOException {
		user = new UserBST();
	}

	public void authenticate() {
		System.out.print("Please enter your username: ");
		Scanner scan = new Scanner(new InputStreamReader(System.in));
		uIn = scan.nextLine();
		System.out.print("Please enter your password: ");
		pIn = scan.nextLine();
		if (user.isIn(uIn, pIn)) {
			System.out.println("LOGGED IN");
		} else {
			System.out.println("Login failed. Try again");
		}
		/**
		 * if (user.isIn(uIn, pIn)) { System.out.print("LOGGED IN");
		 * 
		 * }
		 **/
	}
}
