package Assignment2;

public class LoanAccount extends Account  {
	
		static float intrest = 0.11f;
	    
		

		public LoanAccount(String accHolderName, double balance, char gender) {
			super(accHolderName,  balance, gender);
			
		}
	     public void payEmi(int amt) {
	    	 if(amt>0) {
	    		 balance+=amt;
	    		 System.out.println(amt+" is deposited successful \n available balance:"+balance);
	    		}
	     }


		@Override
		public String toString() {
			return "LoanAccounr [  accNo=" + accNo + ", accHolderName=" + accHolderName + ", balance=" + balance
					+ "Intreest:" + intrest + "]";
		}

	}

