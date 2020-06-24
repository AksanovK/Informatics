public class NewListElement<T> {
    private T value;
    private NewListElement<T> next;
    public NewListElement(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public void setNext(NewListElement<T> next) {
        this.next = next;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public NewListElement<T> getNext() {
        return next;
    }
}
