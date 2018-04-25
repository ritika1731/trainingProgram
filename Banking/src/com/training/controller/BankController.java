package com.training.controller;

import com.training.entity.CheckingAccount;
import com.training.entity.FlexibleSavingAccount;
import com.training.entity.SavingAccount;

public class BankController {
	
public static void main(String[] args) {
	
	SavingAccount save=new SavingAccount();
	float depositAmnt=save.deposit(700);
	float balance=save.getBalance();
	System.out.println(balance);
	System.out.println(depositAmnt);
	

	CheckingAccount check=new CheckingAccount();
	float depositAmnt1=check.deposit(700);
	float balance1=check.getBalance();
	System.out.println(balance1);
	System.out.println(depositAmnt1);
	
	FlexibleSavingAccount flex=new FlexibleSavingAccount();
	float depositAmnt2=flex.deposit(700);
	float balance2=flex.getBalance();
	System.out.println(balance2);
	System.out.println(depositAmnt2);
}
	
}
