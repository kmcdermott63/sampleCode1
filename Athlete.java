package hw1;

public class Athlete {

	private CyclingResult cyclingResult;
	private BiathlonResult biathlonResult;

	public Athlete(BiathlonResult biathlonResult, CyclingResult cyclingResult) {
		this.biathlonResult = biathlonResult;
		this.cyclingResult = cyclingResult;
	}

	public double totalScore() {
		return cyclingResult.pointsEarned() + biathlonResult.pointsEarned();
	}

	public boolean hasBeaten(Athlete other) {
		return this.totalScore() > other.totalScore();
	}

	public Athlete betterCyclist1(Athlete other) {
		if (this.cyclingResult.pointsEarned() < other.cyclingResult.pointsEarned()) {
			return this;
		}
		else {
			return other;
		}
	}
	
	public Athlete betterCyclist2(Athlete other) {
		if (cyclingResult.betterCyclist(other.cyclingResult)) {
			return this;
		}
		else {
			return other;
		}
	}

}
