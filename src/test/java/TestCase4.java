import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TestCase4 {
    //isLeapYear
    @Test
    public void test1() {
        assertFalse(RussiaCalendarCalculator.isLeapYear(1918));
    }

    @Test
    public void test2() {
        assertFalse(RussiaCalendarCalculator.isLeapYear(1906));
    }

    @Test
    public void test3() {
        assertFalse(RussiaCalendarCalculator.isLeapYear(1905));
    }

    @Test
    public void test4() {
        assertTrue(RussiaCalendarCalculator.isLeapYear(2000));
    }

    @Test
    public void test5() {
        assertFalse(RussiaCalendarCalculator.isLeapYear(2001));
    }

    //getDaysInMonth
    @Test
    public void test6() {
        assertEquals(29, RussiaCalendarCalculator.getDaysInMonth(2000, 2));
    }

    @Test
    public void test7() {
        assertEquals(30, RussiaCalendarCalculator.getDaysInMonth(1918, 9));
    }

    @Test
    public void test8() {
        assertEquals(30, RussiaCalendarCalculator.getDaysInMonth(2005, 9));
    }

    //getDaysInYear
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
        assertEquals(365, RussiaCalendarCalculator.getDaysInYear(2003));
    }

    //calculateNthDay
    @Test
    public void test12() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(2000, 0);
        });
    }

    @Test
    public void test13() {
        assertEquals("16-01-2003", RussiaCalendarCalculator.calculateNthDay(2003, 16));
    }

    @Test
    public void test14() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1200, 30);
        });
    }

    @Test
    public void test15() {
        assertEquals("09-02-2009", RussiaCalendarCalculator.calculateNthDay(2009, 40));
    }

    @Test
    public void test16() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(2000, 0);
        });
    }

    @Test
    public void test17() {
        assertEquals("26-12-2010", RussiaCalendarCalculator.calculateNthDay(2010, 360));
    }
}
