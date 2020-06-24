import java.util.Scanner;

public class d2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ag = scanner.nextInt();
        int n = scanner.nextInt();
        int i = 0;
        while (i < n) {
            int a = scanner.nextInt();
            a = a + ag;
            System.out.println(a % 26);
            i++;
        }
    }
}
