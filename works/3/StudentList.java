public class StudentList <T extends Student> {
    private StudentListElement<T> head;
    private StudentListElement<T> tale;
    public void setHead(StudentListElement obj){
        head=obj;
    }
    public void add(T x){
        StudentListElement student=new StudentListElement(x);
        add(student);
    }
    public void add(StudentListElement<T> listElement){
        if (head==null){
            head=listElement;
            tale=listElement;
        }
        tale.setNext(listElement);
        tale=tale.getNext();
    }
    public void doExercise(int from, int to){
        int k=0;
        StudentListElement<T> elem=head;
        while (elem !=null && k<=to){
            if (k>=from){
                elem.getValue().doExercises();
            }
            k++;
            elem=elem.getNext();
        }
    }
    public boolean checkFillonies(){
        StudentListElement<T> elem=head;
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
        StudentListElement<T> elem=head;
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
