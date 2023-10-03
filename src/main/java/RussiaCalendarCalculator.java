import java.text.SimpleDateFormat;
import java.util.Date;

public class RussiaCalendarCalculator {

    public static String calculateNthDay(int year, int n) {
        int daysInYear = getDaysInYear(year);

        if (n < 1 || n > daysInYear) {
            throw new IllegalArgumentException("n must be between 1 and " + daysInYear + ".");
        }

        if (year < 1700 || year > 3000) {
            throw new IllegalArgumentException("year must be between 1700 and 3000.");
        }
        int month;
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

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date(year - 1900, month - 1, day); // Year offset from 1900
        return sdf.format(date);
    }

    public static int getDaysInYear(int year) {
        boolean isLeapYear = isLeapYear(year);

        if (year == 1918) {
            return 352;
        } else {
            if (isLeapYear) {
                return 366;
            } else {
                return 365;
            }
        }
    }

    public static boolean isLeapYear(int year) {
        if (year == 1918) {
            return false;
        } else if (year < 1918) {
            return year % 4 == 0;
        } else {
            return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
        }
    }

    public static int getDaysInMonth(int year, int month) {
        int[] daysInMonth;
        boolean isLeapYear = isLeapYear(year);
        if (year == 1918) {
            daysInMonth = new int[]{31, 15, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        } else {
            daysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        }
        if (month == 2 && isLeapYear) {
            return 29;
        } else {
            return daysInMonth[month - 1];
        }
    }

    public static void main(String[] args) {
        int year = 1800;
        int n = 256;

        String result = calculateNthDay(year, n);
        System.out.println("The " + n + "-th day of the year " + year + " in the Russian calendar is: " + result);
    }
}
