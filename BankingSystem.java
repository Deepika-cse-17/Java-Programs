//Name: DHEEPTHI K B 
//Reg no: 2117240020085

interface BankingService{
     public void deposit(double amount);
     public  void withdraw(double amount);
     public double getBalance();
}
class Account implements BankingService{
	private double balance;
	public Account(double balance) {
		balance=balance;
	}
	
	public void deposit(double amount) {
	  if(amount<0) {
		  System.out.println("Invalid amount");
	  }
	  else {
		balance+=amount;
		System.out.println("Balance= "+balance);
	  }
	}
	
	
	public void withdraw(double amount) {
		 if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Balance " + balance);
	        } else {
	            System.out.println("Insufficient funds");
	        }
	}
	
	public double getBalance() {
        return balance;
    }
}

class Transaction {
	
	    String type;
	    double amount;

	    public Transaction(String type, double amount) {
	        this.type = type;
	        this.amount = amount;
	    }

	    public void show() {
	        System.out.println("Transaction recorded");
	    }
}


public class BankingSystem {
    public static void main(String[] args) {
    	Account o1=new Account(0);
    	o1.deposit(1000);
    	System.out.println();
    	o1.withdraw(500);
    	System.out.println();
    	Account o2=new Account(1000);
    	o2.withdraw(1500);
    	System.out.println();
    	o1.deposit(-900);
    	System.out.println();
    	
    	Transaction t=new Transaction("deposit",1000);
    	t.show();
    	System.out.println();
    	
    	System.out.println("Name: DHEEPTHI K B ");
		System.out.println("Reg no: 2117240020085");
		
		
    }
}