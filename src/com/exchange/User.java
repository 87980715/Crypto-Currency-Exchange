package com.exchange;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class User implements Serializable
{
 private String firstName;
 private  String lastName;
 private String  emailID;
 private String password;
 private String[] bankPayment;
 private String[] creditPayemt;
 private int limit;
 private Calendar lastTransaction;
 Wallet[] wallet=new Wallet[3];
 CryptoCurrency[] currency;
 User user;
 
 
 public int getLimit() {
	return limit;
}

public void setLimit(int limit) {
	this.limit = limit;
}

public Calendar getLastTransaction() {
	return lastTransaction;
}

public void setLastTransaction(Calendar lastTransaction) {
	this.lastTransaction = lastTransaction;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmailID() {
	return emailID;
}

public void setEmailID(String emailID) {
	this.emailID = emailID;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public double getRoi() {
	return roi;
}

public void setRoi(double roi) {
	this.roi = roi;
}


private double roi;
 
User()
{
	wallet[0]=new Wallet("bitcoin");
	wallet[1]=new Wallet("ethereum");
	wallet[2]=new Wallet("litecoin");
}
 public void transaction()
 {
	 
	 Transaction transaction=new Transaction(wallet,currency,user);
	// transaction.buyCurrency(100, payment, user, cryptoCurrency)
	
 }

}
