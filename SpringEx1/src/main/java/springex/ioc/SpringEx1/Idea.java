package springex.ioc.SpringEx1;

import org.springframework.stereotype.Component;

@Component
public class Idea implements Sim {
	
	private String dataStrength;
	
	

	public Idea(String dataStrength) {
		super();
		this.dataStrength = dataStrength;
	}

	public void typeOfSim() {
		// TODO Auto-generated method stub
		System.out.println("Idea");
		
	}

	public void typeOfData() {
		// TODO Auto-generated method stub
		System.out.println("4G");
	}
	
	  public void strength() {
		  System.out.println(dataStrength);
		
	  }

}
