package homework.arrays;

public class NextDayCalendar {


    public static void printNextDay(int day, int month, int year) {
        int[] dayInMoths = {28, 30, 31, 30, 30, 31, 31, 30, 31, 30, 31, 30};

        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        if (day == dayInMoths[month]) {
            nextDay= 1;
            if (month == 11) {
                nextMonth = 1;
                nextYear++;
            } else {
                nextMonth++;
            }
        } else {
            nextDay++;
        }
        System.out.println(nextDay + " " + nextMonth + " " + nextYear);
    }
}
