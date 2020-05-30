package List;

import java.util.HashMap;
import java.util.Scanner;

public class Mn1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        HashMap<String, Integer> persons = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int k = scan.nextInt();
            for(int j = 0; j < k; k++) {
                String id = scan.nextLine();
                if (persons.containsKey(id)) {
                    persons.put(id, persons.get(id) + 1);
                }
            }
        }
    }
}
