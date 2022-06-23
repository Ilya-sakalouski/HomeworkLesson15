package src.task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Task2 {
    public static void getTuesdayDate(){
        int dayOfWeek = 3;                                           // Tuesday
        Calendar now = Calendar.getInstance();
        int weekday = now.get(Calendar.DAY_OF_WEEK);

        int days = (Calendar.SATURDAY - weekday + dayOfWeek) % 7;    // calculate how much to add
        now.add(Calendar.DAY_OF_YEAR, days);

        Date date = now.getTime();
        String yourDate = new SimpleDateFormat("E dd.MM.yyyy").format(date);
        System.out.println("yourDate -> " + yourDate);
    }
}
