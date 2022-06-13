package springex.anno.Annota;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Capuchino implements CoffeMachine{
	
	private String extraCream;
	
	@Autowired
	Baristha baristha;

	public String getExtraCream() {
		return extraCream;
	}
     @Required
     @Value("Extra cream needed")
	public void setExtraCream(String extraCream) {
		this.extraCream = extraCream;
	}

	public void coffieTaste() {
		System.out.println("Taste is as chocalate");
		
	}

	public void coffieePrice() {
		System.out.println("500 rs");
		
	}
	
	public void cream() {
		baristha.coffieePrice();
	}

}
