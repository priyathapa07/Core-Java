package Threading;

public class Main_Thread {

    public static void main(String[] args){

      //auto generated thread name
      ThreadExample threadExample = new ThreadExample();
      threadExample.setDaemon(false);
      threadExample.start(); //will trigger run too

        //Defined thread name
//      Thread t1 = new Thread("thread with name Priya");


      //  threadExample.stopThread();

    //possibility to convert the thread to daemon or user thread
    //  threadExample.setDaemon(true); //would make it Daemon thread //which does not wake up after sleeping
    //  threadExample.setDaemon(false); //would make it non-daemon/user thread

//        RunnableExample run = new RunnableExample();
//        Defined name and accepts runnable
//        Thread thread = new Thread(run,"Priya");
//        thread.run();
//        System.out.println(thread.getName());


    }
}

