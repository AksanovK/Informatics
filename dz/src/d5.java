import java.util.Scanner;

public class d5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int i = 0;
        int[] a = new int[n];
        int[] b = new int[m];
        int max;
        while (i < n) {
            a[i] = scanner.nextInt();
            i++;
        }
        i = 0;
        while (i < m) {
            b[i] = scanner.nextInt();
            i++;
        }
        if (b[m - 1] > a[n - 1]) {
            max = b[m - 1];
        } else {
            max = a[n - 1];
        }
        boolean[] c = new boolean[max + 1];
        i = 0;
        while (i < n) {
            i++;
        }
        i = 0;
        while (i < m) {
            c[b[i]] = false;
            i++;
        }
        System.out.println(b);
        i = 0;
        while (i < c.length) {
            if (c[i]) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
