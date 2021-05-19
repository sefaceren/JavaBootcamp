public class Main {

    public static void main(String[] args) {
	WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
	womanGameCalculator.hesapla();
	womanGameCalculator.gameOver();

	// abstract sınıflardan instance oluşturulamaz.

		GameCalculator gameCalculator = new WomanGameCalculator();




    }
}
