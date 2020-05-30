package Work1;

import java.util.StringTokenizer;

public class Specialization {
    private String specialization;
    private int id;

    Specialization(String specializationLine) {
        StringTokenizer st = new StringTokenizer(specializationLine);
        this.id = Integer.parseInt(st.nextToken());
        this.specialization = st.nextToken();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
