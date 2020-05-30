package Work3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class StreamAPI2 {
    public static void main(String[] args) throws IOException {
        List<String> list = new LinkedList<>();
        BufferedReader in = new BufferedReader(new FileReader("D:\\javaNEW\\src\\projects\\Files\\File.txt"));
        String s = in.readLine();
        while (s != null) {
            list.add(s);
            s = in.readLine();
        }
        boolean b;

        long a = list.stream().filter((line) -> (line.startsWith("c:/users/")&&(line.contains(".docx")))).count();

    }
}
