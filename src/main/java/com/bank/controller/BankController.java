package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bank.model.BankEntity;
import com.bank.model.BankModel;
import com.bank.service.BankService;

@Controller
public class BankController {
@Autowired
private BankService service;

@RequestMapping("/")
public String homePage() {
	
	return "home";
}
@RequestMapping("/newAccount")
public String accountOpenForm(ModelMap model) {
	BankModel bankModel=new BankModel();
	model.put("bank", bankModel);
	return "newAccount";
      }
@RequestMapping("/saveAccount")
@ResponseBody
public String saveAccount(@ModelAttribute BankEntity bank,@RequestParam String confirm_password, @RequestParam String password, ModelMap model) {
	bank=service.newAccount(bank,confirm_password, password);
	if(bank!=null) {
	return "your account opening form accpted....."
			+ "please visit once branch within month to do KYC ";}
	else
		 return "you entered wrong details go back and enter correct details";
	
}
@RequestMapping("/balance")
public String balanceViewForm() {
	return "balance";
}
@RequestMapping("/balanceCode")
public String showBalance(@RequestParam int account_number, @RequestParam String password, ModelMap model) {
	model.put("balance", service.viewBalance( account_number, password));
	return "balanceCode";
}
@RequestMapping("/deposit")
public String depositForm() {
	return "deposit";}
@RequestMapping("/depositCode")
public String depositAmountShow(@RequestParam int  account_number,@RequestParam double deposit, ModelMap model)
{ /* // model.put("before", bank.getAmount());
    model.put("after",service.deposit(bank, account_number, deposit));
	return "viewDeposit";*/
	
	       
	        
	        BankEntity updatedBankEntity = service.deposit(account_number, deposit);

	       // model.addAttribute("before", previousBalance);
	        model.addAttribute("after", updatedBankEntity);
	        return "viewDeposit";
	    }
	@RequestMapping("/withdraw")
	public String withdrawForm() {
		return "withdraw";
	}
	@RequestMapping("/withdrawled")
	public String withdrawnMethod(@RequestParam int account_number, @RequestParam double withdraw, Model model) {
        
		BankEntity after=service.withdraw(withdraw, account_number);
		model.addAttribute("after", after);
		return"afterWithdraw";
	}
	@RequestMapping("/transfer")
	public String transferForm() {
		return "transfer";
	}
@RequestMapping("/transferCode")
public String transferMethod(BankEntity bank,@RequestParam int sender_account_number,@RequestParam int reciver_account_number,@RequestParam double tf_amount,ModelMap model) {
bank=service.transfer(bank, sender_account_number, reciver_account_number, tf_amount);
model.put("after", bank);
	return "transferCode";
}
@RequestMapping("/closeAccount")
public String closeForm() {
	return "closeAccount";
}
@RequestMapping("/close")
@ResponseBody
public String closeAcc(@RequestParam int account_number,@RequestParam boolean account_status) {
	service.closeAccount(account_number, account_status);
	return "Account closed";
}
@RequestMapping("/about")
public String aboutPage() {
	return "about";
}
}


