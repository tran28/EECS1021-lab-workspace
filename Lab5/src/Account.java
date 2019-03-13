
public class Account {
	String owner;
	char type;
	double balance;
	
	Account(String owner, char type, double balance){
		this.owner = owner;
		this.type = type;
		this.balance = balance;
	}
	Account(String owner, char type){
		this.owner = owner;
		this.type = type;
		balance = 0;
	}
	
	double getBalance() {
		double balance = 0.0;
		balance = this.balance;
		return balance;
	}
	String getDescription() {
		String description = "";
		description = "International account with owner " + owner + " has current balance " + balance;
		return description;
	}
	
	void setBalance(double balance) {
		this.balance = balance;
	}
	void deposit(double deposit) {
		if(type == 'i') {
			balance += deposit - 0.1 * deposit;
		}
		else {
			balance += deposit;
		}
	}
	void withdraw(double withdraw) {
		if(type == 'i') {
			balance -= withdraw + 0.1 * withdraw;
		}
		else {
			balance -= withdraw;
		}
	}
	void transferTo(Account a, double amount) {
		if(type == 'i') {
			balance -= amount + 0.1 * amount;
			if(a.type == 'i') {
				a.balance += amount - 0.1 * amount;
			}
			else{
				a.balance += amount;
			}
		}
		else {
			balance -= amount;
			if(a.type == 'i') {
				a.balance += amount - 0.1 * amount;
			}
			else{
				a.balance += amount;
			}
		}
	}
}
