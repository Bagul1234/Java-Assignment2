package Assignment2;

public class Account {


	protected int accNo;
	protected String accHolderName;
	protected double balance;
	protected char gender;
	static int num = 386745;

	public Account( String accHolderName, double balance,char gender) {

		this.accNo = num++;
		this.accHolderName = accHolderName;
		this.balance = balance;
		this.gender=gender;

	}
	
	public void openAccount() {
		System.out.println("account opened");
	}
	
	
	public void deposit(int amt) {
		if(amt>0) {
		 balance+=amt;
		 System.out.println(amt+" is deposited successful \n available balance:"+balance);
		}
	}
	
	public void withdraw(int amt) {
		if(amt<0)
			System.out.println("amount should be positive");
		else if(amt>balance)
			System.out.println("insufficient balance");
		else
		{
			balance-=amt;
			System.out.println(amt+" amount withdraw successful \n available balance:" +balance);
		}
	}

	public void display() {
	System.out.print(	 "Account [accNo=" + accNo + ", accHolderName=" + accHolderName + ", balance=" + balance + ", gender="
				+ gender + "]");
	}

	

}


