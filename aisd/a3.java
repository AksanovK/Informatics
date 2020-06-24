import java.util.Scanner;
import java.util.TreeMap;

public class a3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap<String, Integer> tm = new TreeMap<>();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++){
            int k = scan.nextInt();
            for (int j = 0; j < k; j++){
                String id = scan.next();
                if (tm.containsKey(id)){
                    tm.put(id, tm.get(id) + 1);
                } else {
                    tm.put(id, 1);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        String maxId = "";
        for (String id : tm.keySet()){
            int users = tm.get(id);
            if (users > max){
                maxId = id;
            }
        }
        System.out.println(maxId);
    }
}
