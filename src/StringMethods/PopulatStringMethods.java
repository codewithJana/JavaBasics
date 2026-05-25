package StringMethods;

public class PopulatStringMethods {
    static void main(String[] args) {

        //length() --> return the total character count of the string
        String name = "Hello,Jana! ";
        int len = name.length();
        System.out.println(len);

        //charAt(index)  --> return the character at the given index(number) -- .[0,1...n]
        String str = "Automation"; //10 -- 0,1,2..9
        char c = str.charAt(0);
        char lastchar1 = str.charAt(str.length()-1);
        char lastchar2 = str.charAt(str.length()-2);
        char lastchar3 = str.charAt(str.length()-3);
        System.out.println(c);
        System.out.println(lastchar3+" "+lastchar2+" "+lastchar1);

        //toLowerCase and toUppercase
        String str1 = "Automation";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1);

        //trim()/strip()
        String str2 = " Hello,Jana! ";
        System.out.println("|" + str2.trim()+ "|");
        System.out.println("|" + str2.strip()+ "|");

        //replace//replaceall
        String test = "test-case-name-integer";
        System.out.println(test.replace('-','_'));
        System.out.println(test.replaceAll("[aeiou]","*"));

        //split
        String TestTools = "selenium,Playwright,Appium,RestAssured";
        String[] tools = TestTools.split(",");
        for(String tool : tools){
            System.out.println(tool);
        }


    }
}
