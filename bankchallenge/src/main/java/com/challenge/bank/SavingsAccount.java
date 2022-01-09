package com.challenge.bank;

/**
 * @author s4u1o
 *
 */

public class SavingsAccount extends Account {
	
	public SavingsAccount(Client client) {
		super(client);
		
	}

	@Override
	public void extractPrint() {
		System.out.println(" *** Extract Saving Account *** ");
		super.extractedPrint();
	}
	
}
