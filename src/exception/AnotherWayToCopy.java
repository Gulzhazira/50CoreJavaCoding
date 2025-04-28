package exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class AnotherWayToCopy {

    public static void main(String[] args) {
        Path sourceFile = Path.of("/Users/gulzhazira/Desktop/50CoreJavaQuestions/src/exception/test.txt");
        Path destinationFile = Path.of("/Users/gulzhazira/Desktop/50CoreJavaQuestions/src/exception/test3.txt");

        try{
            Files.copy(sourceFile, destinationFile, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
