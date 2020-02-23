class Test implements Runnable {
    public void run()
    {
        System.out.println("Run method executed by Thread");
    }
    public static void main(String[] args)
    {
        Test t = new Test();

        Thread t1 = new Thread(t);
        t1.start();
        System.out.println("Main method executed by main thread");
    }
}
