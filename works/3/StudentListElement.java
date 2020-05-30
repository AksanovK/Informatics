public class StudentListElement<T extends Student> {
    private T value;
    private StudentListElement next;//link
    StudentListElement(T Student){
        this.value=Student;
    }
    public T getValue(){
        return value;
    }
    public StudentListElement<T> getNext(){
        return next;
    }
    public void setNext(StudentListElement listElement){
        next=listElement;
    }
}
