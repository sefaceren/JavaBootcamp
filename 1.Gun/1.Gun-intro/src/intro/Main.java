package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't repeat yourself
		String internetSubeButonu = "?nternet ?ubesi";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar D??t? Resmi");
		}else if (dolarBugun>dolarDun) {
			System.out.println("Dolar Y?kseldi Resmi");
		}else {
			System.out.println("Dolar E?ittir Resmi");
		}
		
		String kredi1 = "H?zl? Kredi";
		String kredi2 = "Tar?m Kredi";
		String kredi3 = "Konut Kredi";
		String kredi4 = "Ta??t Kredi";
		String kredi5 = "Motor Kredi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		
		String[] krediler = {
			"H?zl? Kredi",
			"Tar?m Kredi",
			"Konut Kredi",
			"Ta??t Kredi",
			"Motor Kredi"
		};
		
		//foreach
		for(String kredi: krediler) {
			System.out.println(kredi);
		}
		
		for(int i = 0;i< krediler.length ;i++) {
			System.out.println(krediler[i]);
		}
		

	}

}
