package com.challenge.bank;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author s4u1o
 *
 */
public class Box {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
	
		try {
		Scanner appBox = new Scanner(System.in);
		String toName;
		double depC = 0;
		double depS = 0;
		double transf = 0;
		System.out.print("Customer name: \t");
		toName = appBox.nextLine();
		
		// Client name
		Client toNew = new Client();
		toNew.setName(toName);
		
		// Deposit 
		System.out.print("Value Deposit Checking Account: ");
		depC = appBox.nextDouble();
		Account cc = new CheckingAccount(toNew);
		cc.deposit(depC);
		
		// Deposit Saving Account
		System.out.print("Value Deposit Saving Account: ");
		depS = appBox.nextDouble();
		Account cp = new SavingsAccount(toNew);
		cp.deposit(depS);		
		
		System.out.print("Value Transfer Saving Account: ");
		transf = appBox.nextDouble();	
		cc.transfer(transf, cp);
		
		cc.extractPrint();
		cp.extractPrint();
		
		}catch (Exception e) {
			System.out.print("System Erro");
		}
	}
	
}
