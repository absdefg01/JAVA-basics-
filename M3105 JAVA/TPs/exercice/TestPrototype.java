package exercice;

public class TestPrototype {

	public static void main(String[] args) {
		Patronyme moi = new Patronyme("Leblanc","Herv�");
		Personne herv� = new Personne(51,moi);
		Enfant arthur = new Enfant(23,moi.clone(), new Jouet("cam�ra"));
		arthur.getPatronyme().setPr�nom("Arthur");
		System.out.println(herv�);
		System.out.println("premier Arthur");
		System.out.println(arthur);
		Enfant vincent = arthur.clone();
		vincent.getPatronyme().setPr�nom("Vincent");
		System.out.println(vincent);
		vincent.setJouetPr�f�r�(new Jouet("Nintendo"));
		System.out.println(vincent);
		System.out.println("deuxi�me Arthur");
		System.out.println(arthur);
	}

}
