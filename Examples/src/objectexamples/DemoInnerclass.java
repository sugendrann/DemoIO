package objectexamples;

import java.util.Scanner;

public class DemoInnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount(20000);
		b.contact(10);
		

	}

}

class BankAccount
{
	double balance;
	public BankAccount(double b) {
		balance = b;
	}
	void contact(double r)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your password:");
		String name = sc.next();
		if(name.equals("sugi123"))
		{
			Interest in = new Interest(r);
			in.calculateInterest();
		}
		sc.close();
	}
	private class Interest
	{
		private double rate;
		Interest(double r)
		{
			rate=r;
		}
		void calculateInterest()
		{
			double interest = balance*rate/100;
			balance = balance+interest;
			System.out.println("Update Balance:"+balance);
		}
	}
}
