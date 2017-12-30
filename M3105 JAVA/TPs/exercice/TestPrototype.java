package exercice;

public class TestPrototype {

	public static void main(String[] args) {
		Patronyme moi = new Patronyme("Leblanc","Hervé");
		Personne hervé = new Personne(51,moi);
		Enfant arthur = new Enfant(23,moi.clone(), new Jouet("caméra"));
		arthur.getPatronyme().setPrénom("Arthur");
		System.out.println(hervé);
		System.out.println("premier Arthur");
		System.out.println(arthur);
		Enfant vincent = arthur.clone();
		vincent.getPatronyme().setPrénom("Vincent");
		System.out.println(vincent);
		vincent.setJouetPréféré(new Jouet("Nintendo"));
		System.out.println(vincent);
		System.out.println("deuxième Arthur");
		System.out.println(arthur);
	}

}
