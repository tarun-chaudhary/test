package test.discountAssessment2.models;

public class Affilliate extends Person {

	@Override
	public void applyPercentageDiscount() {
		this.billAmount = this.billAmount - (((this.billAmount - this.groceriesAmount) * 10) / 100);
	}

}
