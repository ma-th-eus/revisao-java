package secao10Exceptions.entities;

import secao10Exceptions.exceptions.DomainException;

public class Account {
	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	
	
	public Account(int number, String holder, double balance, double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(double amount) {
		balance+=amount;
	}
	
	public void withdraw(double amount) {
		if(amount > balance)
			throw new DomainException("Not enough balance");
		if(amount > withdrawLimit)
			throw new DomainException("The amount exceeds withdraw limit");
		
		balance-=amount;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	
	
	
	
}
