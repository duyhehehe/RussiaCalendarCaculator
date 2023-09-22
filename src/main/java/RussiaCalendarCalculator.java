import java.text.SimpleDateFormat;
import java.util.Date;

public class RussiaCalendarCalculator {

    public static String calculateNthDay(int year, int n) {
        int daysInYear = getDaysInYear(year);

        if (n < 1 || n > daysInYear) {
            throw new IllegalArgumentException("N must be between 1 and " + daysInYear + ".");
        }

        if (year < 1700) {
            throw new IllegalArgumentException("Year must be greater than 1700.");
        }

        // Calculate the month and day for the nth day of the year
        int month = 0;
        int day = 0;

        for (month = 1; month <= 12; month++) {
            int daysInMonth = getDaysInMonth(year, month);

            if (n <= daysInMonth) {
                day = n;
                break;
            } else {
                n -= daysInMonth;
            }
        }

        // Format the result in "dd-MM-yyyy" format
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date(year - 1900, month - 1, day); // Year offset from 1900
        return sdf.format(date);
    }

    private static int getDaysInYear(int year) {
        boolean isLeapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
        int daysInYear = 0;

        if (year == 1918) {
            daysInYear = 352;
        } else {
            if (isLeapYear) {
                daysInYear = 366;
            } else {
                daysInYear = 365;
            }
        }
        return daysInYear;
    }

    public static int getDaysInMonth(int year, int month) {
        int[] daysInMonth = new int[12];
        if (year == 1918) {
            daysInMonth = new int[]{31, 15, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        } else {
            daysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        }
        if (month == 2 && ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))) {
            return 29; // February in a leap year
        } else {
            return daysInMonth[month - 1];
        }
    }

    public static void main(String[] args) {
        int year = 2124;
        int n = 366; // Calculate the 256th day of the year 1918

        String result = calculateNthDay(year, n);
        System.out.println("The " + n + "-th day of the year " + year + " in the Russian calendar is: " + result);
    }
}
