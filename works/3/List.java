public class List<T> {
    private ListElement<T> head;

    public List(ListElement<T> head) {
        this.head = head;
    }

    public List(T value) {
        this.head = new ListElement<T>(value);
    }

    public ListElement<T> getHead() {
        return head;
    }

    public int size() {
        ListElement elem = head;
        int count = 0;
        while (elem != null) {
            elem = elem.getNext();
            count++;
        }
        return count;
    }

    public ListElement<T> get(int index) {
        if (index < size()) {
            ListElement<T> elem = head;
            for (int i = 0; i < index; i++) {
                elem = elem.getNext();
            }
            return elem;
        }
        return null;
    }

    public void add(ListElement<T> elem, int index) {
        ListElement<T> element = get(index);
        elem.setNext(element.getNext());
        element.setNext(elem);
    }

    public void add(T value, int index) {
        add(new ListElement<T>(value), index);
    }

    public void push(ListElement<T> element) {
        add(element, size() - 1);
    }

    public void push(T value) {
        push(new ListElement<T>(value));
    }

    private void deleteNextElem(ListElement<T> element) {
        ListElement<T> prev = head;
        ListElement<T> curr = head.getNext();
        while (!(curr.getValue() == element.getValue())) {
            prev = prev.getNext();
            curr = curr.getNext();
        }
        prev = prev.getNext();
        curr = curr.getNext();
        if (curr != null) {
            deleteElement(prev, curr);
        }
    }

    public void deleteNextElem(int index) {
        deleteNextElem(get(index));
    }

    private void deleteElement(ListElement<T> prev, ListElement<T> curr) {
        prev.setNext(curr.getNext());
        curr.setNext(null);
    }

    public void joint(List<T> list) {
        ListElement<T> elem = list.getHead();
        while (elem != null) {
            this.push(new ListElement<T>(elem.getValue()));
            elem = elem.getNext();
        }
    }
    public void insertlist(List<T> list, int position) {
        int position2 = list.size();
        ListElement<T> ELementS = list.get(position2);
        ListElement<T> ElementN = this.get(position);
        ELementS.setNext(ElementN.getNext());
        ElementN.setNext(list.getHead());
    }
    public void add(String line, int position, List<String> el) {
        el.add(line, position);
    }
    public void replace( String str, String str1, List list ) {
        ListElement listElement = head;

    }
}
