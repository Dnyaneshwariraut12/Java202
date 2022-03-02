package ATMInterface;

public class AccountHolder {

	String name;
	int acc_no;
	String acc_type;
	double balance;
	
	public AccountHolder(String name, int acc_no, String acc_type, double balance) {
		super();
		this.name = name;
		this.acc_no = acc_no;
		this.acc_type = acc_type;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public String getAcc_type() {
		return acc_type;
	}

	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

	public void withdraw(int amount ) {
		synchronized(this) {
		if(balance < amount)
		System.out.println("Insuficient balance");
		else {
			balance = balance - amount;
		}
		this.notify();
		}
		System.out.println("updated balance after withdraw"+ balance);
	}
	
	public void deposite(int amount) {
		synchronized(this) {
			balance = balance + amount;
			this.notify();// t1
}
		System.out.println("updated balance after deposite "+ balance);
	}
	
	
	//viewBalance()
	
	public void viewbalance() {
		// TODO Auto-generated method stub
		synchronized(this) {
			double amount = 0;
			if(balance <= amount);
			this.notify();
		
	}
		System.out.println("update balance after view" + balance);
}

}
