package Assignment2;

public class SavingAccount extends Account {
	
        static float intrest=0.07f;

		public SavingAccount( String accHolderName, String accType, double balance,char gender) {
			super( accHolderName, balance,gender);
			
		}

		@Override
		public String toString() {
			return "SavingAccount [accNo=" + accNo + ", accHolderName=" + accHolderName + ", balance=" + balance + "IntrestRate:"+intrest+"]";
		}
        
        
        
}

