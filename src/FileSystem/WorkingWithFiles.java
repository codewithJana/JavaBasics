package FileSystem;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class WorkingWithFiles {

    // Logging your test steps
    // Reporting
    // testdata
    // configurations
    // properties

    static void main(String[] args) {

        File file = new File("student.txt");

        if (file.delete()) {
            System.out.println("File deleted");
        } else {
            System.out.println("File not found");
        }

//            if(file.createNewFile()){
//                System.out.println("File created successfully!");
//            } else {
//                System.out.println("File already exists");
//            }


    }

}

