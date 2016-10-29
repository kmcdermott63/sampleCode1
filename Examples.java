package hw1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Examples {

	// This shows how to compare two integers
	@Test
	public void simpleCheck() {
		assertEquals(4, 4);
	}

	// This shows how to compare two doubles
	@Test
	public void simpleDoublesCheck() {
		assertEquals(4.0, 4.0, .01);
	}
	
	
	CyclingResult cyclingResult1 = new CyclingResult(19.4,1);
	CyclingResult cyclingResult2 = new CyclingResult(21.8,2);
	CyclingResult cyclingResult3 = new CyclingResult(24.5,3);
	CyclingResult cyclingResult4 = new CyclingResult(26.1,4);
	
	@Test
	public void cyclingResult1Check() {
		assertEquals(cyclingResult1.pointsEarned(), 9.4, .01);
	}
	
	@Test
	public void cyclingResult2Check() {
		assertEquals(cyclingResult2.pointsEarned(), 14.8, .01);
	}
	
	@Test
	public void cyclingResult3Check() {
		assertEquals(cyclingResult3.pointsEarned(), 21.5, .01);
	}
	
	@Test
	public void cyclingResult4Check() {
		assertEquals(cyclingResult4.pointsEarned(),26.1, .01);
	}
	
	BiathlonRound biathlonRound1 = new BiathlonRound(0, 11.1);
	BiathlonRound biathlonRound2 = new BiathlonRound(1, 13.2);
	BiathlonRound biathlonRound3 = new BiathlonRound(2, 14.3);
	BiathlonRound biathlonRound4 = new BiathlonRound(3, 16.4);
	BiathlonRound biathlonRound5 = new BiathlonRound(4, 15.5);
	BiathlonRound biathlonRound6 = new BiathlonRound(5, 10.6);
	
	@Test
	public void biathlonRound1Check() {
		assertEquals(biathlonRound1.getPointsEarned(), 16.1, .01);
		assertEquals(biathlonRound2.getPointsEarned(), 17.2, .01);
		assertEquals(biathlonRound3.getPointsEarned(), 17.3, .01);
		assertEquals(biathlonRound4.getPointsEarned(), 18.4, .01);
		assertEquals(biathlonRound5.getPointsEarned(), 16.5, .01);
		assertEquals(biathlonRound6.getPointsEarned(), 10.6, .01);
		
	}
	
	BiathlonResult biathlonResult1 = new BiathlonResult(biathlonRound1,biathlonRound2,biathlonRound3);
	BiathlonResult biathlonResult2 = new BiathlonResult(biathlonRound3,biathlonRound6,biathlonRound4);
	BiathlonResult biathlonResult3 = new BiathlonResult(biathlonRound3,biathlonRound2,biathlonRound5);

	@Test
	public void biathlonResult1Check() {
		assertEquals(biathlonResult1.pointsEarned(),50.6, .01);
	}
	
	@Test
	public void bestRound1Check() {
		assertEquals(biathlonResult1.bestRound(), biathlonRound1);
	}
	
	@Test
	public void bestRound2Check() {
		assertEquals(biathlonResult2.bestRound(), biathlonRound6);
	}
	
	@Test
	public void bestRound3Check() {
		assertEquals(biathlonResult3.bestRound(), biathlonRound5);
	}
	
	Athlete athlete1 = new Athlete(biathlonResult1,cyclingResult1);
	Athlete athlete2 = new Athlete(biathlonResult2,cyclingResult2);
	
	@Test
	public void athlete1TotalScoreCheck() {
		assertEquals(athlete1.totalScore(), 60.0, .01);
	}
	
	@Test
	public void athlete1HasBeatenCheck() {
		assertEquals(athlete1.hasBeaten(athlete2), false);
	}
	
	@Test
	public void athlete2HasBeatenCheck() {
		assertEquals(athlete2.hasBeaten(athlete1), true);
	}
	

	@Test
	public void athleteBetterCyclist1Check1() {
		assertEquals(athlete2.betterCyclist1(athlete1), athlete1);
	}
	
	@Test
	public void athleteBetterCyclist1Check2() {
		assertEquals(athlete1.betterCyclist1(athlete2), athlete1);
	}
	
	@Test
	public void athleteBetterCyclist2Check1() {
		assertEquals(athlete2.betterCyclist2(athlete1), athlete1);
	}
	
	@Test
	public void athleteBetterCyclist2Check2() {
		assertEquals(athlete1.betterCyclist2(athlete2), athlete1);
	}
}
