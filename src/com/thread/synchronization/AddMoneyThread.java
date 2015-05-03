package com.thread.synchronization;

public class AddMoneyThread implements Runnable{
	private Account account;
	private double money;
	
	public AddMoneyThread(Account account,double money) {
		this.account=account;
		this.money=money;
	}
	
	
	@Override
	public void run() {
		synchronized(account) {
			account.deposit(money);
		}
	}
	
	
	
	
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}





}
