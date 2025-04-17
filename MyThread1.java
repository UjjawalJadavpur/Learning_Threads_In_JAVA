public class MyThread1 extends Thread {

    @Override
    public void run() {

        System.out.println("Thread is running ....");
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1 = new MyThread1();

        t1.start();
        t1.join();  // Wait for the thread to finish

        System.out.println("Thread has finished execution."); 
    }
}
