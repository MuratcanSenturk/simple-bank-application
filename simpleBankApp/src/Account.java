
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
			
			System.out.println("Bakiyeniz bulunmamaktadır.");
		}else {
		System.out.println("Güncel bakiyeniz " + balance + " türk lirası.");
		}
		
		
	}
	
	public void deposit(int deposit_value) {
		
		balance += deposit_value;
		System.out.println("Yeni bakiyeniz: " + balance);
		
	}
	public void withdrawal(int withdrawal_value) {
		
		if(withdrawal_value > balance) {
			
			System.out.println("Bu işlemi gerçekleştiremezsiniz.");
			
		}else {
			
			balance  -= withdrawal_value;
			System.out.println("Yeni bakiyeniz: " + balance);
			
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
