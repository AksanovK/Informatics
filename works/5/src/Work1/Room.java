package Work1;

import java.util.StringTokenizer;

public class Room {
    private String name;
    private int id;

    Room(String roomLine) {
        StringTokenizer st = new StringTokenizer(roomLine);
        this.name = st.nextToken();
        this.id = Integer.parseInt(st.nextToken());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
