public class ThreadSynchronization {
    
    public static void main(String[] args) {
        
        Counter counter = new Counter();
        MyThread6 thread1 = new MyThread6(counter);
        MyThread6 thread2 = new MyThread6(counter);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
            } catch (Exception e) {
                
        }

        System.out.println(counter.getCount());

    }
}
