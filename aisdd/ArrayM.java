public class ArrayM<K,V> {
    public static final int DEFAULT_CAPACITY = 1000;

    private Object[] arr;
    private int size = 0;
    private int d = 0;

    public ArrayM(int diapason) {
        d = diapason;
        arr = new Object[diapason];
    }

    public ArrayM() {
        this(DEFAULT_CAPACITY);
    }

    public int getSize(){
        return size;
    }

    public boolean isValidKey(K key){
        int k = (int) key;
        return k > 0 && k < d;
    }

    public V get(K key){
        int intKey = (int) key;
        if (isValidKey(key)){
            return (V) arr[intKey];
        }
        return null;
    }

    public void put(K key, V value){
        int k = (int) key;
        if (isValidKey(key)){
            if (arr[k] == null){
                size++;
            }
            arr[k] = value;
        }
    }
}
