package oopIntro;

public class Product {

	// bo� constructor
	public Product() { // constructor (yazmasak bile bu mevcuttur)
		System.out.println("Ben �al��t�m");
	}
	
	// overloading
	public Product(int id,String name,double unitPrice,String detail) {  	//( same method - diff parameter #)
		this(); // bo� constructor'� bu �ekilde �al��t�rabiliriz.
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	// bir constructor �al��mak zorunda - birden fazla constructor 	 
	// varsa yazd���m�za g�re overload yapt���m�z �al���r.
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
	
}
