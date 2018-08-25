import java.util.Scanner;

public class Process {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bankaya hoşgeldiniz. Devam etmek için bir kullanıcı adı ve şifre alın.");
		System.out.print("Kullanıcı adınız: ");
		String kullaniciadi = scan.nextLine();
		System.out.print("Şifreniz: ");
		int sifre = scan.nextInt();
		scan.nextLine();
		
		Account new_account = new Account(1200, kullaniciadi, sifre);
		
		System.out.println("Bakiye: " + new_account.getBalance());
		System.out.println("Kullanıcı adı: " + new_account.getUsername());
		System.out.println("Şifre: " + new_account.getPassword());
		
		boolean bankProcess = true;
	
		while(bankProcess) {
			System.out.print("Username: ");
			String username = scan.nextLine();
			
			
			System.out.print("Password: ");
			int password = scan.nextInt();
			
			if(new_account.getUsername().equals(username) && new_account.getPassword() == password) {
				
				System.out.println("******************************");
				System.out.println("Bankaya Hoşgeldiniz");
				System.out.println("Lütfen bir işlem seçin...");
				System.out.println("1: Bakiye sorgulama.");
				System.out.println("2: Para yatırma.");
				System.out.println("3: Para çekme");
				System.out.println("0: Çıkış");
				System.out.println("******************************");
				
				bankProcess = false;
				
				
			}else {
				
				System.out.println("Kullanıcı adı yada şifre yanlış.");
				continue;
				
			}
		}
		
		
		
		while(true) {
			int process = scan.nextInt();
			
			if(process == 1) {
				
				new_account.balanceInquiry();
				
				
			}
			else if(process == 2) {
				System.out.println("Yatıracağınız parayı girin: ");
				
				int deposit_value = scan.nextInt();
				new_account.deposit(deposit_value);
				
			}else if(process == 3) {
				System.out.println("Çekeceğiniz parayı girin: ");
				
				int withdrawal_value = scan.nextInt();
				new_account.withdrawal(withdrawal_value);
				
			}else if(process == 0) {
				System.out.println("Bankadan çıkılıyor.");
				break;
				
			}else {
				
				System.out.println("Lütfen geçerli bir işlem girin.");
				
			}
			
		}
	
				

	    }
	
	}
	


