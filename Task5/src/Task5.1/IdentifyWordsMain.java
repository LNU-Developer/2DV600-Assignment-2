import java.io.*;
import java.util.Scanner;

public class IdentifyWordsMain {
    public static void main(String[] args) {
        String path = "src/Task5.1/";
        String readFile = "HistoryOfProgramming.txt";
        String writeFile = "words.txt";
        Scanner scanner = readFromFile(path, readFile);
        StringBuilder stringBuilder = cleanWords(scanner);
        writeToFile(stringBuilder, path, writeFile);
    }

    private static Scanner readFromFile(String path, String fileName) {
        try {
            return new Scanner(new File(path + fileName));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private static StringBuilder cleanWords(Scanner scanner) {
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
        return stringBuilder;
    }

    private static void writeToFile(StringBuilder stringBuilder, String path, String fileName) {
        try {
            BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(path + fileName));
            bufferWriter.write(stringBuilder.toString());
            bufferWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
