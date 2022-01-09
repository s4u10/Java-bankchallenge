package com.challenge.bank;

/**
 * @author s4u1o
 *
 */
public abstract class Account implements IAccount {
	
	protected  static final int STANDARD_AGENCY = 1;
	protected  static int SEQUENTIAL = 1;
	
	protected int agency;
	protected int number;
	protected double balance;
	protected Client client;

	
	public Account(Client client) {
		this.agency = Account.STANDARD_AGENCY;
		this.number = SEQUENTIAL++;
		this.client = client;
	}
	@Override
	public void toWithdraw(double value) {
		if(balance >= value) {
			balance -= value;
			System.out.print("To Withdraw: " + value + "\n");
			System.out.print("New Balance: " + balance + "\n");
		} else {
				System.out.print("Insufficient Balancer. Make a deposit! \n");
		}
	}

	@Override
	public void deposit(double value) {
		balance += value;
		System.out.print("Deposit value: "+ value + "\n");
		System.out.print("New Balance: " + balance + "\n");
	}
	

	@Override
	public void transfer(double value, IAccount accountDestiny) {
		if(balance >= value) {
			this.toWithdraw(value);
			accountDestiny.deposit(value);
			System.out.print("Amount transferred: " + value + "\n");
		} else {
				System.out.print("Insufficient Balancer. Make a deposit! \n");
		}
	}
	protected void extractedPrint() {
		System.out.println(String.format("Holder: %s", this.client.getName()));
		System.out.println(String.format("Agency: %d", this.agency));
		System.out.println(String.format("Number: %d", this.number));
		System.out.println(String.format("Balance: %.2f", this.balance));
	}
}
