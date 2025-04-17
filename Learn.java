public class Learn implements Runnable {

    @Override
    public void run()
    {
        for( int i=0;  ; i++)
        {
            System.out.println("Learn  " + i);
            System.out.println(Thread.currentThread().getName());
        }
    }
    
}
