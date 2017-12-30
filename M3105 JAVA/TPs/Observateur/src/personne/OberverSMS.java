package personne;

public class OberverSMS {

	public void update(Subject s) {
		Agence n = (Agence) s;
		if (!n.getAfter().getDernierArticle().equals(n.getBefore().getDernierArticle()))
			System.out.println("Nouvelle notif sms :" + n.getAfter().getDernierArticle()); 
	}
}

