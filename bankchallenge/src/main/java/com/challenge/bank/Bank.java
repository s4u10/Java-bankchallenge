package com.challenge.bank;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * @author s4u1o
 *
 */
@Setter @Getter
public class Bank {
	private String name;
	private List<Account> accounts;	
}