package problem_statement_4_1;

public class BankAccount {
   private int accNo;
   private String custName;
   private String accType;
   private float balance;
    
    
    
    public BankAccount() {
		super();
	}
    
    

	public BankAccount(int accNo, String custName, String accType, float balance) {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		this.balance = balance;
	}
	



	public void deposit(float amt) throws NegitiveBalanceException, LowBalanceException {
    	balance += amt;
    	System.out.println("amount deposited  successfully");
    	System.out.println("your balance is "+balance);
    	if(balance<0) {
    		throw new NegitiveBalanceException();
    	}
    	if(accType=="savings" && balance<1000) {
    		
    		throw new LowBalanceException();
    		
    	}
    	if(accType=="current" && balance<5000) {
    		throw new LowBalanceException();
    	}
    }
    
    public void withdraw(float amt) throws NegitiveBalanceException, LowBalanceException, InsufficientFundsException {
    	balance -= amt;
    	System.out.println("amount withdrawn successfully");
    	System.out.println("your balance is "+balance);
    	if(balance<0) {
    		throw new NegitiveBalanceException();
    	}
    	if(accType=="savings" && balance<1000) {
    		
    		throw new LowBalanceException();
    		
    	}
    	if(accType=="current" && balance<5000) {
    		throw new LowBalanceException();
    	}  
    	
    	if(balance<amt) {
    		throw new InsufficientFundsException();
    	}
    }
    
    public void checkBalance() throws NegitiveBalanceException, LowBalanceException {
    	System.out.println("Your balance is "+balance);
    	
    	if(balance<0) {
    		throw new NegitiveBalanceException();
    	}
    	if(accType=="savings" && balance<1000) {
    		
    		throw new LowBalanceException();
    		
    	}
    	if(accType=="current" && balance<5000) {
    		throw new LowBalanceException();
    	} 
    }
    
}
