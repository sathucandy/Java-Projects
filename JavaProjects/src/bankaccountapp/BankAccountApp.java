package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {

		/*
		 * Checking chkacc1 = new Checking("Tom Wilson", "123456789", 1500);
		 * 
		 * Savings savacc1 = new Savings("Rich Love", "987654321", 2500);
		 * 
		 * savacc1.showInfo(); savacc1.compound();
		 * System.out.println("*************************"); chkacc1.showInfo();
		 */

		List<Account> accounts = new LinkedList<Account>();

		// Read a CSV file then create new accounts based on that data
		// Give the link to CSV file
		String file = "NewBankAccounts.csv";
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			// System.out.println(name + "" + sSN + "" + accountType + "$" + initDeposit);

			if (accountType.equals("Savings")) {
				// System.out.println("OPEN A SAVINGS ACCOUNT");

				// Savings s=new Savings(name, sSN, initDeposit);
				accounts.add(new Savings(name, sSN, initDeposit));
			} else if (accountType.equals("Checking")) {
				// System.out.println("OPEN A CHECKING ACCOUNT");
				accounts.add(new Checking(name, sSN, initDeposit));
			} else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}

		for (Account acc : accounts) {
			System.out.println("\n**************");
			acc.showInfo();
		}

	}

}
