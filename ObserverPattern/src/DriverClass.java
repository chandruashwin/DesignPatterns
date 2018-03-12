
public class DriverClass {

	public static void main(String[] args) {
		
		AverageScoreDisplay avgScoreObj = new AverageScoreDisplay();
		CurrentScoreDisplay crntScoreObj = new CurrentScoreDisplay();
		CricketData cridataObj = new CricketData();
		cridataObj.registeredObserver(avgScoreObj);
		cridataObj.registeredObserver(crntScoreObj);
		cridataObj.dataChanged();
		 //remove an observer
		cridataObj.unregisteredObserver(avgScoreObj);
		 // now only currentScoreDisplay gets the
        // notification
		cridataObj.dataChanged();
	}

}
