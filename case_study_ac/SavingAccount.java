package case_study_ac;

abstract class SavingsAccount extends Account {
  int minimumBalance = 10000;
  
 public SavingsAccount(int accountNumber, double balance, double minimumBalance) {
     super(accountNumber, balance, "Savings Account");
     this.minimumBalance = (int) minimumBalance;
 }
 
 @Override
 void displayAccountDetails() {
	System.out.println("Account Name: " + accountName);
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance: Rs. " + balance);
 }
 
 @Override
 void calculateInterest() {
     double interestRate = 0.05;  // Assuming 5% interest rate
     double interest = balance * interestRate;
     balance += interest;
 }
 
 @Override
	public void Deposit(double amount) {
		balance = balance + amount;
		System.out.println("Enter the amount you want to deposit:" + amount);
		System.out.println("Balance after deposit:" + balance);
	}

	@Override
	public void Withdraw(double amount) {
		double overdraft =10;
		if (balance - amount > overdraft ) {
			balance = balance - amount;
			System.out.println("Balance after withdrawl:" + balance);

		} else {
			System.out.print("Transaction failed!!");

		}}
 
 @Override
	public String toString() {
		System.out.println(  " Account Name:" + accountName + ",Account Number:" + accountNumber +  " , Balance:" + balance);

		return null;
	}
}

     
    

