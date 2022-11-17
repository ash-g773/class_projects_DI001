
public class HeightCalculator {

	private int heightFeet, heightInches;
	private int sumHeightsFeet, sumHeightsInches;
	
	public int getSumHeightsFeet() {
		return sumHeightsFeet;
	}
	
	public int getSumHeightsInches() {
		return sumHeightsInches;
	}
	
	public void setHeightFeet(int heightFeet) {
		this.heightFeet = heightFeet;
	}
	
	public void setHeightInches(int heightInches) {
		this.heightInches = heightInches;
	}
	
	public void sumOfHeights(HeightCalculator h1, HeightCalculator h2) {
		sumHeightsFeet = h1.heightFeet + h2.heightFeet;
		sumHeightsInches = h1.heightInches + h2.heightInches;
		if (sumHeightsInches > 12) {
			sumHeightsInches = sumHeightsInches - 12;
			sumHeightsFeet = sumHeightsFeet + 1;
		}
	}
}
