package com.bank.service;

import com.bank.model.BankEntity;

public interface BankService {
public BankEntity newAccount(BankEntity bank,String confirm_password,String password);
public BankEntity viewBalance(int account_number,String password);
public BankEntity deposit( int account_number, double deposit);
public BankEntity withdraw(double withdraw, int account_number);
public BankEntity transfer(BankEntity bank, int sender_account_number, int reciver_account_number,double tf_amount);
public void closeAccount(int account_number,boolean account_status);
}
