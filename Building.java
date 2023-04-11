//This holds the building object and the carbon footprint calc
public class Building implements CarbonFootprint {
	int stories;
	float fuelBurned;
	
	Building(int n, float f) {
		stories = n;
		fuelBurned = f;
	}
	
	@Override
	public String getCarbonFootprint() {
		float carbonFootprint = stories * fuelBurned;
		return "Building carbon footprint is: " + carbonFootprint;
	}
}