package src;

import java.io.IOException;

public class Runner {

	private static Authenticator a;

	public static void main(String[] args) throws IOException {
		a = new Authenticator();
		a.authenticate();
	}

}
