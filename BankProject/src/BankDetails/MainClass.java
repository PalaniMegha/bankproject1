package BankDetails;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtmOperationInterf op = new AtmOperationImpl();
		int atmnumber = 12345;
		int atmpin = 123;

		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Atm Machine!!!");
		System.out.println("Enter Atm number : ");
		int atmNumber = in.nextInt();
		System.out.println("Enter Pin : ");
		int pin = in.nextInt();
		if ((atmnumber == atmNumber) && (atmpin == pin)) {
			while (true) {

				System.out.println(
						"1.View available balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatment\n5.Exit");
				System.out.println("enter choice : ");
				int ch = in.nextInt();
				if (ch == 1) {
					op.viewBalance();
				} else if (ch == 2) {
					System.out.println("enter amount to withdraw");
					double withdrawAmount = in.nextDouble();
					op.withdrawAmount(withdrawAmount);

				} else if (ch == 3) {
					System.out.println("enter amount to deposit : ");
					double depositAmount = in.nextDouble();
					op.depositAmount(depositAmount);
				} else if (ch == 4) {
					op.viewMiniStatement();

				} else if (ch == 5) {
					System.out.println("collect your atm card");
					System.out.println("thankyou for using atm machine");
					System.exit(0);
				} else {
					System.out.println("please enter correct choice");
				}
			}
		} else {
			System.out.println("Incorrect Atm Number or Pin");
			System.exit(0);
		}

	}

}

