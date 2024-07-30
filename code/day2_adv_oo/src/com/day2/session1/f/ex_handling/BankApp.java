package com.day2.session1.f.ex_handling;

//Checked ex
class NotSufficientFundException extends Exception {
	public NotSufficientFundException(String message) {
		super(message);
	}
}
class OverFundException extends Exception {
	public OverFundException(String message) {
		super(message);
	}
}

class Account {
	private int id;
	private String name;
	private int amount;

	public Account(int id, String name, int amount) throws NotSufficientFundException {
		this.id = id;
		this.name = name;
		this.amount = amount;
		if (amount < 10000) {
			throw new NotSufficientFundException("amount is " + amount + " should be min 10K");
		}
	}

	public void deposit(int a)throws OverFundException {
		int temp=amount+a;
		if(temp>5_00_000) {
			throw new OverFundException("you can not deposit more then 5L in saving account");
		}
		amount=temp;
	}

	public void withdraw(int a) throws NotSufficientFundException{
		
		int temp=amount-a;
		if(temp<10000) {
			throw new NotSufficientFundException("you can not withdraw "+ a +" as you dnot have sufficient fund");
		}
		amount=temp;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}

}

public class BankApp {

	public static void main(String[] args) {
		try {
			Account account = new Account(1, "raj", 15000);
			System.out.println(account);
			account.withdraw(3000);
			System.out.println(account);
			
			account.deposit(4_90_000);
			System.out.println(account);
			
		} catch (NotSufficientFundException e) {
			System.out.println(e.getMessage());
		}catch(OverFundException e) {
			System.out.println(e.getMessage());
		}
	}
}
