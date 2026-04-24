package datatypes_Java;

import java.util.logging.Level;

public class NonPrimitiveDataType {

    enum dept{
        IT,
        Netwrok,
        HR
    };

    public static void main(String[] args) {
        //String, Array, class

        //String
        String programingLang = "Java";  // without new Keyword  --> SCP -->zz0091
        System.out.println(programingLang);

        Object str2 = "Java";  // without new Keyword  --> SCP -->zz0091
        System.out.println(str2);

        String str = new String("Java");  // with new Keyword -->Heap  -->gg779a
        System.out.println(str);

        System.out.println(programingLang==str);
        System.out.println(str2==programingLang);

        dept str5 = dept.Netwrok;
        System.out.println(str5);


    }
}
