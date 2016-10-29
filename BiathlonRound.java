package hw1;

public class BiathlonRound {

	int numberOfTargetsHit;
	double timeAroundTrack;
	
	public BiathlonRound(int numberOfTargetsHit, double timeAroundTrack) {
		this.numberOfTargetsHit = numberOfTargetsHit;
		this.timeAroundTrack = timeAroundTrack;
	}
	
	public double getPointsEarned() {
		return timeAroundTrack + (5-numberOfTargetsHit);
	}
	
}
