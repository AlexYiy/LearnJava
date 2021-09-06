import java.util.Scanner;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
    }
}

class MyDate {
    public int year;
    public int month;
    public int day;
    HashMap<Integer, Integer> monthDay = new HashMap<Integer, Integer>();
    monthDay.put(1, 31);
    monthDay.put(3, 31);
    monthDay.put(5, 31);
    monthDay.put(7, 31);
    monthDay.put(8, 31);
    monthDay.put(10, 31);
    monthDay.put(12, 31);
    public MyDate(int year, int month, int day) throws Exception {
        if (year < 1 || year > 9999) {
            throw new IllegalArgumentException("year error");
        }
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("month error");
        }
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("day error");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public static int sub (MyDate d1, MyDate d2) {
        int daysFromMonth;
        if (d1.month == 2) {
            if (d1.year%4) {
                daysFromMonth = 28
            } else {
                // TODO
            }
        }
         = monthDay.getOrDefault(d1.month, 30);
        d1.year * 365 + d1.month 
    }
}

