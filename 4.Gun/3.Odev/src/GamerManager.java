
public class GamerManager {
	
	public void createAccount(Gamer gamer) {
		System.out.println("Hesap olu�turuldu." + gamer.getFirstName());
	}
	
	public void updateAccount(Gamer gamer) {
		System.out.println("Hesap G�ncellendi." + gamer.getFirstName());
	}
	
	public void deleteAccount(Gamer gamer) {
		System.out.println("Hesap Silindi." + gamer.getFirstName());
	}
	
	public void validateAccount(Gamer gamer) {
		System.out.println("Hesap do�ruland�." + gamer.getFirstName());
	}

}
