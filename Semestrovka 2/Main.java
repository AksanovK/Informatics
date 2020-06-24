import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        generateData();
        Introsort a = new Introsort();
        a.giveInfoAboutTime();
        a.sort();
    }
    public static void generateData() throws IOException {
        FileWriter in = new FileWriter("Input.txt");
        int numberOfSets = (int) (50 + Math.random() * 51);
        for (int i = 0; i < numberOfSets; i++) {
            int arrays = (int)(100 + Math.random() * 9901);
            for (int j = 0; j < arrays; j++) {
                in.write((int) (Math.random() * 10001) + " ");
            }
            in.write(System.lineSeparator());
        }
    }
}
