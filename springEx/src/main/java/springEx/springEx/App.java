// Using Bean Fcatory

package springEx.springEx;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Resource rs = new ClassPathResource("spring.xml");
       BeanFactory bf = new XmlBeanFactory(rs);
       
       Sim sim = bf.getBean(Airtel.class);
       sim.typeOfSim();
       sim.dataTypeOfSim();
       
       Sim sim1 = bf.getBean(Idea.class);
       sim1.typeOfSim();
       sim1.dataTypeOfSim();
       
    }

	
	} 



