package Work1;

import java.util.StringTokenizer;

public class TimeTable {
    private String time;
    private int doctorId;
    private int roomId;
    public TimeTable(String timetableLine) {
        StringTokenizer st = new StringTokenizer(timetableLine);
        this.doctorId = Integer.parseInt(st.nextToken());
        this.roomId = Integer.parseInt(st.nextToken());
        time = st.nextToken();
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
