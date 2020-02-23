import java.lang.*;

public class question8 implements Runnable
{
    Thread t;
    public void run()
    {
        for (int i = 0; i < 4; i++)
        {
            System.out.println(Thread.currentThread().getName()
                    + "  " + i);
            try
            {
                // thread to sleep for 1000 milliseconds
                Thread.sleep(1000);
            }

            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws Exception
    {
        Thread t = new Thread(new question8());

        // call run() function
        t.start();
        t.join(10000);
        Thread t2 = new Thread(new question8());

        // call run() function
        t2.start();
    }
}