package com.atm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Mainclass_ATM {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String AccountHolderName;
		double Password;
		int AccountNumber;
		ATM_Impl impl=new ATM_Impl();
		System.out.println("ATM INTERFACE");
		System.out.println("\n1.Login:");
		System.out.println("\n2.Exit");
		System.out.println("\n Enter your Choice");
		int key=ip.nextInt();
		if(key==1) {
			
			System.out.println("Enter your name here:");
			AccountHolderName = ip.next();
			System.out.println("Enter your password here:");
			Password = ip.nextDouble();
			System.out.println("Enter Account Number only last 4 digits:");
			AccountNumber = ip.nextInt();
			System.out.println("Login completed.");
			while(true) {
			System.out.println("\nATM INTERFACE");
			System.out.println("\n1.Withdraw:");
			System.out.println("\n2.Balance:");
			System.out.println("\n3.Deposit:");
			System.out.println("\n4.Tranfer:");
			System.out.println("\n5.Transection History");
			System.out.println("\n4.Exit:");
			System.out.println("\nEnter your choice:");
			
			int Choice = ip.nextInt();
			switch (Choice) {
			case 1: {
				impl.Withdraw();
				break;
				
			}
			case 2:{
				impl.balance();
				break;
			}
			case 3:{
				impl.deposite();
				break;
			}
			case 4:{
				impl.transfer();
				break;
			}
			case 5:{
				impl.transectionhistory();
				break;
			}
			case 6:{
				System.exit(0);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + Choice);
			}
			}
			
		}
		else if(key==2) {
			System.exit(0);
		}
		else {
			System.out.println("Invalid Choice");

		}
	}

}
