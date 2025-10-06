package week4.day1;

public class Amazon extends CanaraBank {

	@Override
	public void cashOnDelivery() {
		System.out.println("cashOnDelivery 34324");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("upiPayments 423");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("cardPayments 453423");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("internetBanking 2343");
		
	}
	
	public void recordPaymentDetails()
	{
		super.recordPaymentDetails();
		System.out.println("Payment details are recorded in Amazon");
	}
	
	public static void main(String[] args) {
		Amazon amazonOptions = new Amazon();
		amazonOptions.cardPayments();
		amazonOptions.upiPayments();
		amazonOptions.cardPayments();
		amazonOptions.internetBanking();
		amazonOptions.recordPaymentDetails();

	}


}
