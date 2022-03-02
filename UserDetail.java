package ATMInterface;

import java.util.Scanner;

public class UserDetail {
	String user;
	String password;
	public UserDetail(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}
	public UserDetail() {
		// TODO Auto-generated constructor stub
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDetail [user=" + user + ", password=" + password + "]";
	}
	UserDetail addMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("user id for registration");
		String user = sc.next();
		System.out.println("create password ");
        String password = sc.next();

		return new UserDetail(user,password);
	}

}