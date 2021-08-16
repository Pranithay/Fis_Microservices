package com.fis.account.bean;

public class Account {
	private long number;
	private String type;
	double balance;
	
	public Account() {
		super();
	}
	public Account(long number,String type,double balance) {
		super();
		this.balance=balance;
		this.type=type;

		this.number=number;

	}
	@Override
	public String toString() {
		return "Account [number=" + number + ", type=" + type + ", balance=" + balance + "]";
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
