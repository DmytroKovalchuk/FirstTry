public class Solution {
    public static void processThreads(Thread... threads) {

        for(Thread currentThread : threads){
            Thread.State state = currentThread.getState();
         switch (state){
             case NEW:        currentThread.start();break;
             case WAITING:    currentThread.interrupt();break;
             case TIMED_WAITING:    currentThread.interrupt();break;
             case RUNNABLE:   currentThread.isInterrupted();break;
             case BLOCKED:   currentThread.interrupt();break;
             case TERMINATED: System.out.println(currentThread.getPriority());break;
         }
        }


        
    }
}
