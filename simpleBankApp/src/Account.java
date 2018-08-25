
public class Account {
	
	
	private int balance;
	private String username;
	private int password;
	
	public Account(int balance, String username, int password) {
		
		this.balance = balance;
		this.username = username;
		this.password = password;
		
	}
	
	public void balanceInquiry() {
		
		if(balance <= 0) {
			
			System.out.println("You have no balance.");
		}else {
		System.out.println("Your balance is " + balance + " dollars.");
		}
		
		
	}
	
	public void deposit(int deposit_value) {
		
		balance += deposit_value;
		System.out.println("Your new balance: " + balance);
		
	}
	public void withdrawal(int withdrawal_value) {
		
		if(withdrawal_value > balance) {
			
			System.out.println("You can not perform that process.");
			
		}else {
			
			balance  -= withdrawal_value;
			System.out.println("Your new balance: " + balance);
			
		}
		
	}
	
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public int getPassword() {
		return password;
	}
	
	public void setPassword(int password) {
		this.password = password;
	}
	
	
	
	
	

}
