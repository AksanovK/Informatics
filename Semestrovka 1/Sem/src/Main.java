import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество вершин и рёбер");
        int n = scan.nextInt();
        int m = scan.nextInt();

        System.out.println("Заполните матрицу инцидентности");
        int[][] mat = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                 mat[i][j] = scan.nextInt();
            }
        }

        GraphCode code = new GraphCode(mat);
        NewListElement<Ribs> elem4 = code.getList().getHead();
        while (elem4 != null) {
            System.out.println(elem4.getValue().getRib0() + " " + elem4.getValue().getRib1());
            elem4 = elem4.getNext();
        }

        System.out.println("Результат работы getMI");
        int[][] mat2 = code.getMI();
        for(int i = 0; i < code.getPeaks(); i++) {
            for(int j = 0; j < code.getList().size(); j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }



         System.out.println("Введите номера вершин для вставки ребра");
        int v1 = scan.nextInt();
        int v2 = scan.nextInt();
        code.insert(v1,v2);
        System.out.println("Результат");
        NewListElement<Ribs> elem2 = code.getList().getHead();
        while (elem2 != null) {
            System.out.println(elem2.getValue().getRib0() + " " + elem2.getValue().getRib1());
            elem2 = elem2.getNext();
        }

         System.out.println("Введите номера вершин для удаления ребра");
        int m1 = scan.nextInt();
        int m2 = scan.nextInt();
        code.delete(m1,m2);
        System.out.println("Результат");
        NewListElement<Ribs> elem3 = code.getList().getHead();
        while (elem3 != null) {
            System.out.println(elem3.getValue().getRib0() + " " + elem3.getValue().getRib1());
            elem3 = elem3.getNext();
        }

        System.out.println("Введите номер вершины для проверки метода getEdgesWithNode");
        int l = scan.nextInt();
        GraphCode code2 = code.getEdgesWithNode(l);
        System.out.println("Результат:");
        NewListElement<Ribs> elem = code2.getList().getHead();
        while (elem != null) {
            System.out.println(elem.getValue().getRib0() + " " + elem.getValue().getRib1());
            elem = elem.getNext();
        }

        System.out.println("Введите вершину, которую требуется удалить");
        int k = scan.nextInt();
        code.modify(k);
        System.out.println("Результат");
        NewListElement<Ribs> elem1 = code.getList().getHead();
        while (elem1 != null) {
            System.out.println(elem1.getValue().getRib0() + " " + elem1.getValue().getRib1());
            elem1 = elem1.getNext();
        }

        System.out.println("Укажите степень инцидентности");
        int z = scan.nextInt();
        ArrayList<Integer> arr = code.show(z);
        System.out.println("Результат работы метода show");
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
