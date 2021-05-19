package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	public void save(Customer customer) {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to Database : " + customer.getFirstName());
		}else {
			System.out.println("Not a valid Person");
		}
		
	}
	
}
