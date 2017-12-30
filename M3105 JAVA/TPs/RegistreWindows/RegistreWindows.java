package Singleton;

public class RegistreWindows {
	private static RegistreWindows instance;
	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	private RegistreWindows(String nom) {
		this.nom = nom;
	}
	
	public static synchronized RegistreWindows getInstance()
	{
		if (instance == null)
			instance = new RegistreWindows("par défaut");

		return instance;
	}

	@Override
	public String toString() {
		return "RegistreWindows [nom=" + nom + "]";
	}
	
}
