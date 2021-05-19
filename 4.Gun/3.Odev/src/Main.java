
public class Main {

	public static void main(String[] args) {
		
		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("H�seyin Sefa");
		gamer.setLastName("Ceren");
		gamer.setEmail("h.sefaceren@gmail.com");
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.createAccount(gamer);
		gamerManager.updateAccount(gamer);
		gamerManager.validateAccount(gamer);
		gamerManager.deleteAccount(gamer);
		
		SellerManager sellerManager = new SellerManager();
		sellerManager.sellGame(gamer);
		
		// Yeni kampanya t�r� olu�turuldu�unda hi�bir �eyi de�i�tirmemize gerek kalm�yor.
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.baseCampaignManager = new YeniCampaign();
		campaignManager.createCampaign();
		
		
	
		

	}

}
