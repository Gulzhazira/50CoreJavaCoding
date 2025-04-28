package exception;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFromOneFileToAnother {

    public static void main(String[] args) {
        String sourceFile = "/Users/gulzhazira/Desktop/50CoreJavaQuestions/src/exception/test.txt";
        String destinationFile = "/Users/gulzhazira/Desktop/50CoreJavaQuestions/src/exception/test2.txt";

        try(FileReader reader = new FileReader(sourceFile);
            FileWriter writer = new FileWriter(destinationFile)){

            int content;
            
            while((content = reader.read()) != -1){
                writer.write(content);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
    
}
