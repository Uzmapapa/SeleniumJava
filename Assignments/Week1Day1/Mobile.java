package week1.day1;

public class Mobile {
	public void makeCall() {
		String moblieModel;
		float moblieWeight;
		moblieModel = "samsung galaxy";
		moblieWeight = 150.9f;		
		System.out.println("your mobile model is : " + moblieModel  );
		System.out.println("your mobile weight is : " + moblieWeight + " grams" );
	}
	
	public void sendMessage() {
		boolean isFullCharged;
		int mobilecost;
		isFullCharged = false;
		mobilecost = 30250;
		System.out.println("your mobile is fully charged : " + isFullCharged  );
		System.out.println("your mobile cost is : " +  mobilecost + " Inr" );

	}

	public static void main(String[] args) {
		Mobile mobileInformation =new Mobile();
		mobileInformation.makeCall();
		mobileInformation.sendMessage ();

	}

}
