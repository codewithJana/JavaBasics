package Arrays;

import java.util.Arrays;

public class TwoDimArray {

    static void main(String[] args) {

        int [][] matrix = new int [3][3];
        matrix [0][0] = 10;
        matrix [0][1] = 20;
        matrix [0][2] = 30;

        int [][] matrix1 = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };


        System.out.println(Arrays.deepToString(matrix));

        String [][] envConfig = {
                {"Development","dev.google.com","Active"},
                {"QA","qa.google.com","Active"},
                {"Production","prod.google.com","InActive"},
                {"Staging","stage.google.com","InActive"},
                {"UAT","uat.google.com","Active"},
        };

        System.out.println(Arrays.deepToString(envConfig));
        System.out.println(envConfig.length);

        String targetEnv = "UAT";
        for(int i=0;i<envConfig.length;i++){
            if(envConfig[i][0].equals(targetEnv) ){
                System.out.println("Target found!!!");
                System.out.println("The Environment is: "+ envConfig[i][0]);
                System.out.println("The URL is: "+ envConfig[i][1]);
                System.out.println("The Actice state is: "+envConfig[i][2]);
                break;
            }
        }





    }

}
