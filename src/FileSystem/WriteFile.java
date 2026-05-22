package FileSystem;

import java.io.*;

public class WriteFile {
    static void main(String[] args) throws IOException {

        //create file using FileWriter
        FileWriter writer = new FileWriter("log.txt",true);

        //write data
        writer.write("Student Name: Peter");
        writer.write("\nCourse: Python");

        writer.append("\nBatch: May");

        //close file
        writer.close();

        BufferedWriter bwriter = new BufferedWriter(new FileWriter("employee.txt"));

        bwriter.write("Employee ID: 101");
        bwriter.newLine();
        bwriter.write("Department: Testing");
        bwriter.close();


        BufferedReader reader = new BufferedReader(new FileReader("employee.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();




    }
}
