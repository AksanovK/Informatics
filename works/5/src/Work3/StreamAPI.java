package Work3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static boolean f(String s){
        return s.contains("a");
    }
    //(s) -> s.length()<=2
    private static boolean filter(String crocodile){
        return crocodile.length()<=2;
    }
    private static boolean filter2(String crocodile, String s){
        return crocodile.length()<=2;
    }

    public static void main(String[] args){
        List<String> a = Arrays.asList("hello", "a", "e",  "a1", "world", "e1", "a", "world");
        long countS = a.stream().filter((crocodile) -> crocodile.length()<=2).count();
        long countO = a.stream().filter((s) -> s.contains("o")).count();
        String result = a.stream().filter((s) -> s.length()>=20).findFirst().orElse("No elements");
        //String resultAny = a.stream().filter((s)->s.length()<=4).findAny().orElse("No elements at all");
        long countAll = a.stream().skip(1).limit(6).filter((s)->s.length()<=2).count();

        List<String> list = a.stream().skip(1).limit(4).filter((s)->s.length()<=2).collect(Collectors.toList());

        boolean allcontainsa = a.stream().skip(1).limit(2).filter((s)->s.length()<=2).allMatch((s) -> s.contains("a"));

        boolean containsa = a.stream().skip(1).limit(2).filter((s)->s.length()<=2).anyMatch((s) -> s.contains("a"));
        boolean containsa1 = a.stream().skip(1).limit(2).filter(StreamAPI::filter).filter((s) -> s.contains("a")).count()>=1;

        String minString =  a.stream().skip(1).limit(4).filter((s)->StreamAPI.filter(s)).min(String::compareTo).orElse("No elements");
        String maxString =  a.stream().skip(1).limit(4).filter(StreamAPI::filter).max(String::compareTo).orElse("No elements");

        List<String> list2 = a.stream().skip(1).limit(4).filter((s)->s.length()<=2).sorted((o1, o2) -> -o1.compareTo(o2)).limit(3).collect(Collectors.toList());
        List<String> list3 = a.stream().skip(1).limit(4).filter((s)->s.length()<=2).sorted().collect(Collectors.toList());

        List<String> list4 = a.stream().distinct().collect(Collectors.toList());
        long countOfDistinctElements = a.stream().distinct().count();
        int count = 0;
        for (String s : a){
            if (s.length()<=2) count++;
        }
        System.out.println("count: "+count + "; countS:" + countS + "; countO:" + countO + "; countAll:" + countAll);
        System.out.println("result:" + result );
        System.out.println("list:" + list);
        System.out.println("containsa:" + containsa);
        System.out.println("allcontainsa:" + allcontainsa);
        System.out.println("minString:" + minString);
        System.out.println("maxString:" + maxString);
        System.out.println("list2:" + list2);
        System.out.println("list3:" + list3);
        System.out.println("list4:" + list4);
        System.out.println("countOfDistinctElements:" + countOfDistinctElements);
    }
}
