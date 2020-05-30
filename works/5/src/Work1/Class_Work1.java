package Work1;

import java.io.*;
import java.sql.Time;

public class Class_Work1 {
    public static void main(String[] args) throws IOException {
        BufferedReader timetable = new BufferedReader(new FileReader("D://Врачи.txt"));
        BufferedReader room = new BufferedReader(new FileReader("D://Специализация.txt"));
        BufferedReader doctor = new BufferedReader(new FileReader("D://Расписание приема.txt"));
        BufferedReader specialization = new BufferedReader(new FileReader("D://Кабинет.txt"));
        PrintWriter in = new PrintWriter("D://new.txt");
        String timetabLeline = timetable.readLine();
        String roomLine = room.readLine();
        String doctorLine = doctor.readLine();
        String specializationLine = specialization.readLine();
        while (timetabLeline!=null&&roomLine!=null&&doctorLine!=null&&specializationLine!=null) {
            TimeTable timetableItem = new TimeTable(timetabLeline);
            
        }
    }
}
