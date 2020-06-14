package logalerts;

public class LogConsumer implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("READ FROM QUE and PRINT");
    }
}
