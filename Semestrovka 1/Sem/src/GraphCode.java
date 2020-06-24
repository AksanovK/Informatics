import java.util.ArrayList;

public class GraphCode {

    private int peaks;

    public void setPeaks(int peaks) {
        this.peaks = peaks;
    }

    public int getPeaks() {
        return peaks;
    }

    public void setList(NewList<Ribs> list) {
        this.list = list;
    }

    private NewList<Ribs> list = new NewList<>();

    public NewList<Ribs> getList() {
        return list;
    }

    public GraphCode() {}

    public GraphCode(int[][] mi) {
        this.peaks = mi.length;
        int ribs = mi[0].length;
        int r0, r1;
        for(int i = 0; i < ribs; i++) {
            r0 = -1; r1 = -1;
            for (int j = 0; j < peaks; j++) {
                if (mi[j][i] == 1) {
                    if (r0 == -1) {
                        r0 = j + 1;
                    } else {
                        r1 = j + 1;
                        break;
                    }
                }
            }
            Ribs rib = new Ribs(r0,r1);
            NewListElement<Ribs> element = new NewListElement<>(rib);
            if (list.getHead() == null) {
                    list.setHead(element);
            }
            else {
                list.add(rib);
            }
        }
    }

    public int[][] getMI() {
        int edges = list.size();
        int peaks = this.peaks;
        int[][] mat = new int[peaks][edges];
        for (int i = 0; i < peaks; i++) {
            for (int j = 0; j < edges; j++) {
                if ((this.list.get(j).getValue().getRib0() == (i + 1)) || (this.list.get(j).getValue().getRib1() == (i + 1))) {
                    mat[i][j] = 1;
                }
            }
        }
        return mat;
    }


    public void insert(int i, int j) {
        int count = 0;
        NewListElement<Ribs> elem = list.getHead();
        while(elem != null) {
            if ((elem.getValue().getRib0() != i)&&(elem.getValue().getRib1() != j)&&(elem.getValue().getRib1() != i)&&
                    (elem.getValue().getRib0() != j)) {
                count++;
            }
            elem = elem.getNext();
        }
        if (count == list.size()) {
            peaks++;
        }
        list.add(new Ribs(i, j));
    }

    public void delete(int i, int j) {
        int ded = 0;
        NewListElement<Ribs> elem = list.getHead();
        while ((((elem.getValue().getRib0() != i)&&(elem.getValue().getRib1() != i))
                ||((elem.getValue().getRib0() != j)&&(elem.getValue().getRib1() !=j)))) {
            ded++;
            elem = elem.getNext();
        }
        list.deleteElem(ded);
    }

    public void modify(int i) {
        int count = 0;
        NewListElement<Ribs> head2 = list.getHead();
        while (head2 != null) {
            if ((head2.getValue().getRib1() == i)||(head2.getValue().getRib0() == i)) {
                list.deleteElem(count);
            }
            else {
                count++;
            }
            head2 = head2.getNext();
        }
        peaks--;
    }

    public GraphCode getEdgesWithNode(int i) {
       GraphCode graph = new GraphCode();
       int count = 0;
       NewListElement<Ribs> elem = list.getHead();
       while (elem != null) {
           if ((elem.getValue().getRib0() == i)||(elem.getValue().getRib1() == i)) {
               graph.insert(elem.getValue().getRib0(),elem.getValue().getRib1());
               count++;
           }
           elem = elem.getNext();
       }
       graph.setPeaks(count);
       return graph;
    }

    public ArrayList<Integer> show(int m) {
        ArrayList<Integer> array = new ArrayList<>();
        int[][] mat = getMI();
        int count;
        for(int i = 0; i < peaks; i++) {
        count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (mat[i][j] == 1) {
                       count++;
                }
            }
            if (count > m) {
                array.add(i+1);
            }
        }
        return array;
    }
}




