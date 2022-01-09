package com.challenge.bank;

/**
 * @author s4u1o
 *
 */
public interface IAccount {

	void toWithdraw(double value);
		
	void deposit(double value);
		
	void transfer(double value, IAccount accountDestiny);
	
	void extractPrint();
	
}
