package test.discountAssessment2.models;

public abstract class Person {
	protected double billAmount;
	protected double groceriesAmount;
	protected boolean oldCustomer = false;

	public abstract void applyPercentageDiscount();

	public void applyAmountDiscount() {
		double discountTimes = this.billAmount / 100;
		for (int i = 0; i < discountTimes; i++) {
			this.billAmount -= 5;
		}
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public double getGroceriesAmount() {
		return groceriesAmount;
	}

	public void setGroceriesAmount(double groceriesAmount) {
		this.groceriesAmount = groceriesAmount;
	}

	public boolean isOldCustomer() {
		return oldCustomer;
	}

	public void setOldCustomer(boolean oldCustomer) {
		this.oldCustomer = oldCustomer;
	}

}
