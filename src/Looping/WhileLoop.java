package Looping;

public class WhileLoop {

    static void main(String[] args) {
        int timer = 5;

        while (timer > 0){
            System.out.println("T-minus:" + timer);
            timer--;
        }
        System.out.println("Loop Ends!!");
    }
}