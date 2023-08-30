package case_study_ac;
	
//Loan Account class
abstract class LoanAccount extends Account {
  double loanAmount;
  static double repaid_amount = balance;
 public LoanAccount(int accountNumber, double balance, double minimumBalance, double loanAmount) {
     super(accountNumber, balance, minimumBalance);
     this.loanAmount = loanAmount;
 }
 
 @Override
 void calculateInterest() {
     double interestRate = 0.1;  // Assuming 10% interest rate
     double interest = balance * interestRate;
     balance += interest;
 }
 
 @Override
	public void Deposit(double amount) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void Withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}

 
 public void printPaidAmount(double amount) {
		repaid_amount=repaid_amount+amount;
		System.out.println("Current Balance:" +repaid_amount);
	}
 
 @Override
	public String toString() {
		System.out.println(  " Account Name:" + accountName + ",Account Number:" + accountNumber +  " , Balance:" + balance);

		return null;
	}

}