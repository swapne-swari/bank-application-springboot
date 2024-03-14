package com.bank.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.BankEntity;

import com.bank.repo.BankRepo;
@Service
public class BankServiceImp implements BankService {
@Autowired
private BankRepo repo;


	@Override
	public BankEntity newAccount(BankEntity bank,String confirm_password,String password) {
		
		if(password.equals(confirm_password)) {
			bank.setPassword(password);
			return repo.save(bank);
		}
		else {
			return null;
		}
		
		
	}

	@Override
	public BankEntity viewBalance(int account_number, String password) {
		BankEntity bank=repo.findById(account_number).orElseThrow();
		 
		if(bank!=null && account_number==bank.getAccount_number()&& password.equals(bank.getPassword()))
		{bank=repo.findById(account_number).get();
		return bank;}
		else 
			return  null;
	}

	@Override
	public BankEntity deposit( int account_number, double deposit) {
		BankEntity bank=repo.findById(account_number).orElse(null);
		if(bank!=null&& deposit>0) {
		bank.setAmount(bank.getAmount()+deposit);
	 return repo.save(bank);}
		else 
			return null;
	}

	@Override
	public BankEntity withdraw(double withdraw, int account_number ) {
		
BankEntity bank=repo.findById(account_number).orElse(null);
		if(bank!=null&& withdraw<=bank.getAmount()) {
		bank.setAmount(bank.getAmount()-withdraw);
	 return repo.save(bank);}
		else 
			return null;
	}

	@Override
	public BankEntity transfer(BankEntity bank, int sender_account_number, int reciver_account_number,double tf_amount) {
		BankEntity sender=repo.findById(sender_account_number).orElse(null);
		BankEntity reciever=repo.findById(reciver_account_number).orElse(null);
		if(sender!=null && reciever!=null && tf_amount<=sender.getAmount()&& tf_amount>0) {
		reciever.setAmount(reciever.getAmount()+tf_amount);
		sender.setAmount(sender.getAmount()-tf_amount);
		return repo.save(sender);}
		else
			return null;
	}

	@Override
	public void closeAccount(int account_number, boolean account_status) {
		BankEntity active=repo.findById(account_number).orElse(null);
		if(active!=null) {
		active.setAccount_status(account_status);
		repo.save(active);}
		



	}

}
