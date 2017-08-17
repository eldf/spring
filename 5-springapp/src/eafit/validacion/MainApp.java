package eafit.validacion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainApp {
	
public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_config.xml");
		
		c_validador val = (c_validador) applicationContext.getBean("val");
	
		Iterator iterator = val.obtenerTipos("ejemplo").iterator();
		while(iterator.hasNext()) {
		    Object next = iterator.next();
		    System.out.println(next);
		}

		
		
		((ClassPathXmlApplicationContext)applicationContext).close();
	
	}

}
