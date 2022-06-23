package src.task1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1 {
    private String day;
    private String month;
    private String year;

   public void getDayOfWeek(String day, String month, String year){
        String date = day + "." + month + "." + year;

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");     // Переводим строку в дату
        Date dayWeek = null;
        try {
            dayWeek = format.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(new SimpleDateFormat("EEEE").format(dayWeek));
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
