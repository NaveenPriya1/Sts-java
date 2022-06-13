package problem_statement_4_1;

public class BankMain {

	public static void main(String[] args) throws NegitiveBalanceException, LowBalanceException, InsufficientFundsException {
		
		BankAccount ba = new BankAccount(32264142, "Naveen", "savings", 100000);
		ba.checkBalance();
        ba.deposit(50000);
		ba.checkBalance();
		ba.withdraw(150000);
		
		// the three not executed because exception was already thrown
		ba.checkBalance();
		ba.withdraw(150);
		ba.checkBalance();
		
	}

}
