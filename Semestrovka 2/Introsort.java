import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Introsort {
    private int count = 0; // - число итераций

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    private int a[];

    public int[] getA() {
        return a;
    }

    private int n;

    Introsort(int n) {
        a = new int[n];
        this.n = 0;
    }

    Introsort(int[] a) {
        this.a = a;
        n = a.length;
    }

    Introsort() {

    }

    void dataAppend(int temp) {
        a[n] = temp;
        n++;
    }

    private void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private void maxHeap(int i, int heapN, int begin) {
        int temp = a[begin + i - 1];
        int child;
        while (i <= heapN / 2) {
            count++;
            child = 2 * i;
            if (child < heapN
                    && a[begin + child - 1] < a[begin + child])
                child++;
            if (temp >= a[begin + child - 1])
                break;
            a[begin + i - 1] = a[begin + child - 1];
            i = child;
        }
        a[begin + i - 1] = temp;
    }

    private void heapify(int begin, int end, int heapN) {
        for (int i = (heapN) / 2; i >= 1; i--) {
            maxHeap(i, heapN, begin);
            count++;
        }
    }

    private void heapSort(int begin, int end) {
        int heapN = end - begin;
        // Строим кучу (переставляем массив)
        this.heapify(begin, end, heapN);
        // один за другим извлекаем элемент из кучи
        for (int i = heapN; i >= 1; i--) {
            count++;
            // Переместить текущий корень в конец
            swap(begin, begin + i);
            // вызываем maxHeap () для уменьшенной кучи
            maxHeap(1, i, begin);
        }
    }

    private void insertionSort(int left, int right) {
        for (int i = left; i <= right; i++) {
            int key = a[i];
            int j = i;
            while (j > left && a[j - 1] > key) {
                count++;
                a[j] = a[j - 1];
                j--;
            }
            a[j] = key;
        }
    }

    private int findPivot(int a1, int b1, int c1) {
        int max = Math.max(Math.max(a[a1], a[b1]), a[c1]);
        int min = Math.min(Math.min(a[a1], a[b1]), a[c1]);
        int median = max ^ min ^ a[a1] ^ a[b1] ^ a[c1];
        if (median == a[a1])
            return a1;
        if (median == a[b1])
            return b1;
        return c1;
    }

    private int partition(int low, int high) {
        int pivot = a[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            count++;
            if (a[j] <= pivot) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return (i + 1);
    }

    private void sortDataUtil(int begin, int end, int depthLimit) {
        count++;
        if (end - begin > 16) {
            if (depthLimit == 0) {
                this.heapSort(begin, end);
                return;
            }
            depthLimit = depthLimit - 1;
            int pivot = findPivot(begin, begin + ((end - begin) / 2) + 1, end);
            swap(pivot, end);
            int p = partition(begin, end);
            sortDataUtil(begin, p - 1, depthLimit);
            sortDataUtil(p + 1, end, depthLimit);
        }
        else {
            insertionSort(begin, end);
        }
    }
    void sortData() {
        int depthLimit = (int)(2 * Math.floor(Math.log(n) / Math.log(2)));
        this.sortDataUtil(0, n - 1, depthLimit);
    }

    public void giveInfoAboutTime() throws IOException {
        FileReader in = new FileReader("Input.txt");
        FileWriter out = new FileWriter("Output.txt");
        Scanner scan = new Scanner(in);
        int a = 0;
        while (scan.hasNextLine()) {
            a++;
            String line = scan.nextLine();
            String[] str = line.split(" ");
            int[] mas = new int[str.length];
            Introsort arr = new Introsort(str.length);
            for (int i = 0; i < str.length; i++) {
                mas[i] = Integer.parseInt(str[i]);
                arr.dataAppend(mas[i]);
            }
            long t1 = System.nanoTime();
            arr.sortData();
            long t2 = System.nanoTime();
            out.write(a + " - ");
            out.write(mas.length + ("               "));
            out.write((int) (t2 - t1) + "    ");
            out.write(arr.getCount() + "\n");
            arr.setCount(0);
        }
        in.close();
        out.close();
    }

    public void sort() throws IOException {
        FileReader in = new FileReader("Input.txt");
        FileWriter out = new FileWriter("ResultOfSort.txt");
        Scanner scan = new Scanner(in);
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] str = line.split(" ");
            int[] mas = new int[str.length];
            Introsort arr = new Introsort(str.length);
            for (int i = 0; i < str.length; i++) {
                mas[i] = Integer.parseInt(str[i]);
                arr.dataAppend(mas[i]);
            }
            arr.sortData();
            int[] result = arr.getA();
            out.write(Arrays.toString(result));
            out.write("\n");
        }
        in.close();
        out.close();
    }


    void printData() {
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
