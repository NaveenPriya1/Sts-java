package springAcc.SpringAcc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
    	Airtel sim = ac.getBean(Airtel.class);
    	
    	sim.typeOfSim();
    	sim.dataTypeOfSim();
    	sim.dataStrength();
    }
}
