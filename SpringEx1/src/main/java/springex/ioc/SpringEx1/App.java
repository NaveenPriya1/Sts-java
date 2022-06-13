package springex.ioc.SpringEx1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
//		Resource rs = new ClassPathResource("spring.xml");
//		BeanFactory bf = new XmlBeanFactory(rs);
		
		ApplicationContext bf = new AnnotationConfigApplicationContext(Config.class);
		Airtel sim = bf.getBean(Airtel.class);
		sim.typeOfData();
		sim.typeOfSim();
		
		
		

	}

}
