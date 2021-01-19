package Threading;

public class ThreadExample extends  Thread {

    private boolean isActive = true;

    //start/run thread
    @Override
    public synchronized void start() {
        System.out.println("The thread has started");
        System.out.println();
        super.start();
    }

    @Override
    public void run() {
     //   System.out.println("Running the thread");

        // Checking whether the thread is Daemon or not
        if(Thread.currentThread().isDaemon()){
            System.out.println("Currently, Daemon thread is executing");
        }
        else{
            System.out.println("Currently, user thread is executing");
        }
        System.out.println();



        //sleep mechanism for thread
        while (isActive) {
            try {
                System.out.println("Thread is about to  go to sleep for 3 seconds");
                sleep(3000);
                System.out.println();
                System.out.println("Thread is awake again after 3 seconds");

            //thread stop mechanism
            stopThread(); //stops here and does not go further
                            // but if thread is not kill/stop it will keep on going continuously
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //killing thread function
    public void stopThread(){
        isActive = false;
    }
}
