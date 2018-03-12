import java.util.ArrayList;
import java.util.Iterator;

public class CricketData implements Subject{
	int runs;
	int wickets;
	float overs;
	ArrayList<Observer> observerList;
	public CricketData() {
		observerList = new ArrayList<Observer>();
	}
	public void registeredObserver(Observer o) {
		observerList.add(o);
	}
	public void unregisteredObserver(Observer o) {
		observerList.remove(observerList.indexOf(o));
	}
	public void notifyObservers() {
		for(Iterator<Observer> it = observerList.iterator();it.hasNext();) {
			Observer o = it.next();
			o.update(runs,wickets,overs);
		}
	}
	public void dataChanged() {
		runs = getLatestRuns();
		wickets = getLatestWickets();
		overs = getLatestOvers();
		notifyObservers();
	}
	public int getLatestRuns() {
		return 90;
	}
	public int getLatestWickets() {
		return 5;
	}
	public float getLatestOvers() {
		return 10.2f;
	}
}
