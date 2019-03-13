package main;

public class MoneyBank{
	private String accountHolderName;
	private double accountBalance;
	private long accountNumber;
	private static int nextAccountNumber = 0;
	
	public MoneyBank(){
		
	}

	public MoneyBank(String accountHolderName,double accountBalance){
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.accountNumber = ++nextAccountNumber;
	}
	
	public long getNextAccountNumber(){
		return accountNumber;
	}
	
	public double withdraw(double ammount){
		if(this.accountBalance > ammount){
			this.accountBalance = this.accountBalance - ammount;
		}
		else
			System.out.println("you do not have sufficient funds");	
	
		return accountBalance;
	}

}