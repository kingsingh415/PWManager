package src;

/**
 * Holds user data
 * 
 * @author intern
 *
 */
public class UserBST {

	private String[] usernames = { "Ishaan", "test" };
	private String[] passwords = { "Ishaan", "test" };

	public UserBST() {

	}

	public boolean isIn(String uIn, String pIn) {
		boolean u = false;
		boolean p = false;
		for (int i = 0; i < usernames.length; i++) {
			if (usernames[i].equals(uIn)) {
				u = true;
			}
		}
		for (int i = 0; i < passwords.length; i++) {
			if (passwords[i].equals(pIn)) {
				p = true;
			}
		}
		return u && p;
	}
}
