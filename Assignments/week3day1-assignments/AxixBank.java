package week3.day1;

public class AxixBank extends BankInfo{
	public void deposit ()
	
 	{
 		System.out.println(" Amount is deposited");
 	}

	public static void main(String[] args) {
		
		 AxixBank account = new  AxixBank();
		 BankInfo account1 = new  BankInfo();
		 account.fixed();
		 account.saving();
		 account1.deposit();
		 account.deposit();
		
		

	}

}
