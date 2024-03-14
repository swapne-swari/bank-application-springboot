package com.bank.model;

public class BankModel {
private int account_number;
private String user_name;
private String password;
private String confirm_password;
private long mobile_number;
private String email;
private String address;
private double amount;
public BankModel(int account_number, String user_name, String password, String confirm_password, long mobile_number,
		String email, String address, double amount) {
	super();
	this.account_number = account_number;
	this.user_name = user_name;
	this.password = password;
	this.confirm_password = confirm_password;
	this.mobile_number = mobile_number;
	this.email = email;
	this.address = address;
	this.amount = amount;
}
public BankModel() {
	super();
}
public int getAccount_number() {
	return account_number;
}
public void setAccount_number(int account_number) {
	this.account_number = account_number;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirm_password() {
	return confirm_password;
}
public void setConfirm_password(String confirm_password) {
	this.confirm_password = confirm_password;
}
public long getMobile_number() {
	return mobile_number;
}
public void setMobile_number(long mobile_number) {
	this.mobile_number = mobile_number;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "BankModel [account_number=" + account_number + ", user_name=" + user_name + ", password=" + password
			+ ", confirm_password=" + confirm_password + ", mobile_number=" + mobile_number + ", email=" + email
			+ ", address=" + address + ", amount=" + amount + "]";
}

}
