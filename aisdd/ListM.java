public class ListM<K,V> {
    private List<ListMEl<K,V>> mapList = new List<>();

    public V get (K key){
        ListMEl<K, V> item = find(key);
        if (item == null){
            return null;
        }
        return item.getValue();
    }

    public int size() {
        ListElement<ListMEl<K,V>> item = mapList.getHead();
        int count = 0;
        while (item != null){
            ListMEl<K,V> listMapItem = item.getValue();
            if (listMapItem.getKey() != null && listMapItem.getValue() != null){
                count++;
            }
            item = item.getNext();
        }
        return count;
    }

    public ListMEl<K,V> find (K key){
        ListElement<ListMEl<K,V>> item = mapList.getHead();
        while (item != null){
            ListMEl<K,V> listMapItem = item.getValue();
            if (listMapItem.getKey().equals(key)){
                return listMapItem;
            }
            item = item.getNext();
        }
        return null;
    }

    public void put(K key, V value){
        ListElement<ListMEl<K,V>> item = mapList.getHead();
        boolean isChanged = false;
        while (item != null) {
            ListMEl<K,V> listMapItem = item.getValue();
            if (listMapItem.getKey().equals(key)){
                listMapItem.setValue(value);
                isChanged = true;
            }
            item = item.getNext();
        }
        if (!isChanged){
            mapList.push(new ListMEl<>(key, value));
        }
    }
}
