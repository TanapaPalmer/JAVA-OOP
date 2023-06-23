class TestBankAccount {

	// Create a 'TestBankAccount' class to test each BankAccount method you have created
	
    public static void main(String[] args) {
		BankAccount account = new BankAccount();


        System.out.println("ACCOUNT NUMBER: " + account.getAccountNumber());
		String AccountNameOne = account.AccountName ("THOMAS LEE");
        System.out.println("ACCOUNT NAME: " + AccountNameOne);
		account.deposit(350.20, "SAVINGS");
		account.deposit(500.50, "CHECKING");
		account.displayEachAccounts();
		account.withdraw(50, "SAVINGS");
		account.withdraw(50, "CHECKING");
		account.displayEachAccounts();
		account.displayAllAccounts();

		System.out.println("---------------------------------------");

        BankAccount secondAccount = new BankAccount();
        System.out.println("ACCOUNT NUMBER: " + secondAccount.getAccountNumber());
		String AccountNameTwo = account.AccountName ("SABRINA SAMS");
		System.out.println("ACCOUNT NAME: " + AccountNameTwo);
		secondAccount.deposit(20.40, "SAVINGS");
		secondAccount.deposit(400.25, "CHECKING");
		secondAccount.displayEachAccounts();
        secondAccount.withdraw(50, "SAVINGS");
		secondAccount.withdraw(50, "CHECKING");
		secondAccount.displayEachAccounts();
		secondAccount.displayAllAccounts();

		System.out.println("---------------------------------------");
	}
}