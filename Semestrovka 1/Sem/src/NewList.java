public class NewList<T> {
    private NewListElement<T> head;

    public NewList() {
    }

    public NewListElement<T> getHead() {
        return head;
    }

    public void setHead(NewListElement<T> elem){
        head = elem;
    }

    public int size() {
        NewListElement elem = head;
        int count = 0;
        while (elem != null) {
            elem = elem.getNext();
            count++;
        }
        return count;
    }

    public NewListElement<T> get(int index) {
        if (index < size()) {
            NewListElement<T> elem = head;
            for (int i = 0; i < index; i++) {
                elem = elem.getNext();
            }
            return elem;
        }
        else {
            return null;
        }
    }

    public void add(T x) {
        NewListElement<T> elem = new NewListElement<>(x);
        if (size() == 0) {
            head = new NewListElement<>(x);
        }
        else {
            NewListElement<T> elem1 = head;
            while(elem1.getNext() != null) {
                elem1 = elem1.getNext();
            }
            elem1.setNext(elem);
        }
    }

    public void deleteElem(int index) {
        NewListElement<T> elem2 = get(index);
        if (elem2 == head) {
            head = head.getNext();
        }
        else {
            NewListElement<T> elem1 = get(index - 1);
            elem1.setNext(elem2.getNext());
        }
    }
}
