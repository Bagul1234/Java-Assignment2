package Assignment2;

public class HomeLoan extends LoanAccount {

	static private float intrestRate = 0.09f;

	public HomeLoan(String accHolderName, String accType, double balance, char gender) {
		super(accHolderName, balance, gender);

	}

	@Override
	public String toString() {
		return "HomeLoan [accNo=" + accNo + ", accHolderName=" + accHolderName + ", balance=" + balance + ", gender="
				+ gender + "  intrestRate:" + intrestRate + "]";
	}

}
