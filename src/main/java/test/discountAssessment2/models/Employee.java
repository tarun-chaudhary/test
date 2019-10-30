package test.discountAssessment2.models;

public class Employee extends Person {

	@Override
	public void applyPercentageDiscount() {
		this.billAmount = this.billAmount - (((this.billAmount - this.groceriesAmount) * 30) / 100);
	}

}
