package mavenex.mavenbuild;

public class AgeValidator {

	public String ageValidator(int age) {
		if (age >= 18) {
			return "you are eligible to vote";
		}
		
		else {
			return "you are not eligible to vote";
		}
	}
	
	
}
