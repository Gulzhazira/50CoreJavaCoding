package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndPrintFromFile {

    public static void main(String[] args) {
        String filePath = "/Users/gulzhazira/Desktop/50CoreJavaQuestions/src/exception/test.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;

            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
