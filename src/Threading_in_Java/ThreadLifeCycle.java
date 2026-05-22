package Threading_in_Java;

//New --> Runnable -->Blocked-->Time waiting-->waiting-->Terminated

class MyThread extends Thread{

    public void run(){
        System.out.println("Thread Running");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Thread Completed");
    }
}

public class ThreadLifeCycle {

    static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread(); //NEW
        System.out.println("State after creation: " + t1.getState());

        t1.start();
        System.out.println("State after creation: " + t1.getState());

        Thread.sleep(500);
        System.out.println("State after creation: " + t1.getState());

        t1.join();
        System.out.println("State after creation: " + t1.getState());
    }

}
