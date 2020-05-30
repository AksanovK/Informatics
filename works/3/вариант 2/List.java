package List;

public class List<T extends Student> {
    private ListElement<T> head;

    public List() {}

    public List(ListElement<T> head) {
        this.head = head;
    }

    public List(T value) {
        this.head = new ListElement<T>(value);
    }

    public void setHead(ListElement<T> head) {
        this.head = head;
    }

    public ListElement<T> getHead() {
        return head;
    }
    public void add(ListElement<T> x) {
        ListElement<T> element = head;
        while (element.getNext() != null) {
            element.setNext(element.getNext());
        }
        element.setNext(x);
    }
    public int size() {
        int result = 0;
        ListElement<T> current = head;
        while (current.getNext() != null) {
            result++;
            current = current.getNext();
        }
        return result;
    }
    public void deleteElement(int index) {
        ListElement<T> elem0 = head;
        ListElement<T> elem1 = head.getNext();
        int current = 1;
        List<T> list = new List<T>();
        list.setHead(this.head);
        if (index < list.size()) {
            while (current != index) {
                elem0.setNext(elem0.getNext());
                elem1.setNext(elem1.getNext());
                current++;
            }
            elem0.setNext(elem1.getNext());
        }
    }
    public ListElement<T> get(int index) {
        if ( index < size() ) {
            ListElement<T> elem = head;
            for(int i = 0; i < index; i++) {
                elem = elem.getNext();
            }
            return elem;
        }
        else return null;
    }
    public void joint(List<T> list) {
        ListElement<T> elem = head;
        while (elem.getNext() != null) {
            elem = elem.getNext();
        }
        elem.setNext(list.getHead());
    }
  /*  public ListElement<T> findValue(T x) {
        ListElement<T> current = this.head;
        while (current != null) {
            if(current.getValue() == x) {
                current = current.getNext();
            }
        }
        return current;
    }
   */
  public void insertList(List<T> list, int position) {
      int position1 = list.size();
      ListElement<T> Element1 = list.get(position1);
      ListElement<T> Element2 = this.get(position);
      Element1.setNext(Element2.getNext());
      Element2.setNext(list.getHead());
  }
    public void doExercise(int from, int to){
        int k=0;
        ListElement<T> elem=head;
        while (elem !=null && k<=to){
            if (k>=from){
                elem.getValue().doExercises();
            }
            k++;
            elem=elem.getNext();
        }
    }
    public boolean checkFillonies(){
        ListElement<T> elem=head;
        boolean check=true;
        while (elem!=null && check){
            if (elem.getValue().getExercises()==0){
                check=false;
            }
            elem=elem.getNext();
        }
        return check;
    }
    public boolean checkStop(){
        ListElement<T> elem=head;
        boolean check=true;
        while (elem!=null && check){
            if (elem.getValue().getExercises()<100){
                check=false;
            }
            elem=elem.getNext();
        }
        return check;
    }
}
