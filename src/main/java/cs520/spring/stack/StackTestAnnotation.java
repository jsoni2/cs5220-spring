package cs520.spring.stack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StackTestAnnotation {

    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(
            "stack_annotation.xml" );

        StackTest stackTest = (StackTest) context.getBean( "stackTest" );
        stackTest.test();
    }

}
