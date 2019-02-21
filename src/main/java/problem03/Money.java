package problem03;

public class Money {
	
	private int amount;
	
	public Money(int amount) {
		this.amount = amount;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Money){
			Money money = (Money)obj;
			return amount == money.amount;
		}
		return false;
	}
	
	public Money add(Money money) {
		return new Money(this.amount + money.amount);
	}

	public Money minus(Money money) {
		return new Money(this.amount - money.amount);
	}

	public Money multiply(Money money) {
		return new Money(this.amount * money.amount);
	}

	public Money devide(Money money) {
		return new Money(this.amount / money.amount);
	}
}