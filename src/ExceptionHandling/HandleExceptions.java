package ExceptionHandling;

public class HandleExceptions {
    static void main(String[] args) {
        /*
        //Compile time error ->> compiler stops the program
        int number = "10";
        int number2 = 100;
        System.out.println("hii");
        int sum  = number =number2;


        //Runtime error -> Error occurs in the running stage
        int total = 100/0;

        //Logical errors
        int total1 = 100-20 * 2; // (100-20) * 2
        System.out.println(total1); // 100 - (20*2)
         */
        //without try-catch block

        int number = 0;
       //risky
        try {
            int result = 100 / number;
            System.out.println("Result: "+ result);
//            int[] numbers = {10,20,30};
//            System.out.println(numbers[10]);
        }catch (ArithmeticException e ){
            System.out.println("cannot divide by Zero. It leads to infinite");
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Invalid Array Index");
            System.out.println(e.getMessage());
        }

        System.out.println("Program is completed");


        int num  = -500;
try{
    if(num < 0){
        throw new ArithmeticException("Negative amount not allowed");
    }
    System.out.println("withdrawl successfull");
}catch (ArithmeticException e){
    System.out.println(e.getMessage());
}




    }
}
