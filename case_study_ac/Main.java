package case_study_ac;
import java.util.Scanner;


import case_study_ac.Account;

public class Main {
    
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] acc = new Account[10];

       
      int choice;
        
        do {
            System.out.println("********** XYZ Bank **********");
            System.out.println("1. Open an account");
            System.out.println("2. Display account details");
            System.out.println("3. Perform over-the-counter activities");
            System.out.println("4. Calculate interest");
            System.out.println("5. Generate end-of-day report");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println();
            
            Account[] accounts = null;
			int accountNumber;
			switch (choice) {
                case 1:
                	int subchoice;
				boolean operationChoice = false;
				do {
                    System.out.println("********** Open an account **********");
                    System.out.println("1. Savings Account");
                    System.out.println("2. Salary Account");
                    System.out.println("3. Current Account");
                    System.out.println("4. Loan Account");
                    System.out.print("Enter the account type: ");
                    int accountTypeChoice = scanner.nextInt();
                    
                    System.out.print("Enter the account number: ");
                    int accountNumber1 = scanner.nextInt();
                    
                    System.out.print("Enter Your Name: ");
                    String savingaccountName = scanner.next();
                   
                      
                    
                    switch (accountTypeChoice) {
                        case 1:
                            System.out.print("Enter the minimum balance: ");
                            double minimumBalance = scanner.nextDouble();
                            
                            break;
                        case 2:
                            System.out.print("Enter the initial balance: ");
                            double balance1 = scanner.nextDouble();
                           
                            break;
                        case 3:
                            System.out.print("Enter the overdraft limit: ");
                            double overdraftLimit = scanner.nextDouble();
                            
                            break;
                        case 4:
                            System.out.print("Enter the loan amount: ");
                            double loanAmount = scanner.nextDouble();
                           
                           break;
                        default:
                            System.out.println("Invalid account name!");
                    }
                    System.out.println("Account created successfully!");
                    System.out.println();
				
                	} while (operationChoice);
                	break;
			
                case 2:
                   
                	System.out.println("********** Display account details **********");
                    System.out.print("Enter the account number: ");
                    accountNumber = scanner.nextInt();
                    
                    boolean accountFound = false;
                     for (Account account : accounts) {
                       if (account.accountNumber == accountNumber) {
                            //account.displayAccountDetails();
                            accountFound = true;
                            break;
                        }
                   }
                   if (!accountFound) {
                        System.out.println("Account not found!");
                    
                    System.out.println("---------------------------------------");
                    return;
                    
                    
                    }
                    
                    int operationChoice1  =0;
                     do {
						System.out.println("selection an operation for account" + accountNumber +":");
                    	System.out.println("1. Deposit");
                    	System.out.println("2. Withdraw");
                    	System.out.println("3. Calculate Interest");
                    	System.out.println("4. Display Balance");
                    	System.out.println("5. Exit");
                    	
                    	
						operationChoice1  = scanner.nextInt();
                    	
                    	int opeartionChoice = 0;
						switch(opeartionChoice) {
                    	case 1:
                    		System.out.println("Enter deposite amount:");
                    		double depositeAmount = scanner.nextDouble();
                    		System.out.println("------------------------------");
                    		break;
                    		
                    		
                    	case 2:
                    		System.out.println("Enter withdrawal amount:");
                    		double withdrawalAmount = scanner.nextDouble();
                    		System.out.println("-------------------------------");
                    		break;
                    		
                    	case 3:
                    		System.out.println("calculateIntrest");
                    		System.out.println("------------------------------");
                    		break;
    		
                    	case 4:
                    		System.out.println("Account balance:");
                    		System.out.println("------------------------------------");
                    		break;
                    		
                    	case 5:
                    		System.out.println("Existing account operations.");
                    		System.out.println("---------------------------------");
                    		break;
                    		
                    	default:
                    		System.out.println("Invalid choice please try again...");
                    		System.out.println("------------------------------------");
                    	}
                    } while (operationChoice1 !=0);
                    break;
                case 3:
                    System.out.println("********** Perform over-the-counter activities **********");
                    System.out.print("Enter the account number: ");
                    accountNumber = scanner.nextInt();
                    
                     accountFound = false;
                    for (Account account : accounts) {
                        if (account.accountNumber == accountNumber) {
                            // Perform over-the-counter activities
                            System.out.println("Over-the-counter activities performed for account number: " + accountNumber);
                            accountFound = true;
                            break;
                        }
                    }
                    if (!accountFound) {
                        System.out.println("Account not found!");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("********** Calculate interest **********");
                    System.out.print("Enter the account number: ");
                    accountNumber = scanner.nextInt();
                    
                    accountFound = false;
                    for (Account account : accounts) {
                        if (account.accountNumber == accountNumber) {
                            account.calculateInterest();
                            System.out.println("Interest calculated for account number: " + accountNumber);
                            accountFound = true;
                            break;
                        }
                    }
                    if (!accountFound) {
                        System.out.println("Account not found!");
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("********** Generate end-of-day report **********");
                    // Generate end-of-day report for daily transactions
                    System.out.println("End-of-day report generated successfully!");
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Thank you for using XYZ Bank automation system!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
        
       
    }

	
		
		
	}

	
	
		
	
