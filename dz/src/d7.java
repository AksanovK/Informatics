import java.util.Scanner;

public class d7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int i = 0, j;
        while (i < n) {
            array[i] = scanner.nextInt();
            i++;
        }
        i = 0;
        while (i < n - 1) {
            j = i + 1;
            while (j < n) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                j++;
            }
            i++;
        }
        i = 0;
        while (i < n) {
            System.out.print(array[i] + " ");
            i++;
        }
    }
}
