package datatypes_Java;

public class PrimitiveDataType {

    //Datatype -->what type of value we store in variable
    // 1. Memory Allocation 2. Code optimize 3. avoid early errors 4. Data integrity

    public static void main(String[] args) {
        //integer type -- (whole number) --> byte,short,int,long
        //byte num1 ---> Declaration
        //num1 =1000 ---> Assignment

        byte num1 = 127;  // -127 to +127 //1 byte
        System.out.println(num1);

        short num2 = 1000; // -32000 to 32500  //2 byte
        System.out.println(num2);

        int num3 = 500000; // 4 byte
        System.out.println(num3);

        long num4;
        num4 = 1000000000L;  //L is mandatory
        System.out.println(num3);

        //Floating datatype (decimal numbers)
        //float 10.88878 , double 10.878787878787

        float decnum = 10.65655644445f; //f is mandatory
        System.out.println(decnum);

        double decnum1 = 10.767567567001;
        System.out.println(decnum1);

        //character datatype --> ' '  //2 byte
        char grade = 'A';
        char symbol = '^';
        char number = '1';
        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(number);

        //boolean //1 bit
        boolean isJava_a_lang = true;
        System.out.println(isJava_a_lang);

    }
}
