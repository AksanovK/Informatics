import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GraphCodeTest {
    private int[][] matrix = { { 1, 0, 0, 1, 0, 0, 0, 0, 0 },
                               { 0, 1, 1, 0, 0, 1, 1, 0, 0 },
                               { 1, 1, 0, 0, 1, 0, 0, 0, 1 },
                               { 0, 0, 0, 0, 0, 1, 0, 1, 1 },
                               { 0, 0, 0, 0, 0, 0, 1, 1, 0 },
                               { 0, 0, 1, 1, 1, 0, 0, 0, 0 } };

    @Test
    public void getMI() {
        GraphCode code = new GraphCode(matrix);
        int[][] actual = code.getMI();
        int[][] expected = this.matrix;
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void insert() {
        GraphCode code = new GraphCode(matrix);
        int i = 5; int j = 6;
        NewList<Ribs> expected = code.getList();
        expected.add(new Ribs(i,j));
        code.insert(i,j);
        NewList<Ribs> actual = code.getList();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void delete() {
        GraphCode code = new GraphCode(matrix);
        int i = 2; int j = 3;
        NewList<Ribs> expected = code.getList();
        expected.deleteElem(2);
        code.delete(i, j);
        NewList<Ribs> actual = code.getList();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void modify() {
        GraphCode code = new GraphCode(matrix);
        int i = 2; int actual = 0;
        code.modify(i);
        NewList<Ribs> list = new NewList<>();
        list.add(new Ribs(1,3));
        list.add(new Ribs(1,6));
        list.add(new Ribs(3,6));
        list.add(new Ribs(4,5));
        list.add(new Ribs(3,4));
        NewListElement<Ribs> elem2 = list.getHead();
        NewListElement<Ribs> elem1 = code.getList().getHead();
        while ((elem1 != null)&&(elem2 != null)) {
            if (Ribs.equality(elem1.getValue(), elem2.getValue())) {
                actual++;
            }
            elem2 = elem2.getNext();
            elem1 = elem1.getNext();
        }
        int expected = code.getList().size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getEdgesWithNode() {
        GraphCode code = new GraphCode(matrix);
        int i = 3; int actual = 0;
        GraphCode code1 = code.getEdgesWithNode(i);
        GraphCode code2 = new GraphCode(); code2.insert(1,3);
        code2.insert(2,3); code2.insert(3,6); code2.insert(3,4);
        NewListElement<Ribs> elem1 = code2.getList().getHead();
        NewListElement<Ribs> elem2 = code1.getList().getHead();
        int expected = code2.getList().size();
        while ((elem1 != null)&&(elem2 != null)) {
            if (Ribs.equality(elem1.getValue(), elem2.getValue())) {
                actual++;
            }
            elem2 = elem2.getNext();
            elem1 = elem1.getNext();
        }
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void show() {
        GraphCode code = new GraphCode(matrix);
        int m = 3;
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2); expected.add(3);
        ArrayList<Integer> actual = code.show(m);
        Assert.assertEquals(expected, actual);
    }
}