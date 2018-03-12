
public interface Subject {

	public void registeredObserver(Observer o);
	public void unregisteredObserver(Observer o);
	public void notifyObservers();
}
