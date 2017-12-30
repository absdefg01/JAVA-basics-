package Journalisation;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ZHAO Mengzi
 * S3-GroupeA
 */
public class Journal {

	private StringBuffer log;
	private static final Map<String, Journal> instances = new HashMap<String, Journal>();
	
	public Journal(){
		this.log = new StringBuffer();
	}
	
	/**
	 * méthode Multiton
	 * accesseur
	 * @return instance
	 */
	public static synchronized Journal getInstance(String key){
			Journal instance = instances.get(key);
			if (instance == null){
				instance = new Journal();
				instances.put(key, instance);
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
