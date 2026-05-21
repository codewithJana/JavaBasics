package Threading_in_Java;

/*
Req: I need to play music then simultaneously the downloading starts
 */

//Download starts--> Download finished first
//Music starts play after download completes
//Task s are sequential

public class SingleThread {

    static void main(String[] args) {

        System.out.println("Downloading song...");

        for(int i=1; i<=10 ;i++){
            System.out.println("Download: "+ i);
        }

        System.out.println("Playing song...");

    }

}
