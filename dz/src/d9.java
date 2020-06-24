import java.util.Scanner;

public class d9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int i = 0;
        int j;
        String result = "";
        while (str.charAt(i) == ' ') {
            i++;
        }
        j = str.length() - 1;
        System.out.println(j);
        while (str.charAt(j) == ' ') {
            j=j-1;
        }
        for (int d = i; d <= j; d++) {
            result += str.charAt(d);
        }
        System.out.println(result);
    }
}

