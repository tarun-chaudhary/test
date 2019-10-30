package test.discountAssessment2.models;

public class Customer extends Person {

	@Override
	public void applyPercentageDiscount() {
		if (oldCustomer)
			this.billAmount = this.billAmount - (((this.billAmount - this.groceriesAmount) * 5) / 100);
	}

}
