package springAcc.SpringAcc;

public class Idea implements Sim{

	private String datastrength;
	
	public Idea(String datastrength) {
		super();
		this.datastrength = datastrength;
	}

	public void typeOfSim() {
		System.out.println("Idea");
		
	}

	public void dataTypeOfSim() {
		System.out.println("5G");
		
	}
	
	public void dataStrength() {
		System.out.println(datastrength);
	}

}
