package cs520.spring.ioc;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FooBarTest {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("foobar.xml");

		Foo foo = (Foo) context.getBean("foo");
		// System.out.println(foo.);

		context.close();
	}
}
