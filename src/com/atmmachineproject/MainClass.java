package com.atmmachineproject;
import java.util.Scanner;
public class MainClass {
public static void main(String args[]) {
	AtmOperationInterface op = new AtmOperationImpl();
	int atmnumber=123;
	int atmPin =123;
	Scanner sc= new Scanner(System.in);
	System.out.println("*****Welcome to Atm Machine !!*****");
	System.out.println("Enter Atm number :");
	int atmNumber =sc.nextInt();
	System.out.println("Enter Atm Pin :");
	int pin =sc.nextInt();
	if((atmnumber==atmNumber)&& (atmPin==pin)) {
		System.out.println("Validation Done");
		while(true) {
			System.out.println("1.View Available balance \n2.Withdraw Amount \n3.Deposit Amount \n4.View Ministatement \n5.Exit");
			System.out.println("Enter choice :");
			int choice =sc.nextInt();
			switch(choice) {
			case 1:
				op.viewBalance();
				break;
			case 2:
				System.out.println("Enter Amount to withdraw :");
				double withdrawAmount=sc.nextDouble();
				op.withdrawAmount(withdrawAmount);
				break;
			case 3:
				System.out.println("Enter Amount to deposit :");
				double depositAmount=sc.nextDouble();
				op.depositAmount(depositAmount);
				break;
			case 4:
				op.viewMiniStatement();
				break;
			case 5:
				System.out.println("Collect your Atm card thank you for using :");
				System.exit(0);
				default:
					System.out.println("Please enter correct choice");
			}
		}
	}else {
		System.out.println("Incorrect Atm number or pin");
        System.exit(0);
	}
}
}
