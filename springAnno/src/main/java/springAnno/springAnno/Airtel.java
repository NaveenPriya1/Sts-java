package springAnno.springAnno;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Airtel implements Sim{
  
	
	
	private String datastrength;
	
	public String getDataStrength() {
		return datastrength;
	}
  @Required
  @Value("Airtel has good dataStrength")
	public void setDataStrength(String dataStrength) {
		this.datastrength = dataStrength;
	}

	public void typeOfSim() {
		System.out.println("Airtel");
		
	}

	public void dataTypeOfSim() {
		System.out.println("5G");
		
	}
	
	public void dataStrength() {
		System.out.println(datastrength);
	}
	
	

	
	
}
