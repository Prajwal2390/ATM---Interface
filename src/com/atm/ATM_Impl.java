package com.atm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM_Impl implements ATMInterface{
	
	int deposit;
	int balance = 80000;
	double Withdraw;
	Integer Transaction = 0;
	double Password;
	String AccountHolderName;
	Integer AccountNumber;
	double amount;
	List<String> TransactionHistory = new ArrayList<>();
	String ifsc=null;

	@Override
	public void Withdraw() {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the amount to be withdrawn:");
		 amount = ip.nextDouble();
		try {
			if (balance >= amount) {
				balance -= amount;
				System.out.println("Withdrawal Successfully done");
				String remove = ""+ amount ;
				TransactionHistory.add("-"+remove);
			} else {
				System.out.println("Insufficient Balance.");
			}
		} catch (Exception e) {
		}	
	}
	@Override
	public void balance() {
		System.out.println("Balance : " + balance);
	}
	@Override
	public void deposite() {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter money to be deposited:");
		deposit = ip.nextInt();
		balance = balance + deposit;
		System.out.println("Your Money has been successfully depsited");
		TransactionHistory.add("+"+deposit);
		System.out.println("");
	}
	@Override
	public void transfer() {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter account holder's name:");
		AccountHolderName=ip.next();
		System.out.println("Enter the IFSC code");
		ifsc=ip.next();
		System.out.println("Enter the amount to be transferred:");
		 amount = ip.nextDouble();
		try {
			if (balance >= amount) {
				if (amount <= 80000.00) {
					Transaction++;
					balance -= amount;
					System.out.println("Amount successfully transferred to:" +AccountHolderName);
					String string = "Rs" + amount + "transferred";
					TransactionHistory.add("-"+amount);
				} else
					System.out.println("Sorry it has gone failed");
			} else
				System.out.println("Insufficient balance.");
		} catch (Exception e) {
		}
		}
	@Override
	public void transectionhistory() {
		for(String trans:TransactionHistory) {
			System.out.println(trans);
		}
		System.out.println("Current balance :"+balance);
	}
}
