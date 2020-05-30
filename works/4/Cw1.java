package ClassWork;

import java.util.*;

public class Cw1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> map = new HashMap<>();
        int m = scan.nextInt();
        for (int i = 0; i < m; i++) {
            String name = scan.next();
            String value = scan.next();
            if (!map.containsKey(name)) {
                map.put(name, new ArrayList<>());
            }
            List<String> list1 = map.get(name);
            list1.add(value);
        }
        for (String key : map.keySet()) {
            System.out.print(key + "" );
            List<String> list2 = map.get(key);
            for (int i = 0; i < list2.size(); i++) {
                System.out.println(list2.get(i));
                if ( i != list2.size() - 1) {
                    System.out.println(",");
                }
            }
            System.out.println();
        }
    }
}
