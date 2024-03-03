package demo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayOfWeekFinder {
    public static void main(String[] args) {
        String dateStr = "21/09/2023"; // Replace with your date in DD/MM/YYYY format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateStr, formatter);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        
        System.out.println("Date: " + dateStr);
        System.out.println("Day of the week: " + dayOfWeek.toString());
    }
}
//Replace "21/09/2023" with the date you want to check in the "DD/MM/YYYY" format. When you run this program, it will parse the input date, find the day of the week, and print it to the console.






