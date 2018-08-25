import java.util.Scanner;

public class Process {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Wellcome to Bank. Get username and password for continue.");
		System.out.print("Your new username: ");
		String kullaniciadi = scan.nextLine();
		System.out.print("Your new password: ");
		int sifre = scan.nextInt();
		scan.nextLine();
		
		Account new_account = new Account(1200, kullaniciadi, sifre);
		
		System.out.println("Balance: " + new_account.getBalance());
		System.out.println("Your username: " + new_account.getUsername());
		System.out.println("Your password: " + new_account.getPassword());
		
		boolean bankProcess = true;
	
		while(bankProcess) {
			System.out.print("Username: ");
			String username = scan.nextLine();
			
			
			System.out.print("Password: ");
			int password = scan.nextInt();
			
			if(new_account.getUsername().equals(username) && new_account.getPassword() == password) {
				
				System.out.println("******************************");
				System.out.println("WELLCOME TO THE BANK");
				System.out.println("Please choose a process...");
				System.out.println("1: Balance inquiry.");
				System.out.println("2: Deposit.");
				System.out.println("3: Money withdraw.");
				System.out.println("0: Exit.");
				System.out.println("******************************");
				
				bankProcess = false;
				
				
			}else {
				
				System.out.println("Incorrect username or password.");
				continue;
				
			}
		}
		
		
		
		while(true) {
			int process = scan.nextInt();
			
			if(process == 1) {
				
				new_account.balanceInquiry();
				
				
			}
			else if(process == 2) {
				System.out.println("Enter value of deposit: ");
				
				int deposit_value = scan.nextInt();
				new_account.deposit(deposit_value);
				
			}else if(process == 3) {
				System.out.println("Enter value of withdraw: ");
				
				int withdrawal_value = scan.nextInt();
				new_account.withdrawal(withdrawal_value);
				
			}else if(process == 0) {
				System.out.println("Exiting from bank.");
				break;
				
			}else {
				
				System.out.println("Please enter a valid process.");
				
			}
			
		}
	
				

	    }
	
	}
	


