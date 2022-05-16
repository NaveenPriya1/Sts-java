package agevalid.junittest;

public class AgeValidator {
     
	public String ageValid(int age) {
		if(age>=18) {
			return "You are Eligible to vote";
		}else {
			return "You are not eligible to Vote";
		}
		
	}
}
