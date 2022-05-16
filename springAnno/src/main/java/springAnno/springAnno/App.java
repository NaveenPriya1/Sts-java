package springAnno.springAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
    	Airtel airtel =ac.getBean(Airtel.class);
        airtel.dataTypeOfSim();
    	airtel.dataStrength();
       
    }
}
