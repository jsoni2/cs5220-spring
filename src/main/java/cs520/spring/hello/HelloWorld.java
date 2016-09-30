package cs520.spring.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {

    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(
            "hello.xml" );

        Message message = (Message) context.getBean( "msgBean" );
        System.out.println( message.getContent() );
    }

}
