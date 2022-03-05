package Task1;

import java.util.Scanner;

public class LogIn {
	private final String admin_nickname = "admin";
	private final String admin_password = "12345";
	private String admin_nickname_try;
	private String admin_password_try;

	public LogIn() {
		Scanner scanner = new Scanner(System.in);
		this.admin_nickname_try = scanner.nextLine();
		this.admin_password_try = scanner.nextLine();

		if (admin_nickname_try.equals(admin_nickname) && admin_password_try.equals(admin_password)) {
			System.out.println("login successfully");
			Employee employee = new HourlyEmployee("name", "surname");
		} else {
			System.out.println("Login unsuccessfully");
		}
	}

}
