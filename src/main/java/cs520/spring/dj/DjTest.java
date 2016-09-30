package cs520.spring.dj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DjTest {

    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(
            "dj.xml" );

        DjBean dj = (DjBean) context.getBean( "dj" );
        dj.output();
    }

}
