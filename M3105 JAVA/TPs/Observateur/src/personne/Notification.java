package personne;

public class Notification {

	private Memento before;
	private Memento after;
	
	public Notification (String notif) throws Exception{
		this.before = new Memento();
		this.after = new Memento();
		this.after.addNotification(notif);
		this.before = this.after.clone();
		}
	
	public Memento getBefore()
	{
		return this.before;
	}
	
	public Memento getAfter()
	{
		return this.after;
	}
	
	public Memento getderniereNotification()
	{
		return this.after.getderniereNotification();
	}
}
