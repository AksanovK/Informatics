import java.util.HashSet;
import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < n; i++){
            int k = scan.nextInt();
            for (int j = 0; j < k; j++){
                hs.add(scan.next());
            }
        }
        System.out.println(hs.size());
    }
}
