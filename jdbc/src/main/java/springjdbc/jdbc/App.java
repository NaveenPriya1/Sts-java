package springjdbc.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		StudentBean sb=ac.getBean(StudentBean.class);
		StudentDAO dao=ac.getBean(StudentDAO.class);
	
		/*for insertion data */
	//	int row=dao.insert(sb);
	//	if(row>0) {
	//	System.out.println("insertion is success");
	//	}
	//	else {
	//		System.out.println("check the code");
	//	}
		
		// for fetching data
		List<StudentBean> list=dao.getallstudents();
		for(StudentBean sbb:list) {
			System.out.println(sbb.getSid()+"   "+sbb.getSname());
				
		}
		
	}

}

