package Threading_in_Java;

class DownloadSong extends Thread {

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

public class UsingThreads {
    static void main(String[] args) {

        DownloadSong ds = new DownloadSong();
        //create seperate thread internally
        //JVM calls run() automatically
        ds.start();
        System.out.println("Playing music...");

    }
}
