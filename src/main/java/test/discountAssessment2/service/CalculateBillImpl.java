package test.discountAssessment2.service;

import org.springframework.stereotype.Service;

import test.discountAssessment2.models.Affilliate;
import test.discountAssessment2.models.Customer;
import test.discountAssessment2.models.Employee;
import test.discountAssessment2.models.Person;

@Service
public class CalculateBillImpl implements CalculateBill {
	/**
	 * This method find the bill amount after application of discount
	 * 
	 * @param customerType
	 *            accepts employee, customer, affilliate as values in string
	 * @param billAmount
	 *            total bill amount
	 * @param groceriesAmount
	 *            groceries amount in bill amount
	 * @param customerSince
	 *            time period since customer is with company
	 * @return final bill amount
	 */
	public double findBill(String customerType, double billAmount, double groceriesAmount, double customerSince) {
		
		if(billAmount<groceriesAmount){
			throw new RuntimeException("groceriesAmount cant be greater than billAmount");
		}
		
		customerType = customerType.toLowerCase();
		Person person = null;
		switch (customerType) {
		case "employee":
			person = new Employee();
			break;
		case "affilliate":
			person = new Affilliate();
			break;
		case "customer":
			person = new Customer();
			break;
		default:
			break;
		}

		if (person == null) {
			return 0;
		}

		person.setBillAmount(billAmount);
		person.setGroceriesAmount(groceriesAmount);
		if (customerSince >= 2) {
			person.setOldCustomer(true);
		}

		person.applyPercentageDiscount();
		person.applyAmountDiscount();

		return person.getBillAmount();
	}

}
