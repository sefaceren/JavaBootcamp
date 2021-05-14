package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer sefa = new IndividualCustomer();
		sefa.customerNumber = "12345";
		
		
		CorporateCustomer halkbank = new CorporateCustomer();
		halkbank.customerNumber = "898885";
		
		
		SendikaCustomer sendika1 = new SendikaCustomer();
		sendika1.customerNumber = "1231241";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {sefa,halkbank,sendika1};
		
		customerManager.addMultiple(customers);

	}

}
