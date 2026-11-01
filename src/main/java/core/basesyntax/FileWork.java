package core.basesyntax;

import java.io.BufferedWriter;

public class FileWork {
    public String[] readFromFile(String fileName) {

        String[] splitedFile = fileName.split(" ");
        String[] filterWords = new String[]{};

        for (String word : splitedFile) {
            String firstLetter = word.substring(0,1);
            if (firstLetter.equals("w") || firstLetter.equals("W")) {

            }
        }

        return null;
    }
}
