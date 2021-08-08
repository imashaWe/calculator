package lk.imasha.uni;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextReader {
   private final File file;

    TextReader(String filePath) {
        this.file = new File(filePath);
    }

     String[] readLine() {

        String[] line = null;

        try {
            final Scanner scanner = new Scanner(file);
            line =scanner.nextLine().split(" ");
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return   line;
    }
}
