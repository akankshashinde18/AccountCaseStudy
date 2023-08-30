package case_study_ac;
import java.util.*;


abstract class Account {
     int accountNumber;
     static double balance;
     double accountName;
       
     Account(int accountNumber, double balance, double minimumBalance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountName = minimumBalance;
    }
    
    public Account(int accountNumber2, double balance2, String string) {
		// TODO Auto-generated constructor stub
	}

	void displayAccountDetails() {
    System.out.println("Account Name: " + accountName);
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Balance: Rs. " + balance);
}
    
    public abstract void Deposit(double amount);

	public abstract void Withdraw(double amount);
    
    
    void calculateInterest() {
        double interestRate = 0.05;  // Assuming 5% interest rate
        double interest = balance * interestRate;
        balance += interest;
    }
    
    @Override
	public String toString() {
		System.out.println(  " Account Name:" + accountName + ",Account Number:" + accountNumber +  " , Balance:" + balance);

		return null;
	}
}



