package hw1;

public class CyclingResult implements IEvent {
	
	private double finishTime;
	private int finishPosition;
	
	public CyclingResult(double finishTime, int finishPosition) {
		this.finishTime = finishTime;
		this.finishPosition = finishPosition;
	}
	@Override
	public double pointsEarned() {
		if (finishPosition == 1) {
			return finishTime - 10;
		}
		else if (finishPosition == 2) {
			return finishTime - 7;
		}
		else if (finishPosition == 3) {
			return finishTime - 3;
		}
		else {
			return finishTime;
		}
	}
	
	public boolean betterCyclist(CyclingResult other) {
		if (other.pointsEarned() < this.pointsEarned()) {
			return false;
		}
		else {
			return true;
		}
	}
	
}
