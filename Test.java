public class Test{
    public static void main(String [] args){

        World world = new World();
        Learn learn = new Learn();

        Thread t1 = new Thread(learn);
 
        // world.start();
        t1.start();



        for(int i=0; ;i++)
        {
            System.out.println("Hello " + i);

            System.out.println(Thread.currentThread().getName());

        }


    }
}