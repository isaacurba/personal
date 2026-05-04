import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenstrualAppTest {

    @Test
    public void testCalculateOvulationDay() {
        assertEquals(14, MenstrualApp.calculateOvulationDay(28));
    }

    @Test
    public void testCalculateFertileStart() {
        assertEquals(9, MenstrualApp.calculateFertileStart(14));
    }

    @Test
    public void testCalculateFlowEnd() {
        LocalDate start = LocalDate.of(2026, 6, 2);
        LocalDate expected = LocalDate.of(2026, 6, 6);

        assertEquals(expected, MenstrualApp.calculateFlowEnd(start, 5));
    }

    @Test
    public void testCalculateNextFlowDate() {
        LocalDate start = LocalDate.of(2026, 6, 2);
        LocalDate expected = LocalDate.of(2026, 6, 30);

        assertEquals(expected, MenstrualApp.calculateNextFlowDate(start, 28));
    }

    @Test
    public void testCalculateOvulationDate() {
        LocalDate start = LocalDate.of(2026, 6, 2);
        LocalDate expected = LocalDate.of(2026, 6, 16);

        assertEquals(expected, MenstrualApp.calculateOvulationDate(start, 28));
    }


    //    public static LocalDate calculateNextFlowDate(LocalDate startDate, int cycleLength) {
//        return startDate.plusDays(cycleLength);
//    }
}
