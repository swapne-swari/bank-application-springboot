package com.bank.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sdfcBank")
public class BankEntity {
	@Id
	private int account_number;
	private String user_name;
	private String password;
	private long mobile_number;
	private String email;
	private String address;
	private double amount;
	private boolean account_status;
	public BankEntity() {
		super();
		
	}
	public BankEntity(int account_number, String user_name, String password, long mobile_number, String email,
			String address, double amount, boolean account_status) {
		super();
		this.account_number = account_number;
		this.user_name = user_name;
		this.password = password;
		this.mobile_number = mobile_number;
		this.email = email;
		this.address = address;
		this.amount = amount;
		this.account_status = account_status;
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
	public boolean isAccount_status() {
		return account_status;
	}
	public void setAccount_status(boolean account_status) {
		this.account_status = account_status;
	}
	@Override
	public String toString() {
		return "BankEntity [account_number=" + account_number + ", user_name=" + user_name + ", password=" + password
				+ ", mobile_number=" + mobile_number + ", email=" + email + ", address=" + address + ", amount="
				+ amount + ", account_status=" + account_status + "]";
	}
	
}
