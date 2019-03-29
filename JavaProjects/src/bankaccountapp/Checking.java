package bankaccountapp;

public class Checking extends Account {

	// List properties specific to checking account
	private int debitCardNumber;
	private int debitCardPin;

	// Constructor to initialize checking account properties

	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}

	public void setRate() {
		rate = getBaseRate() * 15;
	}

	// List any methods specific to checking account

	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}

	public void showInfo() {
		System.out.println("ACCOUNT TYPE: CHECKING");
		super.showInfo();
		System.out.println("YOUR CHECKING ACCOUNT FEATURES" + "\nDEBIT CARD NUMBER: " + debitCardNumber
				+ "\nDEBIT CARD PIN: " + debitCardPin);
	}
}
