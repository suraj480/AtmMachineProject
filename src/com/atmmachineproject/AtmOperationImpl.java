package com.atmmachineproject;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterface {
Atm atm=new Atm();
Map<Double,String> ministatement=new HashMap<>();
	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("Available balance is:"+ atm.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withDrawAmount) {
		if(withDrawAmount<=atm.getBalance()) {
			if((withDrawAmount %500)==0) {
			ministatement.put(withDrawAmount,"Amount withdrawn");
			System.out.println("Collect the cash"+withDrawAmount);	
			atm.setBalance(atm.getBalance()-withDrawAmount);
			viewBalance();}else {
				System.out.println("please enter amount multiple of 500");
			}
		}else {
			System.out.println("Insufficient balance");
		}
		
	}

	@Override
	public void depositAmount(double depositAmount) {
		ministatement.put(depositAmount,"Amount deposited");
	System.out.println(depositAmount +"Depositted successfully");	
	atm.setBalance(atm.getBalance()+depositAmount);
	viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		for(Map.Entry<Double,String>m:ministatement.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		
	}

}
