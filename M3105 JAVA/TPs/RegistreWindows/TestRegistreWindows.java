package Singleton;

public class TestRegistreWindows {

	public static void main(String[] args) {
		RegistreWindows unRegistre = RegistreWindows.getInstance();
		System.out.println(unRegistre);
		
		RegistreWindows deuxRegistre = RegistreWindows.getInstance();
		deuxRegistre.setNom("pas par d�faut");
		System.out.println(deuxRegistre);
		System.out.println(unRegistre);
	}

}
