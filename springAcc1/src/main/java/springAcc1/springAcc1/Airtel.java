package springAcc1.springAcc1;

public class Airtel implements Sim{
  
	private String dataStrength;
	
	public String getDataStrength() {
		return dataStrength;
	}

	public void setDataStrength(String dataStrength) {
		this.dataStrength = dataStrength;
	}

	public void typeOfSim() {
		System.out.println("Airtel");
		
	}

	public void dataTypeOfSim() {
		System.out.println("5G");
		
	}
	
	public void dataStrength() {
		System.out.println(dataStrength);
	}

	
	
}
