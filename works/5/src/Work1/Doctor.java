package Work1;

import java.util.StringTokenizer;

public class Doctor {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private int specialization;

    Doctor(String doctorLine) {
        StringTokenizer st = new StringTokenizer(doctorLine);
        this.id = Integer.parseInt(st.nextToken());
        this.name = st.nextToken();
        this.surname = st.nextToken();
        this.specialization = Integer.parseInt(st.nextToken());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpecialization() {
        return specialization;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSpecialization(int specialization) {
        this.specialization = specialization;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
