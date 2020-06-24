import java.util.Scanner;

public class d4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        int a = 0;
        while (i < n) {
            int b = scanner.nextInt();
            if (b < 0) {
                b++;
            }
            i++;
        }
        if (a > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
