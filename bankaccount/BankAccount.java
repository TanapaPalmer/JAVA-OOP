import java.util.Random;


// Create a BankAccount class.
public class BankAccount {

	// The class should have the following attributes: (double) checking balance, (double) savings balance.
	private double checkingBalance;
	private double savingsBalance;


	// Create a class member (static) that has the number of accounts created thus far
	// Create a class member (static) that tracks the total amount of money stored in every account created.
	public static int numberOfAccounts = 0;
	public static double totalAmount = 0;


	// In the constructor, be sure to increment the account count.
	public BankAccount() {
		BankAccount.numberOfAccounts += 1;
		this.checkingBalance = 0;
		this.savingsBalance = 0;
		this.accountNumber = BankAccount.eachUser();
	}


    public int getAccountNumber() {
        return this.accountNumber;
    }


	// Create a getter method for the user's checking account balance
	public double getCheckingAccount() {
		return this.checkingBalance;
	}


	// Create a getter method for the user's saving account balance
	public double getSavingsAccount() {
		return this.savingsBalance;
	}


	// Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
	public void deposit(double amount, String account) {
		if(account.equals("SAVINGS")){
			this.savingsBalance += amount;
			System.out.println(String.format("YOU DEPOSIT: %2f TO SAVINGS ACCOUNT.", amount));
		}
		else if(account.equals("CHECKING")){
			this.checkingBalance += amount;
			System.out.println(String.format("YOU DEPOSIT: %2f TO CHECKING ACCOUNT.", amount));
		BankAccount.totalAmount += amount;
		}
	}


	// Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
	public void withdraw(double amount, String account) {
		boolean successful = false;
		if(account.equals("SAVINGS")) {
			// check if enough in account
			if(this.savingsBalance - amount >= 0) {
				successful = true;
				this.savingsBalance -= amount;
				System.out.println(String.format("YOU WITHDRAW: %2f FROM SAVINGS ACCOUNT", amount));
			}
		}
		else if(account.equals("CHECKING")) {
			if(this.checkingBalance - amount >= 0) {
				successful = true;
				this.checkingBalance -= amount;
				System.out.println(String.format("YOU WITHDRAW: %2f FROM CHECKING ACCOUNT.", amount));
			}
		}
		if(successful) {
			BankAccount.totalAmount -= amount;
		}
        else {
            System.out.println("INSUFFICIENT FUNDS!");
        }
	}


	// Create a method to see the total money from the checking and saving
	public void displayEachAccounts() {
		System.out.println(String.format("SAVINGS: %.2f \nCHECKING: %.2f", this.savingsBalance, this.checkingBalance));
	}

	public void displayAllAccounts() {
		System.out.println(String.format("TOTAL: %.2f", this.savingsBalance + this.checkingBalance));
	}

	// NINJA BONUS: Add the the following class attribute: account number. The type is up to you, can be a String or a Long or another type.
	// NINJA BONUS: Create a private method that returns a random ten digit account number.
	private int accountNumber;

	
	// NINJA BONUS: In the constructor, call the private method from above so that each user has a random ten digit account.
    private static int eachUser() {
		Random rand = new Random();
        int randomAccount = rand.nextInt(1000000000) + 999999999;
		return randomAccount;
	}


	public String AccountName(String name){
		return name;
	}
}