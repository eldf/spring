package eafit.validacion.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eafit.validacion.c_validador;

@RunWith(Parameterized.class)
public class TestValidacion {

	private String n;

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { "consulta1" }, { "consulta2" }, { "consulta3" }, { "" } });
	}

	public TestValidacion(String na) {
		n = na;
	}

	@Test
	public void test() {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_config.xml");
		c_validador val = (c_validador) applicationContext.getBean("val");

		try {

			Iterator iterator = val.obtenerTipos(n).iterator();
			while (iterator.hasNext()) {
				Object next = iterator.next();
				System.out.println(next);
			}

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			org.junit.Assert.fail(e.getMessage());
		}
	}

}
