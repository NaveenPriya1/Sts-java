package springex.anno.Annota;

import org.springframework.stereotype.Component;

@Component
public class Baristha implements CoffeMachine{

	public void coffieTaste() {
		System.out.println("taste's as ice cream");
		
	}

	public void coffieePrice() {
		System.out.println("750 rs");
		
	}

}
