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
	 * Créer une instance pour la classe journal 
	 */
	private static Journal instance;
	
	public Journal(){
		this.log = new StringBuffer();
	}
	
	/**
	 * Accesseur
	 * @return instance
	 */
	public static synchronized Journal getInstance(){
		if (instance == null){
			instance = new Journal();
		}
		return instance;
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
