package hw1;

public class BiathlonResult implements IEvent {

	private BiathlonRound round1;
	private BiathlonRound round2;
	private BiathlonRound round3;
	
	public BiathlonResult(BiathlonRound round1,BiathlonRound round2,BiathlonRound round3) {
		this.round1 = round1;
		this.round2 = round2;
		this.round3 = round3;
	}
	
	public BiathlonRound bestRound() {
		if (round1.getPointsEarned() <= round2.getPointsEarned() && 
			round1.getPointsEarned() <= round3.getPointsEarned()) {
			
			return round1;
		}
		else if (round2.getPointsEarned() < round1.getPointsEarned() && 
				round2.getPointsEarned() <= round3.getPointsEarned()) {
			
			return round2;
		}
		else {
			return round3;
		}
	}
	
	@Override
	public double pointsEarned() {		
		return round1.getPointsEarned() + round2.getPointsEarned() + round3.getPointsEarned();
	}
	
}
