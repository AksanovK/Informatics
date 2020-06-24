import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        String s = k + "";
        int fir = k / (int) Math.pow(10, s.length() - 1);
        int ls = k % 10;
        String s1 = "";
        int i = 0;
        while (i < n && a[i] != fir){
            i++;
        }
        int j = i;
        while (j < n && a[j] != ls){
            j++;
        }

        for (int y = i; y <= j; y++){
            s1 += a[y];
        }
        Integer res = Integer.parseInt(s1);
        if (res == k){
            System.out.println(i + " " + j);
        } else {
            System.out.println("Nope");
        }
    }
}
