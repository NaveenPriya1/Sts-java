package springex.ioc.SpringEx1;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Sim{
	private String dataStrength;
	
	

	public String getDataStrength() {
		return dataStrength;
	}

	public void setDataStrength(String dataStrength) {
		this.dataStrength = dataStrength;
	}

	public void typeOfSim() {
		// TODO Auto-generated method stub
		System.out.println("Airtel");
		
	}

	public void typeOfData() {
		// TODO Auto-generated method stub
		System.out.println("5G");
	}
	
	public void strength() {
		System.out.println(dataStrength);
	}

}
