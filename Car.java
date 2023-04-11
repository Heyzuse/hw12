//This holds the Car object and the carbon footprint calc
public class Car implements CarbonFootprint {
	int mi;
	float fuelBurned;
	
	Car(int m, float f){
		mi = m;
		fuelBurned = f;
	}
	
	@Override
	public String getCarbonFootprint() {
		float carbonFootprint = mi * fuelBurned;
		return "Car carbon footprint is: " + carbonFootprint;
	}
}