//Thread Methods ....start, run, sleep, join, set Priority

public class MyThread2 extends Thread
{
    public MyThread2(String name)
    {
        super(name);
    }

    @Override
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " -count: " + i);

            try{
                Thread.sleep(100);
            }catch(Exception e){

            }
        }
    }

    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("first");
        MyThread2 low  = new MyThread2("Low_Priority Thread");
        MyThread2 med  = new MyThread2("Medium Priority Thread");
        MyThread2 high = new MyThread2("High Priority Thread");

        low.setPriority(Thread.MIN_PRIORITY);
        med.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);
        // t1.start();
        low.start();
        med.start();
        high.start();
    }
    
}
