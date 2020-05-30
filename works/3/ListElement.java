public class ListElement<T> {
    private T value;
    private ListElement<T> next;

    public ListElement(T value) {
        this.value = value;
        next = null;
    }

    public T getValue() {
        return value;
    }

    public ListElement<T> getNext() {
        return next;
    }

    public void setNext(ListElement<T> next) {
        this.next = next;
    }

    public void setValue(T value) { this.value = value; }

    @Override
    public String toString() {
        return "Value : " + value;
    }
}
