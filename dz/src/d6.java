import java.util.Scanner;

public class d6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int i = 0;
        boolean finish = false;
        boolean found = false;
        while (i < n) {
            if (!finish) {
                int a = scanner.nextInt();
                if (a > k || a == k) {
                    finish = true;
                    if (a == k) {
                        found = true;
                    }
                }
            } else {
                i = n;
            }
        }
        if (found) {
            System.out.println("X присутствует");
        } else {
            System.out.println("X отсутствует");
        }
    }
}
