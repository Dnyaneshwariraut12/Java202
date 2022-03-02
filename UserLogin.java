package ATMInterface;

import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		String user;
		String password;
		System.out.println("Enter your name");
		user = scan.nextLine();
		
		System.out.println("Enter your password");
		password = scan.nextLine();
		
		if(user.equals("devyani") && (password.equals("deu"))){
			System.out.println("Logged in succesfully");
		}else {
			System.out.println("Invalid user id or password ");
		}
	}

}
