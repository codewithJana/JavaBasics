package Looping;

public class ForLoop {
    public static void main(String[] args) {

        /*
        for (initialization;condition;increment/decrement)

        //print 0 to 4
        for(int i =0;i < 5;i++){
            // i++ => i=i+1
            if(i ==3){
                break;
            }
            System.out.println(i);
        }
*/
        //print even numbers btw 1 to 10
        for(int i=1;i<=10;i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }

        //continue & Break
        for(int i=1;i<=10;i++){
            if (i%2 == 0){
                System.out.println("Even number: "+i);
                continue;
            }

            if(i==7){
                System.out.println("cut the Loop!");
                break;
            }


            System.out.println("Odd number is " + i);
        }

    }
}
