package oopIntro;

public class Product {

	// boþ constructor
	public Product() { // constructor (yazmasak bile bu mevcuttur)
		System.out.println("Ben Çalýþtým");
	}
	
	// overloading
	public Product(int id,String name,double unitPrice,String detail) {  	//( same method - diff parameter #)
		this(); // boþ constructor'ý bu þekilde çalýþtýrabiliriz.
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	// bir constructor çalýþmak zorunda - birden fazla constructor 	 
	// varsa yazdýðýmýza göre overload yaptýðýmýz çalýþýr.
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
	
}
