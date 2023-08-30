package case_study_ac;


abstract class SalaryAccount extends Account {
    private boolean active;
    
    public SalaryAccount(int accountNumber, double balance, double minimumBalance) {
        super(accountNumber, balance, minimumBalance);
        active = true;
    }
    
    @Override
    void calculateInterest() {
        // No interest calculation for salary account
    }
    
    public void checkActivity() {
        // Code to check if any transactions have occurred in the last two months
        if (active) {
            System.out.println("Account is active.");
        } else {
            System.out.println("Account is frozen. Please contact the bank.");
        }
    }
}

        
       
