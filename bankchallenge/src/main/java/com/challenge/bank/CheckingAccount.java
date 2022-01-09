package com.challenge.bank;

/**
 * @author s4u1o
 *
 */
public class CheckingAccount extends Account  {

	public CheckingAccount(Client client) {
		super(client);
	
	}

	@Override
	public void extractPrint() {
		System.out.println(" *** Extract Checking Account *** ");
		super.extractedPrint();

	}

}
