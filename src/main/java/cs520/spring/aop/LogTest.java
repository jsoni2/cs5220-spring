package cs520.spring.aop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LogTest {

    LoggedTask task;

    LogTest()
    {
    }

    public LoggedTask getTask()
    {
        return task;
    }

    public void setTask( LoggedTask task )
    {
        this.task = task;
    }

    public static void main( String[] args )
    {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
            "aop.xml" );

        LogTest test = (LogTest) context.getBean( "logTest" );
        test.getTask().doSomething();
        test.getTask().doSomethingElse();
        test.getTask().hello();

        context.close();
    }

}
