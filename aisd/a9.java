import java.util.Scanner;

public class a9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] c = new int[n + 1];
        System.out.println(fun(n, c));
    }

    public static int fun(int i, int[] a){
        if (i < 1){
            return 0;
        } else if (i == 2) {
            return 1;
        }
        if (a[i] == 0){
            int result = fun(i - 1, a) * 2 + 1;
            a[i] = result;
        }
        return a[i];
    }
}
