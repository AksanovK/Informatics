import java.util.Scanner;

public class d3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0;
        boolean bol = false;
        int i = 0;
        while (i < n) {
            char s = scanner.next().charAt(0);
            if (!bol) {
                k = (int) s - 'h';
                bol = true;
            }
            int a = (int) s;
            a = a - k;
            System.out.print((char) a + " ");
            i++;
        }
    }
}
