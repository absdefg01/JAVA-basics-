package Journalisation;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ZHAO Mengzi
 * S3-GroupeA
 */
public class Journal {

	private StringBuffer log;
	
	/**
	 * Créer 2 instances
	 */
	private static Journal instance;
	private static Journal instance2;
	
	public Journal(){
		this.log = new StringBuffer();
	}
	
	/**
	 * accesseur
	 * @return instance
	 */
	public static synchronized Journal getInstance(){
			if (instance == null){
				instance = new Journal();
			}
		return instance;
	}
	
	/**
	 * Accesseur
	 * @return la deuxième instance
	 */
	public static synchronized Journal getInstance2(){
		if (instance2 == null){
			instance2 = new Journal();
		}
		return instance2;
	}
	

	public void ajouterLog(String log) {
		Date d = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH'h'mm'm'ss's'SSS");
		this.log.append("[" + dateFormat.format(d) + "] " + log + "\n");
	}

	@Override
	public String toString() {
		return this.log.toString();
	}	
}
