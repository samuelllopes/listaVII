import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTemperatura {

    @Test
    public void testConversorTemperatura() {
        double tempFahrenheit = 68;
        double tempCelsius = (tempFahrenheit - 32) / 1.8;
        assertEquals(20, tempCelsius);
    }
}
