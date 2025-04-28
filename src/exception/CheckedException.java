package exception;

import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("test.txt");
        } catch (IOException e) {
            System.out.println("We have some problem: " + e.getMessage());
        }

    }
    
}
