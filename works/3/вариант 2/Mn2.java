package List;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Mn2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int[] k = new int[m];
        Set<String> set = new TreeSet<>();
        for (int i = 0; i < m; i++) {
            k[i] = scan.nextInt();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k[i]; j++) {
                String id = scan.next();
                set.add(id);
            }
        }
        System.out.println(set.size());
    }
}
