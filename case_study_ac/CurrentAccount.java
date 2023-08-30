package case_study_ac;

abstract class CurrentAccount extends Account {
static Object repaid_amount1;
static int repaid_amount;
public CurrentAccount(int accountNumber, double balance, int accountName) {
   super(accountNumber, balance, "Current Account");
   //this.overdraftLimit = overdraftLimit;
}

@Override
void displayAccountDetails() {
   System.out.println("Account Name: " + accountName);
   System.out.println("Account Number: " + accountNumber);
   System.out.println("Balance: Rs. " + balance);
   
}

@Override
void calculateInterest() {
   double interestRate = 0.02;  // Assuming 2% interest rate
   double interest = balance * interestRate;
   balance += interest;
}


public static void PrintpaidAmount(int amt) {
	repaid_amount1 = ("repaid_amount1" + amt);
	System.out.println("Current Balance:"+repaid_amount1);
}


@Override
public String toString() {
	System.out.println(  " Account Name:" + accountName + ",Account Number:" + accountNumber +  " , Balance:" + balance);

	return null;
}
}

   
  


