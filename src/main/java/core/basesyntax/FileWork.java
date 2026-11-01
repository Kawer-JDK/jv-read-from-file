package core.basesyntax;

import java.io.*;

public class FileWork {
    public String[] readFromFile(String fileName) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Can't read from file", e);
        }



        return null;
    }
}
