public class question3a extends Thread{
    public void run()
    {
        System.out.println("Run method executed by child Thread");
    }
    public static void main(String[] args)
    {
        question3a t = new question3a();
        t.start();
        System.out.println("Main method executed by main thread");
    }
}

