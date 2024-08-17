package BankDetails;

public class ATM {
	private double balance;
	private double depositAmount;
	private double withdrawAmount;

	public ATM() {

	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	public double getWithdrawAmount() {
		return withdrawAmount;
	}
}

