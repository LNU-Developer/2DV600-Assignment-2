package SubTask1;

import java.io.*;
import java.util.Scanner;

public class IdentifyWordsMain {
    Scanner scanner;
    StringBuilder cleanWords;
    String path;
    String exportFileName;
    String readFileName;

    public IdentifyWordsMain(String path, String readFileName, String exportFileName) {
        this.path = path;
        this.readFileName = readFileName;
        this.exportFileName = exportFileName;
    }

    public void readFromFile() {
        try {
            scanner = new Scanner(new File(path + readFileName));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void cleanWords() {
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            char[] chars = line.toCharArray();

            for (char character : chars) {
                if (Character.isLetter(character) || Character.isWhitespace(character) || character == '-')
                    stringBuilder.append(character == '-' ? " " : character);
            }
            stringBuilder.append("\n");
        }
        scanner.close();
        cleanWords = stringBuilder;
    }

    public void writeToFile() {
        try {
            BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(path + exportFileName));
            bufferWriter.write(cleanWords.toString());
            bufferWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
