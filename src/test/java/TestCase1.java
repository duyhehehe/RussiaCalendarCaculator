import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TestCase1 {
    @Test
    public void test1() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1699, -1);
        });
    }

    @Test
    public void test2() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1699, 100);
        });
    }

    @Test
    public void test3() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1699, 360);
        });
    }

    @Test
    public void test4() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1699, 366);
        });
    }

    @Test
    public void test5() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1699, 1000);
        });
    }

    @Test
    public void test6() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1905, -1);
        });
    }

    @Test
    public void test7() {
        assertEquals("13-09-1803", RussiaCalendarCalculator.calculateNthDay(1803, 256));
    }

    @Test
    public void test8() {
        assertEquals("26-12-1807", RussiaCalendarCalculator.calculateNthDay(1807, 360));
    }

    @Test
    public void test9() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1705, 366);
        });
    }

    @Test
    public void test10() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1807, 400);
        });
    }

    @Test
    public void test11() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1704, -10);
        });
    }

    @Test
    public void test12() {
        assertEquals("12-09-1800", RussiaCalendarCalculator.calculateNthDay(1800, 256));
    }

    @Test
    public void test13() {
        assertEquals("25-12-1900", RussiaCalendarCalculator.calculateNthDay(1900, 360));
    }

    @Test
    public void test14() {
        assertEquals("31-12-1904", RussiaCalendarCalculator.calculateNthDay(1904, 366));
    }

    @Test
    public void test15() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1908, 500);
        });
    }

    @Test
    public void test16() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1918, -9);
        });
    }

    @Test
    public void test17() {
        assertEquals("26-09-1918", RussiaCalendarCalculator.calculateNthDay(1918, 256));
    }

    @Test
    public void test18() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1918, 360);
        });
    }

    @Test
    public void test19() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1918, 366);
        });
    }

    @Test
    public void test20() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1918, 387);
        });
    }

    @Test
    public void test21() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(2011, -8);
        });
    }

    @Test
    public void test22() {
        assertEquals("15-04-2023", RussiaCalendarCalculator.calculateNthDay(2023, 105));
    }

    @Test
    public void test23() {
        assertEquals("24-12-2029", RussiaCalendarCalculator.calculateNthDay(2029, 358));
    }

    @Test
    public void test24() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1919, 366);
        });
    }

    @Test
    public void test25() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1915, 405);
        });
    }

    @Test
    public void test26() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(1920, -6);
        });
    }

    @Test
    public void test27() {
        assertEquals("18-07-2020", RussiaCalendarCalculator.calculateNthDay(2020, 200));
    }

    @Test
    public void test28() {
        assertEquals("23-12-2024", RussiaCalendarCalculator.calculateNthDay(2024, 358));
    }

    @Test
    public void test29() {
        assertEquals("31-12-2124", RussiaCalendarCalculator.calculateNthDay(2124, 366));
    }

    @Test
    public void test30() {
        assertThrows(IllegalArgumentException.class, () -> {
            RussiaCalendarCalculator.calculateNthDay(2024, 900);
        });
    }
}
