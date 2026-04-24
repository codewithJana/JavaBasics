package DecisionMaking;

public class IfElseStatement {

    public static void main(String[] args) {

        int number = 101;
        int number2 = 50;

        //if (conditions)
        if (number > 100){
            System.out.println("The number is greater than 100");
            if(number2 == 50){
                System.out.println("The number2 is equal to 50");
            }
        }else if(number < 100) {
            System.out.println("The number is less than 100");
        }else{
            System.out.println("The number is equal than 100");
        }

        if (number > 100){
            System.out.println("The number is greater than 100");
        }else{
            System.out.println("The number is equal than 100");
        }

    }
}
