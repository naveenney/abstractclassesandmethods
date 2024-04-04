package abstractclassesandabstractmethods.book;

import java.util.Scanner;

public class LogIn {

	public boolean login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR USERNAME:");
		String username = sc.next();

		System.out.println("ENTER THE PASSWORD:");
		String password = sc.next();
		
		return new User().validateUser(username, password);
		
		
	}

}
