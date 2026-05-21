package Threading_in_Java;

class DownloadSongs implements Runnable {

    //run method contain task to execute
    public void run(){
        for(int i=1; i<=10 ;i++){
            System.out.println("Download: "+ i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

}

public class UsingRunnable {
    static void main(String[] args) {

        DownloadSong ds = new DownloadSong();

        //pass task to Thread
        Thread t1 = new Thread(ds);
        t1.start();

        //create seperate thread internally
        //JVM calls run() automatically


        System.out.println("Playing music...");

    }
}