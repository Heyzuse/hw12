//This holds the bicycle object and the carbon footprint calc
public class Bicycle implements CarbonFootprint {
	
	@Override
	public String getCarbonFootprint() {
		return "Bicycle carbon footprint is: 0";
	}
}