public class MyThread5 extends Thread{
    
    @Override
    public void run(){
        while(true)
        {
            System.out.println("Hello Thread !");
        }
    }

    public static void main(String[] args) {
        MyThread5 myThread = new MyThread5();
        myThread.setDaemon(true);
        MyThread5 t1 = new MyThread5();
        t1.start();
        myThread.start();
        System.out.println("Main Thread done ....");
    }
}
