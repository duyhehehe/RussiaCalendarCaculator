import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TestCase3 {
    // isLeapYear
    @Test
    public void test1() {
        assertFalse(RussiaCalendarCalculator.isLeapYear(1918));
    }

    @Test
    public void test2() {
        assertTrue(RussiaCalendarCalculator.isLeapYear(1916));
    }

    @Test
    public void test3() {
        assertFalse(RussiaCalendarCalculator.isLeapYear(1917));
    }

    @Test
    public void test4() {
        assertTrue(RussiaCalendarCalculator.isLeapYear(2000));
    }

    @Test
    public void test5() {
        assertFalse(RussiaCalendarCalculator.isLeapYear(2001));
    }

    // getDaysInMonth
    @Test
    public void test6() {
        assertEquals(15, RussiaCalendarCalculator.getDaysInMonth(1918, 2));
    }

    @Test
    public void test7() {
        assertEquals(29, RussiaCalendarCalculator.getDaysInMonth(1916, 2));
    }

    @Test
    public void test8() {
        assertEquals(31, RussiaCalendarCalculator.getDaysInMonth(1919, 3));
    }

    // getDaysInYear
    @Test
    public void test9() {
        assertEquals(352, RussiaCalendarCalculator.getDaysInYear(1918));
    }

    @Test
    public void test10() {
        assertEquals(366, RussiaCalendarCalculator.getDaysInYear(2004));
    }

    @Test
    public void test11() {
        assertEquals(365, RussiaCalendarCalculator.getDaysInYear(2005));
    }

    // calculateNthDay
    @Test
    public void test12() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(2000, -1);
        });
    }

    @Test
    public void test13() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(3002, 20);
        });
    }

    @Test
    public void test14() {
        assertEquals("15-01-2009", RussiaCalendarCalculator.calculateNthDay(2009, 15));
    }

    @Test
    public void test15() {
        assertEquals("05-02-2015", RussiaCalendarCalculator.calculateNthDay(2015, 36));
    }
}


