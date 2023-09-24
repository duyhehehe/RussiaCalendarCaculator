import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCase2 {
    @Test
    public void test1() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1600, -5);
        });
    }

    @Test
    public void test2() {
        assertThrows(IllegalArgumentException.class, () -> {
            assertEquals("13-09-1803", RussiaCalendarCalculator.calculateNthDay(1600, 78));
        });    }

    @Test
    public void test3() {
        assertThrows(IllegalArgumentException.class, () -> {
            assertEquals("13-09-1803", RussiaCalendarCalculator.calculateNthDay(1600, 360));
        });
    }

    @Test
    public void test4() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1599, 366);
        });
    }

    @Test
    public void test5() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1600, 367);
        });
    }

    @Test
    public void test6() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1700, -1);
        });
    }

    @Test
    public void test7() {
        assertEquals("15-12-1704", RussiaCalendarCalculator.calculateNthDay(1704, 350));
    }

    @Test
    public void test8() {
        assertEquals("25-12-1708", RussiaCalendarCalculator.calculateNthDay(1708, 360));
    }

    @Test
    public void test9() {
        assertEquals("31-12-1712", RussiaCalendarCalculator.calculateNthDay(1712, 366));

    }

    @Test
    public void test10() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1800, 367);
        });
    }

    @Test
    public void test11() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1701, -10);
        });
    }

    @Test
    public void test12() {
        assertEquals("01-03-1709", RussiaCalendarCalculator.calculateNthDay(1709, 60));
    }

    @Test
    public void test13() {
        assertEquals("21-12-1711", RussiaCalendarCalculator.calculateNthDay(1711, 355));
    }

    @Test
    public void test14() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1801, 366);
        });
    }

    @Test
    public void test15() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1809, 380);
        });
    }

    @Test
    public void test16() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1920, -17);
        });
    }

    @Test
    public void test17() {
        assertEquals("29-02-1940", RussiaCalendarCalculator.calculateNthDay(1940, 60));
    }

    @Test
    public void test18() {
        assertEquals("30-12-1948", RussiaCalendarCalculator.calculateNthDay(1948, 365));
    }

    @Test
    public void test19() {
        assertEquals("31-12-1956", RussiaCalendarCalculator.calculateNthDay(1956, 366));
    }

    @Test
    public void test20() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1972, 378);
        });
    }

    @Test
    public void test21() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1001, -1);
        });
    }

    @Test
    public void test22() {
        assertEquals("01-03-2001", RussiaCalendarCalculator.calculateNthDay(2001, 60));
    }

    @Test
    public void test23() {
        assertEquals("26-12-2005", RussiaCalendarCalculator.calculateNthDay(2005, 360));
    }

    @Test
    public void test24() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(2007, 366);
        });
    }

    @Test
    public void test25() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(2125, 399);
        });
    }

    @Test
    public void test26() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(3001, 0);
        });
    }

    @Test
    public void test27() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(3002, 90);
        });
    }

    @Test
    public void test28() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(3005, 358);
        });
    }

    @Test
    public void test29() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(4000, 366);
        });
    }

    @Test
    public void test30() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(6000, 400);
        });
    }
}
