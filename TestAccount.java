package Assignment2;

public class TestAccount {



	public static void main(String[] args) {
		HomeLoan homeLoan=new HomeLoan("Tejas", "Homeloan", 500000, 'M');
		homeLoan.openAccount();
		homeLoan.deposit(5000);
		homeLoan.withdraw(1000);
		System.out.println(homeLoan);
		
		HomeLoan homeLoan1=new HomeLoan("aaaa", "loan", 100000, 'M');
		homeLoan1.openAccount();
		homeLoan1.deposit(100);
		homeLoan1.withdraw(1000);
		System.out.println(homeLoan1);
	}

}


