package springex.anno.Annota;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext ac = new AnnotationConfigApplicationContext(Configu.class);
    	
    	CoffeMachine c = ac.getBean(CoffeMachine.class);
    	
    	c.coffieTaste();
    	c.coffieePrice();
    	//c.cream();
    }
}
