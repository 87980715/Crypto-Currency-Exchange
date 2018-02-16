package com.exchange;


import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Transaction implements Serializable {
	

	private double price;
	private double transactionAmount;
	private double currencyQuantity;
	private float transactionFee;
	private String transactionType;
	private String [] bankPayment;
	private String [] cardPayment;
	private Date time;
	private long transactionId;
	private CryptoCurrency[] currency;
	private Payment payment;
	private User user;
	Wallet[] wallet;
	
	
	public Transaction() {
		
	}
	
	public Transaction(Wallet[] wallet,CryptoCurrency[] currency,User user) 
	{
		this.wallet=wallet;
		this.currency=currency;
		this.user=user;
	}
	
	
	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public double getCurrencyQuantity() {
		return currencyQuantity;
	}

	public void setCurrencyQuantity(double currencyQuantity) {
		this.currencyQuantity = currencyQuantity;
	}

	public float getTransactionFee() {
		return transactionFee;
	}

	public void setTransactionFee(float transactionFee) {
		this.transactionFee = transactionFee;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String[] getBankPayment() {
		return bankPayment;
	}

	public void setBankPayment(String[] bankPayment) {
		this.bankPayment = bankPayment;
	}

	public String[] getCardPayment() {
		return cardPayment;
	}

	public void setCardPayment(String[] cardPayment) {
		this.cardPayment = cardPayment;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
	
	

	public boolean buyCurrency(int amount, Payment payment,
			User user, CryptoCurrency[] cryptoCurrency, double quantity, Wallet [] wallet,
			String currency)
	{
		
		//yet to implement fees and update wallet and transaction!
		double currentBalance=0;
		HashMap<String, Double> details;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); // Now use today date.
		c.add(Calendar.DATE, 7);
		
		if(user.getLastTransaction().before(c)
				
				&& user.getLimit() < amount) {
			System.out.println("User has crossed the weekly limit");
		
		return false;
		}
				
		else if(payment instanceof BankAccount)
		{
	
				BankAccount ba=(BankAccount)payment;
				details= ba.getBankAccount();
				currentBalance=details.get(ba.getBankName());
				
				if(currentBalance > amount)
				{
					System.out.println("Success");
					currentBalance -= amount;
					details.put(ba.getBankName(), currentBalance);
					
					if(currency.equalsIgnoreCase("bitcoin"))
						wallet[0].addCurrency(quantity);
					else if(currency.equalsIgnoreCase("ethereum"))
						wallet[1].addCurrency(quantity);
					else
						wallet[2].addCurrency(quantity);
					
					return true;
				}
				else
				{
					System.out.println("No balance");
					return false;
				}
			
		}
		else if(payment instanceof CreditCard)
		{
	
				CreditCard ca=(CreditCard)payment;
				details= ca.getCardType();
				currentBalance=details.get(ca.getBankName());
				
				if(currentBalance > amount)
				{
					System.out.println("Success");
					currentBalance -= amount;
					details.put(ca.getBankName(), currentBalance);
					
					if(currency.equalsIgnoreCase("bitcoin"))
						wallet[0].addCurrency(quantity);
					else if(currency.equalsIgnoreCase("ethereum"))
						wallet[1].addCurrency(quantity);
					else
						wallet[2].addCurrency(quantity);
					
					return true;
				}
				else
				{
					System.out.println("No balance");
					return false;
				}
			
		}
	
		return false;
		
	}
	
	public boolean sellCurrency(User user, Payment payment, int amount , double quantity,
			String currency, Wallet [] wallet) {
		
		//yet to implement wallet
		
		
		HashMap<String, Double> details;
		double currentBalance =0;
		
		if(payment instanceof BankAccount)
		{
	
				BankAccount ba=(BankAccount)payment;
				details= ba.getBankAccount();
				currentBalance=details.get(ba.getBankName());
				details.put(ba.getBankName(),currentBalance+=amount );
				
				if(currency.equalsIgnoreCase("bitcoin"))
					wallet[0].subCurrency(quantity);
				else if(currency.equalsIgnoreCase("ethereum"))
					wallet[1].subCurrency(quantity);
				else
					wallet[2].subCurrency(quantity);
				
				return true;
		
		}
		
		else if(payment instanceof CreditCard)
		{
	
				CreditCard ca=(CreditCard)payment;
				details= ca.getCardType();
				currentBalance=details.get(ca.getBankName());
				details.put(ca.getBankName(),currentBalance+=amount );
				
				if(currency.equalsIgnoreCase("bitcoin"))
					wallet[0].subCurrency(quantity);
				else if(currency.equalsIgnoreCase("ethereum"))
					wallet[1].subCurrency(quantity);
				else
					wallet[2].subCurrency(quantity);
				
				
				return true;
	
		}
		
		return false;
	}
	
	public void transactionHistory () 
	{

		
	}
	public void convert()
	{
		
	}
		
	
}
