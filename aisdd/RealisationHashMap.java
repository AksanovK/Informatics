

public class RealisationHashMap<K,V> {
    public static final int MAX_HASH = 1000;

    private ArrayM<Integer, ListM<K, V>> map = new ArrayM<>(MAX_HASH);
    private int size = 0;

    public int getSize(){
        return size;
    }

    public boolean isValidKey(K key){
        int k = key.hashCode() % MAX_HASH;
        return k > 0;
    }

    public ListM<K,V> get (K key){
        int code = key.hashCode() % MAX_HASH;
        if (isValidKey(key)){
            return map.get(code);
        }
        return null;
    }

    public void put (K key, V value){
        int code = key.hashCode() % MAX_HASH;
        ListM<K, V> elem = map.get(code);
        if (elem == null || elem.size() == 0){
            elem = new ListM<>();
            size++;
        }
        elem.put(key, value);
        map.put(code, elem);
    }
}
