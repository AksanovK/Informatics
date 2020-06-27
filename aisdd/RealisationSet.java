
public class RealisationSet<T> {
    protected List<T> list;

    public RealisationSet() {
        list = new List<>();
    }

    public void add(T value) {
        if (!contains(value)) {
            list.add(value);
        }
    }

    public int size() {
        return list.size();
    }

    public boolean contains(T value) {
        ListElement<T> elem = new ListElement<>(value);
        ListElement<T> elem2 = list.getHead();
        while (elem2 != null) {
            if (elem2 == elem) return true;
            elem2 = elem2.getNext();
        }
        return false;
    }
}
