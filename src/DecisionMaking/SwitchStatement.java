package DecisionMaking;

public class SwitchStatement {

    public static void main(String[] args) {

        int num = 5;
        String size ="";

        switch (num){

            case 2:
                size = "small";
                if (1==2){

                }
                break;
            case 5:
                size = "medium";
                break;
            case 10:
                size = "extra large";
                break;
            case 7:
                size = "Large";
                break;

            default:
                System.out.println("The value is not in the case set");



        }
        System.out.println(size);
    }

}
