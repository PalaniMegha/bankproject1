package BankDetails;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterf {
	ATM atm = new ATM();
	Map<Double, String> ministmt = new HashMap<>();

	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("avaliable balance is  : " + atm.getBalance());
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		// TODO Auto-generated method stub
		if (withdrawAmount % 500 == 0) {
			if (withdrawAmount <= atm.getBalance()) {
				ministmt.put(withdrawAmount, "amount withdraw");
				System.out.println("collect the cash " + withdrawAmount);
				atm.setBalance(atm.getBalance() - withdrawAmount);
				viewBalance();
			} else {
				System.out.println("Insufficient Balance !!!");
			}
		} else {
			System.out.println("please enter the amount in multipal of 500");
		}
	}

	@Override
	public void depositAmount(double depositeAmount) {

		// TODO Auto-generated method stub
		ministmt.put(depositeAmount, "amount deposited");
		System.out.println(depositeAmount + " Deposited Successfully!!");
		atm.setBalance(atm.getBalance() + depositeAmount);
		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		// TODO Auto-generated method stub
		for (Map.Entry<Double, String> m : ministmt.entrySet()) {
			System.out.println(m.getKey() + "" + m.getValue());

		}
	}

//	@Override
//	public void viewBalance(double withdrawAmount) {
//		// TODO Auto-generated method stub

}

	